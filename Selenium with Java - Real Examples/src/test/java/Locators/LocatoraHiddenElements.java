package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LocatoraHiddenElements {


    @Test
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://automationtesting.co.uk//hiddenElements.html");
        System.out.println(driver.findElement(By.cssSelector(".col-12.col-12-small > p:nth-of-type(2)")).isEnabled());
        System.out.println(driver.findElement(By.cssSelector(".col-12.col-12-small > p:nth-of-type(3)")).isEnabled());

          driver.close();
    }
}
