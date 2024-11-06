package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LocatorsAlerts {

    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://automationtesting.co.uk/popups.html");
        driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

    }

    }


