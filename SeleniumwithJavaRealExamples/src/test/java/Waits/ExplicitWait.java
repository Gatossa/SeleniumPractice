package Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class ExplicitWait {

    @Test
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationtesting.co.uk/loader.html");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#loaderBtn")));
        driver.findElement(By.cssSelector("button#loaderBtn")).click();

    }
}
