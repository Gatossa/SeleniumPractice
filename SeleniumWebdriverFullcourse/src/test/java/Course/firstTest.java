package Course;

import BaseTestsSetting.BaseDriversSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstTest extends BaseDriversSettings {


    @Test
    public void searchingGoogle() {
        driver.get("https://www.google.pl/?hl=pl");
        driver.findElement(By.id("L2AGLb")).click();
        WebElement pressEnter=driver.findElement(By.cssSelector("textarea#APjFqb"));
        pressEnter.sendKeys("Selenium");
        pressEnter.sendKeys(Keys.ENTER);
        WebElement result=driver.findElement(By.xpath("//a[contains(@href, 'selenium.dev')]//span"));
        Assert.assertTrue(result.isDisplayed());
    }

    @Test
    public void  searchingDemoPage(){
        driver.get("http://seleniumdemo.com/");
        driver.findElement(By.linkText("Shop")).click();
        driver.findElement(By.xpath("//h2[text()='Java Selenium WebDriver']")).click();




}

}
