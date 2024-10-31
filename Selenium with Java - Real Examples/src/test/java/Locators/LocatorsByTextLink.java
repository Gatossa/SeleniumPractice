package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


    public class LocatorsByTextLink {

        @Test
        public static void main(String[] args) {
            WebDriver driver = new FirefoxDriver();

            //finding element by text link
            driver.get("https://automationtesting.co.uk");
            //driver.manage().window().maximize();
            driver.manage().window().setSize(new Dimension(1600, 900));
            driver.findElement(By.linkText("ACTIONS")).click();

            //driver.quit();
        }
    }


