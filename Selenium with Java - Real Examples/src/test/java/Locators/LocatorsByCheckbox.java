package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LocatorsByCheckbox {


    @Test
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://automationtesting.co.uk/dropdown.html");
        //driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(1600, 900));
        System.out.println(driver.findElement(By.cssSelector("input#cb_red")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input#cb_green")).isSelected());
    }
}
