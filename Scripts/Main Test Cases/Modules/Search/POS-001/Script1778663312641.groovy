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

WebUI.navigateToUrl('https://pos.bling.my.id/')

WebUI.setText(findTestObject('Page_Menu/Search/Page_KedaiKopi  Login/input_Username'), 'order@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Menu/Search/Page_KedaiKopi  Login/input__'), 'CEuORLdR8aA=')

WebUI.click(findTestObject('Page_Menu/Search/Page_KedaiKopi  Login/button_Login'))

WebUI.click(findTestObject('Page_Menu/Search/Page_Create Next App/button_Access Dashboard'))

WebUI.click(findTestObject('Page_Menu/Search/Page_KedaiKopi  Dashboard/span_Order'))

WebUI.setText(findTestObject('Page_Menu/Search/Page_KedaiKopi  Order Management/input_Search'), 'WPUCAFE0018')

WebUI.click(findTestObject('Page_Menu/Search/Page_KedaiKopi  Order Management/input_Search'))

WebUI.click(findTestObject('Page_Menu/Search/Page_KedaiKopi  Order Management/td_No Result Data'))

WebUI.closeBrowser()

