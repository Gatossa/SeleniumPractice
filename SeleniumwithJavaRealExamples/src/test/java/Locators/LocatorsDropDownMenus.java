package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LocatorsDropDownMenus {


    @Test
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://automationtesting.co.uk/dropdown.html");
        Select carSelection=new Select(driver.findElement(By.id("cars")));
        carSelection.selectByVisibleText("Honda");

    }
}
