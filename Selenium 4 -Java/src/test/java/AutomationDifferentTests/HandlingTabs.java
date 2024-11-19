package AutomationDifferentTests;

import BaseSetUp.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class HandlingTabs extends base {
    String originalWindow;
    String newWindow;
    String actualTitle;
    String expectedTitle;


    @Test
    public void newTab() throws InterruptedException {
        driver.get("http://webdriveruniversity.com");
        String originalWindow = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        String newWindow = driver.getWindowHandle();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
        System.out.println("Original window " + originalWindow + " new window " + newWindow);

        driver.close();
        driver.switchTo().window(originalWindow);
        WebElement loginPostalBtn = driver.findElement(By.cssSelector("a#login-portal h1"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(loginPostalBtn)).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Title " + driver.getTitle());

        wait.until(ExpectedConditions.titleIs("WebDriver | Login Portal"));
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "WebDriver | Login Portal";

        try {
            Assert.assertEquals(ActualTitle, ExpectedTitle);
            System.out.println("Assertion Passed: ActualTitle matches ExpectedTitle");
        } catch (AssertionError e) {
            System.out.println("Assertion Failed: " + e.getMessage());
        }

        driver.switchTo().window(originalWindow);
        driver.switchTo().window(tabs.get(tabs.size() -1));
        driver.close();
        driver.switchTo().window(originalWindow);
        System.out.println("Original Tab Title "+ driver.getTitle());
    }
}





