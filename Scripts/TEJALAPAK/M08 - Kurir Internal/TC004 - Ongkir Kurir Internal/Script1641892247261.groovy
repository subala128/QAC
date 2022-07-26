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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://202.159.35.218:9090/ecommerce/administrator')

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_Administrator  Log In/input_ADMIN_a'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_Administrator  Log In/input_ADMIN_b'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.delay(6, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_Administrator  Log In/input_Remember Me_submit'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/a_Master Market'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/a_Ongkir Kurir Internal'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/a_Tambahkan Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/select_- Pilih -Roda 2Roda 4'), 
    kendaraan, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/select_- Pilih Provinsi -BaliBangka Belitun_36d3c3'), 
    provinsi_asal, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/select_Kota  KabupatenKota Jakarta BaratKot_9ea51a'), 
    kota_asal, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/select_KecamatanCakungCipayungCiracasDuren _aea3f4'), 
    kecamatan_asal, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/select_- Pilih Provinsi -BaliBangka Belitun_36d3c3_1'), 
    provinsi_tujuan, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/select_Kota  KabupatenKota Jakarta BaratKot_9ea51a_1'), 
    kota_tujuan, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/select_KecamatanCakungCipayungCiracasDuren _aea3f4_1'), 
    kecamatan_tujuan, true)

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/input_Ongkir (Rp)_d'), ongkir)

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/textarea_Keterangan_e'), keterangan)

WebUI.click(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/button_Tambahkan'))

WebUI.delay(5)

WebUI.closeBrowser()

