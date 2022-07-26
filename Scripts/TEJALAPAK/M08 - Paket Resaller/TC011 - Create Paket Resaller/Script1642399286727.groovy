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
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://202.159.35.218:9090/ecommerce/administrator')

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_Administrator  Log In/input_ADMIN_a'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_Administrator  Log In/input_ADMIN_b'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_Administrator  Log In/input_Remember Me_submit'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/span_Master Market'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/a_Paket Reseller'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/a_Tambahkan Data'))

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/input_Nama Paket_nama_paket'), 
    nama)

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/input_Judul_judul'), judul)

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/textarea_Keterangan_keterangan'), 
    keterangan)

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/input_Durasi_durasi'), durasi)

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/input_Harga_harga'), harga)

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/input_Max Produk_max_produk'), 
    max_produk)

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/input_Icon Kode_icon_kode'), 
    icon_kode)

WebUI.uploadFile(findTestObject('TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/input_Icon Image_icon_image'), icon_img)

WebUI.click(findTestObject('TAJALAPAK/BACKEND/Page_WELCOME ADMINISTRATOR/button_Tambahkan'))

WebUI.delay(5)

WebUI.closeBrowser()

