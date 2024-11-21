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
WebUI.callTestCase(findTestCase('Block/Add Task Successfully'), [('TaskTitle') : TaskTitle, ('YourTask') : YourTask, ('PetunjukWaktu') : PetunjukWaktu
        , ('Hours') : Hours, ('Minutes') : Hours, ('Catagorys') : Catagorys, ('Dates') : Dates], FailureHandling.STOP_ON_FAILURE)

'step 3'
Mobile.tap(findTestObject('Dashboard/Taks/android.widget.NavigateButton'), 2)

'step 4'
Mobile.tap(findTestObject('Dashboard/Taks/Overflow Menu/Edite/android.widget.TextView - Edit'), 2)

'step 5'
Mobile.verifyElementVisible(findTestObject('Dashboard/Taks/Overflow Menu/Edite/android.widget.TextView - Add Task'), 2)

'step 6'
String Title = TaskTitle

'step 7'
String Task = YourTask

'step 8'
Mobile.clearText(findTestObject('Dashboard/Taks/Overflow Menu/Edite/android.widget.EditText - TaskTitle', [('title') : Title]), 0)

'step 9'
Mobile.setText(findTestObject('Add Task/android.widget.EditText - Enter task title'), TaskTitleEdit, 2)

'step 10'
Mobile.clearText(findTestObject('Dashboard/Taks/Overflow Menu/Edite/android.widget.EditText - YourTask', [('task') : Task]), 0)

'step 11'
Mobile.setText(findTestObject('Add Task/android.widget.EditText - Enter your task'), YourTaskEdit, 2)

'step 12'
Mobile.tap(findTestObject('Add Task/android.widget.AccButton'), 2)

'step 13'
Mobile.verifyElementVisible(findTestObject('Dashboard/Taks/Overflow Menu/Delete/android.widget.TextView - Todo'), 2)

'step 14'
Mobile.tap(findTestObject('Dashboard/Taks/Overflow Menu/Edite/android.widget.RelativeLayout'), 2)

'step 15'
Mobile.tap(findTestObject('Dashboard/Taks/Overflow Menu/Edite/android.widget.RelativeLayout'), 2)

'step 16'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'step 17'
WebUI.callTestCase(findTestCase('Block/Close Application'), [:], FailureHandling.STOP_ON_FAILURE)

