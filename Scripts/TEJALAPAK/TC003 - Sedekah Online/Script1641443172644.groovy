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

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Tajalapak  Shooping From Home and Anytime/a_Donasi'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Tajalapak  Shooping From Home and Anytime/span_Donasi'))

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Tajalapak  Shooping From Home and Anytime/a_Sedekah Online'))

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/Page_Sedekah Online/input_Sedekah Minimal Rp. 25.000_nominal'), 
    nominal)

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/Page_Sedekah Online/input_Nama Lengkap_nama_lengkap'), nama)

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/Page_Sedekah Online/input_No Handphone_no_handphone'), no_hp)

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/Page_Sedekah Online/input_Alamat Email anda_alamat_email'), email)

WebUI.selectOptionByValue(findTestObject('Object Repository/TAJALAPAK/Page_Sedekah Online/select_Bank BNI Syariah - 0817 0242 31, AN _3feba0'), 
    pembayaran, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TAJALAPAK/Page_Sedekah Online/select_Orang TuaSuamiIstriAnakSaudara'), 
    tujuan, true)

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/Page_Sedekah Online/textarea_concat(Silahkan Isi Do, , a Terbai_40279f'), 
    doa)

WebUI.setText(findTestObject('Object Repository/TAJALAPAK/Page_Sedekah Online/input_Masukkan 2 Digit Terakhir Nomor HP An_78cf0f'), 
    hp_blkng)

WebUI.click(findTestObject('Object Repository/TAJALAPAK/Page_Sedekah Online/button_Sedekah Sekarang'))

