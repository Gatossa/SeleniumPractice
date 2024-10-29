import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.By.*;


public class TestingWebpage {

@Test
    public void addProductToCartTest(){
    //open browser
    WebDriver browser=new FirefoxDriver();
    browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    //maximize browser
    browser.manage().window().maximize();
    //open the tested website
    browser.get("http://seleniumdemo.com/");
    //click shop link
    browser.findElement(linkText("Shop")).click();
    //click cart
    browser.findElement(xpath("//a[@data-product_id='27']")).click();
    //add product to cart
    browser.findElement(xpath("//a[@title='View cart']")).click();
    //product name
    String productName=browser.findElement(xpath("//td[@data-title='Product']")).getText();
    System.out.println(productName);
    //product price
    String productPrice=browser.findElement(xpath("//td[@data-title='Price']")).getText();
    System.out.println(productPrice);
    //total price
    String Total=browser.findElement(xpath("//td[@data-title='Price']")).getText();
    System.out.println( Total);

    Assert.assertEquals(productName,"GIT basics");
    Assert.assertEquals(productPrice,"1,00 zł");
    Assert.assertEquals(Total,"1,00 zł");

    browser.quit();





}
}
