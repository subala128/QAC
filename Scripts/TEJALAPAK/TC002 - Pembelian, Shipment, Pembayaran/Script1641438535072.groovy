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

WebUI.navigateToUrl('https://tajalapak.com/')

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Tajalapak  Shooping From Home and Anytime/a_Login'))

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/Page_Tajalapak  Shooping From Home and Anytime/input_Username, Email atau No. Handphone_a'), 
    'subala128')

WebUI.setEncryptedText(findTestObject('Object Repository/TAJALAPAK/Page_Tajalapak  Shooping From Home and Anytime/input_Password_b'), 
    'BF6jey4d75ZMmoaqyFXiWQ==')

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Tajalapak  Shooping From Home and Anytime/label_Ingat saya'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Tajalapak  Shooping From Home and Anytime/button_Masuk'))

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/Page_Two Factor Verification/input_concat(Don, , t ask again for 30 days)_kode'), 
    '123456')

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Two Factor Verification/input_concat(Don, , t ask again for 30 days_706c39'))

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/Page_Two Factor Verification/input_concat(Don, , t ask again for 30 days)_kode'), 
    '101912')

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Two Factor Verification/input_concat(Don, , t ask again for 30 days_706c39'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Profile Anda/span_Shop'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Tajalapak  Shooping From Home and Anytime/a_Lihat Semua'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Kategori  Busana Wanita/a_Kaos Kaki untuk muslimah'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Kaos Kaki untuk muslimah/a_Keranjang'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Kaos Kaki untuk muslimah/div_Berhasil Ditambahkan                 Ka_561105'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Kaos Kaki untuk muslimah/i_makanan_icon-bag2'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Kaos Kaki untuk muslimah/a_Lihat Sekarang'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Keranjang Belanja/button_Lanjut ke Pembayaran'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Checkout Order/input_Kordinat Lokasi_kordinat_lokasi'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TAJALAPAK/Page_Checkout Order/select_- Kirim via Kurir Lainnya -JTTIKIWah_b3bbf0'), 
    'jnt', true)

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Checkout Order/span_JT Express - EZ'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Checkout Order/button_Proses Pembayaran'))

