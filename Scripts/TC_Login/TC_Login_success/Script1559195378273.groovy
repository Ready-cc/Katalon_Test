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

WebUI.openBrowser('https://service-wbs242.newtamp.cn/')

WebUI.setText(findTestObject('P_Service/P_login/P_login_name'), '18888888888')

WebUI.setText(findTestObject('P_Service/P_login/P_login_password'), 'a111111')

WebUI.click(findTestObject('P_Service/P_login/P_login_btn'))

WebUI.verifyElementPresent(findTestObject('P_Service/P_dashboard/P_dashboard_zzjg'), 2, FailureHandling.CONTINUE_ON_FAILURE)

