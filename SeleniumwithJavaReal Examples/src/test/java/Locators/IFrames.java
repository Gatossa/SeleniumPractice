package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IFrames {


    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationtesting.co.uk/iframes.html");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector(".toggle")).click();
        driver.findElement(By.cssSelector(".toggle")).click();
        Thread.sleep(2000);

        //driver.switchTo().parentFrame();
        //driver.findElement(By.cssSelector(".toggle")).click();
        driver.switchTo().frame(1);
        driver.findElement(By.cssSelector("[aria-label='Odtwórz']")).click();





    }
}


