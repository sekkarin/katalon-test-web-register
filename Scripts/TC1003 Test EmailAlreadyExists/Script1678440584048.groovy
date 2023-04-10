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

WebUI.navigateToUrl('https://lms.thaimooc.org/courses')

WebUI.setViewPortSize(1312, 658)

WebUI.click(findTestObject('Object Repository/Page_Thai MOOCLMS/a_'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to Thai MOOC/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to Thai MOOC/input__username'), 'kennnnnn')

WebUI.click(findTestObject('Object Repository/Page_Sign in to Thai MOOC/form_Username                         Notic_3cc1f1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to Thai MOOC/input__password'), 'RigbBhfdqOBDK95asqKeHw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to Thai MOOC/input__password-confirm'), 'RigbBhfdqOBDK95asqKeHw==')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to Thai MOOC/input__email'), 'sekkri1234@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to Thai MOOC/input_Back to Sign in_btn btn-primary btn-b_42ba6d'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to Thai MOOC/div_Please specify first name.Please specif_a0df09'))

WebUI.verifyTextPresent('Email already exists.', false)

WebUI.closeBrowser()

