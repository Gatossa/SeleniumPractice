package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.linkText;

public class Assertions {

    @Test
    public void HomepageAssertion(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://automationtesting.co.uk");
        String pageTitle= driver.getTitle();
        Assert.assertEquals("Homepage", pageTitle);
        driver.quit();

    }

    @Test
    public void CartAmountAssertion() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://teststore.automationtesting.co.uk/index.php");
        driver.findElement(By.linkText("CLOTHES")).click();
        driver.findElement(By.cssSelector(".products.row [alt='Brown bear printed sweater']")).click();
        driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();
        Thread.sleep(3000);
        //checking
        //System.out.println(driver.findElement(By.cssSelector(".product-total .value")).getText());
        String total=driver.findElement(By.cssSelector(".product-total .value")).getText();
        Assert.assertEquals("$35.72", total);




        //driver.findElement(By.linkText("TEST STORE")).click();




    }

}
