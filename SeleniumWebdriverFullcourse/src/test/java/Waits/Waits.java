package Waits;

import BaseTestsSetting.BaseDriversSettings;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Waits extends BaseDriversSettings {

    @Test
    public void Sleep() throws InterruptedException {
        driver.get(getUrl1());
        driver.findElement(By.linkText("Oczekiwanie na element II")).click();
        WebElement clickOnMeButton= driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("p"));

    }


    @Test
    public void ImplicitWait() throws InterruptedException {
        driver.get(getUrl1());
        driver.findElement(By.linkText("Oczekiwanie na element II")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement clickOnMeButton= driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();
        driver.findElement(By.cssSelector("p"));

    }

    @Test
    public void ExplicitWebDriverWait() throws InterruptedException {
        driver.get(getUrl1());
        driver.findElement(By.linkText("Oczekiwanie na element II")).click();

        WebElement clickOnMeButton= driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10) );
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("p")));
        driver.findElement(By.cssSelector("p"));

    }

    @Test
    public void FluentWait() throws InterruptedException {
        driver.get(getUrl1());
        driver.findElement(By.linkText("Oczekiwanie na element II")).click();

        WebElement clickOnMeButton= driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();

        FluentWait<WebDriver> wait=new FluentWait<>(driver);
        wait.ignoring(NoSuchCookieException.class);
        wait.pollingEvery(Duration.ofSeconds(1));
        wait.withTimeout(Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("p")));
        driver.findElement(By.cssSelector("p"));

    }







}

