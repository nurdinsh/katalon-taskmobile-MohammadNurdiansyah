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
Mobile.tap(findTestObject('Dashboard/android.widget.Menu Button'), 2)

'step 3'
Mobile.verifyElementVisible(findTestObject('Menu/android.widget.RelativeLayout'), 2)

'step 4'
Mobile.tap(findTestObject('Menu/android.widget.CheckedTextView - Category'), 2)

'step 5'
def choiseCatagoryNameEdit = CatagoryNameEdit

'step 6'
switch (choiseCatagoryNameEdit) {
    case choiseCatagoryNameEdit = 'Personal':
        println(choiseCatagoryNameEdit)

        Mobile.tap(findTestObject('Menu/Catagory/Edit/android.widget.Edit Personal'), 2)

        break
    case choiseCatagoryNameEdit = 'Business':
        println(choiseCatagoryNameEdit)

        Mobile.tap(findTestObject('Menu/Catagory/Edit/android.widget.Edit Business'), 2)

        break
    case choiseCatagoryNameEdit = 'Insurance':
        println(choiseCatagoryNameEdit)

        Mobile.tap(findTestObject('Menu/Catagory/Edit/android.widget.Edit Insurance'), 2)

        break
    case choiseCatagoryNameEdit = 'Shopping':
        println(choiseCatagoryNameEdit)

        Mobile.tap(findTestObject('Menu/Catagory/Edit/android.widget.Edit Shopping'), 2)

        break
    case choiseCatagoryNameEdit = 'Banking':
        println(choiseCatagoryNameEdit)

        Mobile.tap(findTestObject('Menu/Catagory/Edit/android.widget.Edit Banking'), 2)
}

'step 7'
Mobile.verifyElementVisible(findTestObject('Menu/Catagory/Edit/android.widget.TextView - Update Category'), 2)

'step 8'
Mobile.clearText(findTestObject('Menu/Catagory/Edit/android.widget.EditText - Enter Update Catagory Name'), 0)

'step 9'
Mobile.setText(findTestObject('Menu/Catagory/Edit/android.widget.EditText - Enter Update Catagory Name'), SameCatagoryName, 
    2)

'step 10\r\n'
Mobile.tap(findTestObject('Menu/Catagory/Edit/android.widget.Button - UPDATE'), 2)

'step 11'
Mobile.tap(findTestObject('Menu/Catagory/Edit/android.widget.Button - CANCEL'), 2)

'step 12'
Mobile.verifyElementVisible(findTestObject('Menu/Catagory/android.widget.TextView - Category'), 2)

'step 13'
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'step 14'
WebUI.callTestCase(findTestCase('Block/Close Application'), [:], FailureHandling.STOP_ON_FAILURE)

