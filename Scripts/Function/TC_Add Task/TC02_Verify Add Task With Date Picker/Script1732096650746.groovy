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
Mobile.startApplication(GlobalVariable.APK, true)

'step 2'
Mobile.tap(findTestObject('Home Screen/android.widget.Button - OK'), 0)

'step 3'
Mobile.tap(findTestObject('Home Screen/android.widget.TextView - Skip'), 0)

'step 4'
Mobile.verifyElementText(findTestObject('Object Repository/Dashboard/android.widget.TextView - No task to show'), 'No task to show')

'step 5'
Mobile.tap(findTestObject('Dashboard/android.widget.Add Task Button'), 2)

'step 6'
Mobile.verifyElementVisible(findTestObject('Add Task/android.widget.TextView - Add Task'), 2)

'step 7'
Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'step 8'
Mobile.setText(findTestObject('Add Task/android.widget.EditText - Enter task title'), TaskTitle, 2)

'step 9'
Mobile.setText(findTestObject('Add Task/android.widget.EditText - Enter your task'), YourTask, 2)

'step 10'
Mobile.tap(findTestObject('Add Task/android.widget.EditText - Set Date'), 2)

'step 11'
String cMonth = Mobile.getText(findTestObject('Add Task/Date/android.widget.TextView - Sun, Nov 17'), 2)

'step 12'
String cYear = Mobile.getText(findTestObject('Add Task/Date/android.widget.TextView - Year'), 2)

'step 13'
System.print((cMonth + '****') + cYear)

'step 14'
String eMonth = Month

'step 15'
String eYear = Year

'step 16'
while (!(cMonth.equals(eMonth)) || !(cYear.equals(eYear))) {
    String strDate = Datess

    Mobile.tap(findTestObject('Add Task/Date/android.view.View - Date', [('date') : strDate]), 2)

    Mobile.tap(findTestObject('Add Task/Date/android.widget.RightClickButton'), 2)

    cMonth = Mobile.getText(findTestObject('Add Task/Date/android.widget.TextView - Sun, Nov 17'), 2)

    cYear = Mobile.getText(findTestObject('Add Task/Date/android.widget.TextView - Year'), 2)
}

'step 17'
System.print((((((cMonth + '****') + cYear) + '****') + eMonth) + '****') + eYear)

'step 18'
Mobile.tap(findTestObject('Add Task/Date/android.widget.Button - OK'), 2)

'step 19'
Mobile.tap(findTestObject('Add Task/android.widget.EditText - Set Time'), 2)

'step 20'
if (PetunjukWaktu == 'AM') {
    Mobile.tap(findTestObject('Add Task/Time/android.widget.RadioButton - AM'), 2, FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.tap(findTestObject('Add Task/Time/android.widget.RadioButton - PM'), 2, FailureHandling.STOP_ON_FAILURE)
}

'step 21'
String strHour = Hours

'step 22'
Mobile.tap(findTestObject('Add Task/Time/android.widget.RadialTimePickerView - Hour', [('hour') : strHour]), 2, FailureHandling.STOP_ON_FAILURE)

'step 23'
String strMinute = Minutes

'step 24'
Mobile.tap(findTestObject('Add Task/Time/android.widget.RadialTimePickerView - Minute', [('minute') : strMinute]), 2, FailureHandling.STOP_ON_FAILURE)

'step 25'
Mobile.tap(findTestObject('Add Task/Time/android.widget.Button - OK'), 2)

'step 26'
Mobile.tap(findTestObject('Add Task/android.widget.SpinnerCatagory'), 2)

'step 27'
String strCatagory = Catagorys

'step 28'
Mobile.tap(findTestObject('Add Task/android.widget.CheckedTextView - Catagory', [('catagory') : strCatagory]), 2)

'step 29'
Mobile.tap(findTestObject('Add Task/android.widget.AccButton'), 2)

'step 30'
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'step 31'
Mobile.tap(findTestObject('Dashboard/Taks/android.widget.RelativeLayout'), 2)

'step 32'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'step 33'
Mobile.closeApplication()

