import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('CheckLoginWithSuperadminAccount'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Online Tutor  Demo Biology/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Online Tutor  Admin/span_admin_fas fa-chalkboard-teacher'))

WebUI.setText(findTestObject('Object Repository/Page_Online Tutor  courses/input__MuiOutlinedInput-input MuiInputBase-_cadc94'), 
    '17')

WebUI.click(findTestObject('Object Repository/Page_Online Tutor  courses/button_Search'))

WebUI.click(findTestObject('Page_Online Tutor  courses/button_English_MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk'))

WebUI.callTestCase(findTestCase('CheckLogout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

