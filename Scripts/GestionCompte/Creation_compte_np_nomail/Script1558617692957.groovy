import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demowebshop.tricentis.com/')

WebUI.click(findTestObject('Object Repository/demo_shop/a_Register'))

WebUI.click(findTestObject('Object Repository/demo_shop/input_Gender_Gender'))

WebUI.setText(findTestObject('Object Repository/demo_shop/input_First name_FirstName'), 'Bart')

WebUI.setText(findTestObject('Object Repository/demo_shop/input_Last name_LastName'), 'Prout')

WebUI.setText(findTestObject('Object Repository/demo_shop/input_Email_Email'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/demo_shop/input_Password_Password'), '7hWgzki6p2TSj7fH1Rb3uQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/demo_shop/input_Confirm password_ConfirmPassword'), '7hWgzki6p2TSj7fH1Rb3uQ==')

WebUI.click(findTestObject('Object Repository/demo_shop/input__register-button'))

WebUI.verifyElementPresent(findTestObject('demo_shop/span_Email is required.'), 0)

WebUI.verifyElementText(findTestObject('demo_shop/span_Email is required.'), 'Email is required.')

WebUI.takeScreenshot()

WebUI.closeBrowser()

