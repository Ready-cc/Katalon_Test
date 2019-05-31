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

WebUI.navigateToUrl('https://gwy-wbs241.newtamp.cn/market/expert/create/view')

WebUI.sendKeys(findTestObject('P_Gwy/P_Expert/P_Expert_Add/Expert_Add_Input_Name'), 'Expert-ccf')

WebUI.click(findTestObject('P_Gwy/P_Expert/P_Expert_Add/Expert_Add_Click_Domain'))

WebUI.click(findTestObject('P_Gwy/P_Expert/P_Expert_Add/Expert_Add_Domain_Select'))

WebUI.click(findTestObject('P_Gwy/P_Expert/P_Expert_Add/Expert_Add_Domain_Commit'))

WebUI.uploadFile(findTestObject('P_Gwy/P_Expert/P_Expert_Add/Expert_Add_File_Image'), '/图片/对.jpg')

WebUI.sendKeys(findTestObject('P_Gwy/P_Expert/P_Expert_Add/Expert_Add_Textarea'), '简介')

WebUI.click(findTestObject('P_Gwy/P_Expert/P_Expert_Add/Expert_Add_Btn_Commit'))

WebUI.verifyElementPresent(findTestObject('P_Gwy/P_Expert/P_Expert_View/Expert_Add_Btn'), 2, FailureHandling.CONTINUE_ON_FAILURE)

