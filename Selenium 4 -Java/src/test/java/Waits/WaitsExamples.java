package Waits;

import BaseSetUp.base;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;




public class WaitsExamples extends base {


    @Test
    public void ExplicitWait() {
        driver.get("https://www.automationteststore.com/");

        WebDriverWait display = new WebDriverWait(driver, Duration.ofSeconds(4));
        System.out.println(display.until(ExpectedConditions.elementToBeClickable(By.id("customer_menu_top"))));



    }

    @Test
    public void FluentWait(){
        driver.get("https://www.automationteststore.com/");
        Wait<WebDriver> wait =
                new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(5))
                        .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("MAKEUP"))).click();
        wait.until(ExpectedConditions.urlContains("product/category&pa\n" +
                "                        .pollingEvery(Duration.ofMillis(300)) //checkingth=36"));

    }
}
