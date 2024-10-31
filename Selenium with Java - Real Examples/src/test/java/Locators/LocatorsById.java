package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class LocatorsById {
 @Test
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
       driver.get("https://automationtesting.co.uk/buttons.html");
     driver.manage().window().maximize();
//    finding element by ID
       driver.findElement(By.id("btn_one")).click();


     //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

    }
}
