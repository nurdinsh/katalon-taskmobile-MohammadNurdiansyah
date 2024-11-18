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

'step 1'
WebUI.callTestCase(findTestCase('Block/Start Application'), [:], FailureHandling.STOP_ON_FAILURE)
'step 2'
WebUI.callTestCase(findTestCase('Block/Add Task Successfully'), [('TaskTitle') : 'Automation Katalon', ('YourTask') : 'Mobile Katalon Automations'
        , ('PetunjukWaktu') : 'PM', ('Hours') : 5, ('Minutes') : 5, ('Catagorys') : 'Personal', ('Dates') : '21'], FailureHandling.STOP_ON_FAILURE)
'step 3'
Mobile.tap(findTestObject('Dashboard/Layout/android.widget.NavigateButton'), 2)
'step 4'
Mobile.tap(findTestObject('Dashboard/Layout/Navigate/Delete/android.widget.TextView - Delete'), 2)
'step 5'
Mobile.tap(findTestObject('Dashboard/Layout/Navigate/Delete/android.widget.Button - DELETE'), 2)
'step 6'
Mobile.verifyElementVisible(findTestObject('Dashboard/Layout/Navigate/Delete/android.widget.TextView - Todo'), 2)
'step 7'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
'step 8'
WebUI.callTestCase(findTestCase('Block/Close Application'), [:], FailureHandling.STOP_ON_FAILURE)

