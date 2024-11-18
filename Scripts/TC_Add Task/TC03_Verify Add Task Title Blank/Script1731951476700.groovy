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
Mobile.verifyElementText(findTestObject('Object Repository/Dashboard/android.widget.TextView - No task to show'), 'No task to show')

'step 3'
Mobile.tap(findTestObject('Dashboard/android.widget.Add Task Button'), 0)

'step 4'
Mobile.verifyElementVisible(findTestObject('Add Task/android.widget.TextView - Add Task'), 0)

'step 5'
Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'step 6'
Mobile.setText(findTestObject('Add Task/android.widget.EditText - Enter your task'), YourTask, 0)

'step 7'
Mobile.tap(findTestObject('Add Task/android.widget.EditText - Set Date'), 0)

'step 8'
String strDate = Dates

'step 9'
Mobile.tap(findTestObject('Add Task/Date/android.view.View - Date', [('date') : strDate]), 0)

'step 10'
Mobile.verifyElementVisible(findTestObject('Add Task/Date/android.widget.LinearLayout'), 0)

'step 11'
Mobile.tap(findTestObject('Add Task/Date/android.widget.Button - OK'), 0)

'step 12'
Mobile.tap(findTestObject('Add Task/android.widget.EditText - Set Time'), 0)

'step 13'
if (PetunjukWaktu == 'AM') {
    Mobile.tap(findTestObject('Add Task/Time/android.widget.RadioButton - AM'), 0, FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.tap(findTestObject('Add Task/Time/android.widget.RadioButton - PM'), 0, FailureHandling.STOP_ON_FAILURE)
}

'step 14'
String strHour = Hours

'step 15'
Mobile.tap(findTestObject('Add Task/Time/android.widget.RadialTimePickerView - Hour', [('hour') : strHour]), 0, FailureHandling.STOP_ON_FAILURE)

'step 16'
String strMinute = Minutes

'step 17'
Mobile.tap(findTestObject('Add Task/Time/android.widget.RadialTimePickerView - Minute', [('minute') : strMinute]), 0, FailureHandling.STOP_ON_FAILURE)

'step 18'
Mobile.tap(findTestObject('Add Task/Time/android.widget.Button - OK'), 0)

'step 19'
Mobile.tap(findTestObject('Add Task/android.widget.SpinnerCatagory'), 0)

'step 20'
String strCatagory = Catagorys

'step 21'
Mobile.tap(findTestObject('Add Task/android.widget.CheckedTextView - Catagory', [('catagory') : strCatagory]), 0)

'step 22'
Mobile.tap(findTestObject('Add Task/android.widget.AccButton'), 0)

'step 23'
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'step 24'
Mobile.closeApplication()

