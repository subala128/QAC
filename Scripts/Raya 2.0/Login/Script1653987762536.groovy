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

Mobile.startApplication('C:\\Users\\amndn\\Downloads\\Raya2.0-DEV-v1.0.0(73).apk', true)

Mobile.tap(findTestObject('Object Repository/Raya 2.0/android.widget.Button'), 0)

Mobile.tap(findTestObject('Raya 2.0/android.widget.EditText - Contoh 0812 3456 789'), 0)

Mobile.setText(findTestObject('Object Repository/Raya 2.0/android.widget.EditText - Contoh 0812 3456 789'), '087887146998', 
    0)

Mobile.tap(findTestObject('Object Repository/Raya 2.0/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Raya 2.0/android.widget.EditText - Password kamu'), 0)

Mobile.setText(findTestObject('Object Repository/Raya 2.0/android.widget.EditText - Password kamu'), 'abcd123@', 0)

Mobile.closeApplication()

