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

WebUI.navigateToUrl('https://www.uniqlo.com/id/id/')

WebUI.click(findTestObject('Masuk/Menu Masuk'))

WebUI.click(findTestObject('Buat Akun/Tombol Buat Akun'))

WebUI.setText(findTestObject('Buat Akun/textbox Email'), 'putra@mailsac.com')

WebUI.setText(findTestObject('Buat Akun/textbox Kata Sandi'), 'putri123')

WebUI.click(findTestObject('Buat Akun/Check Box Tunjukkan kata sandi saya'))

WebUI.setText(findTestObject('Buat Akun/textbox Kode Pos'), '123456')

WebUI.setText(findTestObject('Buat Akun/Tanggal Lahir'), '12/05/2000')

WebUI.click(findTestObject('Buat Akun/gender Pria'))

WebUI.click(findTestObject('Buat Akun/Check Box Newsletter Uniqlo'))

WebUI.click(findTestObject('Buat Akun/Tombol Daftar'))

WebUI.verifyElementPresent(findTestObject('Buat Akun/Null Harap pastikan untuk cek di bawah ini'), 0)

WebUI.closeBrowser()

