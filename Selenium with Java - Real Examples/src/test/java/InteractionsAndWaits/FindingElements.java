package InteractionsAndWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class FindingElements {

    @Test
    public void clickingButtons() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/buttons.html");
        driver.findElement(By.id("btn_one")).click();
        //driver.findElement(By.cssSelector("button#btn_two")).click();
    }
    @Test
    public void sendingDataToForms()
    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/contactForm.html");
        driver.findElement(By.cssSelector("input[name='first_name'")).sendKeys("Joanna");
        driver.findElement(By.cssSelector("input[name='last_name'")).sendKeys("Nowak");
        driver.findElement(By.cssSelector("input[name='email'")).sendKeys("nowak@wp.pl");
        driver.findElement(By.cssSelector("textarea[name='message'")).sendKeys("Call me");
    }

}



