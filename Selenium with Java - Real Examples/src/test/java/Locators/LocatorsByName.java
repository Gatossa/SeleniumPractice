package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LocatorsByName {

    @Test
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        //finding element by name
        driver.get("https://automationtesting.co.uk/contactForm.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("first_name")).sendKeys("Joanna");
        //driver.quit();
    }
}