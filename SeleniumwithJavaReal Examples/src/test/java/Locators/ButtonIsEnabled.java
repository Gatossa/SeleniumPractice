package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ButtonIsEnabled {


    @Test
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://automationtesting.co.uk/buttons.html");
        //driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(1600, 900));
        System.out.println(driver.findElement(By.cssSelector("button#btn_four")).isEnabled());
        System.out.println(driver.findElement(By.cssSelector("button#btn_three")).isEnabled());


    }
}
