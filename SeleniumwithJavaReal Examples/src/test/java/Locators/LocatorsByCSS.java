package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LocatorsByCSS {


    @Test
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        //finding element by CSS
        driver.get("https://automationtesting.co.uk/buttons.html");
        //driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(1600, 900));
        //driver.findElement(By.cssSelector("#btn_one")).click();
        driver.findElement(By.cssSelector("button#btn_two")).click();

    }
}
