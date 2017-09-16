package framework.utils;

import framework.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiters {
    private static final int WAIT_FOR_ELEMENT_TIMEOUT_SECONDS = 20;

    public static void waitForElementPresent(WebElement element) {
        new WebDriverWait(Driver.getDriverInstance(), WAIT_FOR_ELEMENT_TIMEOUT_SECONDS).until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementVisible(WebElement element) {
        new WebDriverWait(Driver.getDriverInstance(), WAIT_FOR_ELEMENT_TIMEOUT_SECONDS).until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementEnabled(WebElement element) {
        new WebDriverWait(Driver.getDriverInstance(), WAIT_FOR_ELEMENT_TIMEOUT_SECONDS).until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForElementVisibleEnabled(By locator) {
        new WebDriverWait(Driver.getDriverInstance(), WAIT_FOR_ELEMENT_TIMEOUT_SECONDS).until(
                ExpectedConditions.and(
                        ExpectedConditions.visibilityOfAllElementsLocatedBy(locator),
                        ExpectedConditions.elementToBeClickable(locator)));
    }

}
