package MoreAdvancedTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor {

    @Test
    public void scrollingThePage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

    }
   @Test
    public void Javaexecutor() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/contactForm.html");
       driver.findElement(By.cssSelector("input[name='first_name'")).sendKeys("Joanna");
       driver.findElement(By.cssSelector("input[name='last_name'")).sendKeys("Nowak");
       driver.findElement(By.cssSelector("input[name='email'")).sendKeys("nowak@wp.pl");
       driver.findElement(By.cssSelector("textarea[name='message'")).sendKeys("Call me");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement submitbutton =driver.findElement(By.cssSelector("[type='submit']"));
       WebElement resetbutton =driver.findElement(By.cssSelector("[type='reset']"));
        //button.click();
       js.executeScript("arguments[1].click()","arguments[0].click()",submitbutton, resetbutton);//using JavaScript







   }
}
