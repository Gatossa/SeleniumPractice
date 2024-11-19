package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LocatorsRadioButtons {

    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        //finding element by CSS
        driver.get("https://automationtesting.co.uk/dropdown.html");
        //driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(1600, 900));
        //driver.findElement(By.cssSelector("#btn_one")).click();
        driver.findElement(By.cssSelector("[for='demo-priority-low']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[for='demo-priority-normal']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[for='demo-priority-high']")).click();



    }

}