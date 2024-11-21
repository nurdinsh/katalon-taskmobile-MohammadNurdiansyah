package scroll
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class swipe {
	/**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up
	 * @return true if element present, otherwise false
	 */

	@Keyword
	def horizontalScroll( TestObject toGrid,  TestObject toTarget) {
		int xPositionValue
		int yPositionValue
		int w1
		int h1
		int x = Integer.parseInt(Mobile.getAttribute(toGrid, 'x', 10))
		int y = Integer.parseInt(Mobile.getAttribute(toGrid, 'y', 10))
		int xWidth = Integer.parseInt(Mobile.getAttribute(toGrid, 'width', 10))
		int newWidth = xWidth/2
		int yHeight = Integer.parseInt(Mobile.getAttribute(toGrid, 'heigth', 10))
		int newHeigth = yHeight/2

		println("Value of x:"+x)
		println("Value of y:"+y)
		println("Value of newWidth:"+newWidth)
		println("Value of newHeigth:"+newHeigth)

		for (int i=1; i=10; i++) {
			Mobile.swipe(newWidth, newHeigth, 50, newHeigth)

			try {

				boolean isVariable = Mobile.verifyElementVisible(toTarget, 2)
				if (isVariable == true) {

					Mobile.swipe(newWidth, newHeigth, 50, newHeigth)
					println("Target Element")
					break
				}
			}
			catch (Exception e) {
				println(e.message)
			}
		}
	}
	@Keyword
	def isElementPresent_Mobile(TestObject to, int timeout){
		try {
			KeywordUtil.logInfo("Finding element with id:" + to.getObjectId())

			WebElement element = MobileElementCommonHelper.findElement(to, timeout)
			if (element != null) {
				KeywordUtil.markPassed("Object " + to.getObjectId() + " is present")
			}
			return true
		} catch (Exception e) {
			KeywordUtil.markFailed("Object " + to.getObjectId() + " is not present")
		}
		return false;
	}

	/**
	 * Get mobile driver for current session
	 * @return mobile driver for current session
	 */
	@Keyword
	def WebDriver getCurrentSessionMobileDriver() {
		return MobileDriverFactory.getDriver();
	}
}