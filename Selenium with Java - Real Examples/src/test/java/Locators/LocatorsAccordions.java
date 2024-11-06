package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LocatorsAccordions {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://automationtesting.co.uk/accordion.html");
        //driver.findElement(By.cssSelector(" .accordion > div:nth-of-type(1)")).click();
        //driver.findElement(By.cssSelector(" .accordion > div:nth-of-type(1)")).click();
        //driver.findElement(By.cssSelector(" .accordion > div:nth-of-type(3)")).click();
        //driver.findElement(By.cssSelector(" .accordion > div:nth-of-type(3)")).click();
        //driver.findElement(By.cssSelector(" .accordion > div:nth-of-type(5)")).click();
        //driver.findElement(By.cssSelector(" .accordion > div:nth-of-type(5)")).click();

        for (int i = 0; i < 4; i++){
            driver.findElement(By.cssSelector(" .accordion > div:nth-of-type(1)")).click();
            driver.findElement(By.cssSelector(" .accordion > div:nth-of-type(3)")).click();
            driver.findElement(By.cssSelector(" .accordion > div:nth-of-type(5)")).click();
        }

    }

}