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

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/Page_Tajalapak  Shooping From Home and Anytime/input_Office Electronics_s'), 
    produk)

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Tajalapak  Shooping From Home and Anytime/button_Cari'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TAJALAPAK/Page_Pencarian Produk/select_ProvinsiBaliBangka BelitungBantenBen_a8a235'), 
    provinsi, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TAJALAPAK/Page_Pencarian Produk/select_Kota  KabupatenKota Jakarta BaratKot_9ea51a'), 
    kabupaten, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TAJALAPAK/Page_Pencarian Produk/select_KecamatanCengkarengGrogol Petamburan_894448'), 
    kecamatan, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TAJALAPAK/Page_Pencarian Produk/select_UrutanTermurahTermahal'), 
    sort, true)

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/Page_Pencarian Produk/input_Filter Produk_dari'), hrgstart)

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/Page_Pencarian Produk/input_Filter Produk_sampai'), hrgend)

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Pencarian Produk/button_Tampilkan'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('TAJALAPAK/Page_Pencarian Produk/button_Tampilkan'), 5)

WebUI.acceptAlert()

