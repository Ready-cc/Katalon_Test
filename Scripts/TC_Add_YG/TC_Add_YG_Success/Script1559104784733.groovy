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

def mobile = findTestData('XZ_YG_DATA').getValue(1, 1)

def id_no = findTestData('XZ_YG_DATA').getValue(2, 1)
//def mobile = findTestData('null').getValue(1, 1)
//
//def id_no = findTestData('null').getValue(2, 1)

WebUI.waitForElementPresent(findTestObject('P_Service/P_dashboard/P_dashboard_zzjg'), 0)

WebUI.click(findTestObject('P_Service/P_dashboard/P_dashboard_zzjg'))

if (WebUI.verifyElementPresent(findTestObject('P_Service/P_organization/P_organization_xz/XZYG_Alert'), 1)) {
    
    WebUI.click(findTestObject('P_Service/P_organization/P_organization_xz/XZYG_Alert_btn_qd'))
}

WebUI.waitForElementPresent(findTestObject('P_Service/P_dashboard/P_dashboard_yggl'), 1)

WebUI.click(findTestObject('P_Service/P_dashboard/P_dashboard_yggl'))

WebUI.waitForElementPresent(findTestObject('P_Service/P_organization/P_organization_view/P_organization_xzyg'), 1)

WebUI.scrollToElement(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_click_zjlx'), 1)

WebUI.click(findTestObject('P_Service/P_organization/P_organization_view/P_organization_xzyg'))

WebUI.sendKeys(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_input_ygxm'), 'testccf')

WebUI.click(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_bm'))

WebUI.click(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_bm_xz'))

WebUI.click(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_bm_btn_qr'))

WebUI.sendKeys(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_input_mobile'), mobile)

WebUI.click(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_click_zjlx'))

WebUI.click(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_select_zjlx'))

WebUI.sendKeys(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_input_zjhm'), id_no)

WebUI.click(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_click_zw'))

WebUI.click(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_select_zw'))

WebUI.click(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_click_date'))

WebUI.click(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_select_date'))

WebUI.scrollToElement(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_click_xl'), 1)

WebUI.click(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_click_xl'))

WebUI.click(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_select_xl'))

WebUI.click(findTestObject('P_Service/P_organization/P_organization_xz/P_organization_xz_btn_qr'))

WebUI.verifyElementPresent(findTestObject('P_Service/P_organization/P_organization_view/P_organization_xzyg'), 3, FailureHandling.CONTINUE_ON_FAILURE)

