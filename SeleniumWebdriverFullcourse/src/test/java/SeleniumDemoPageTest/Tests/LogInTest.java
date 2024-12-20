package SeleniumDemoPageTest.Tests;

import SeleniumDemoPageTest.Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LogInTest extends BaseTest {

@Test
public void LogInTest() {

    WebElement dashBoardLink = new HomePage(driver).openMyAccountPage()
            .logInValidData("tester@test.pl", "tester@test.pl")
            .getDashBoard();

    Assert.assertEquals(dashBoardLink.getText(), "Dashboard");



}

    @Test
    public void InvalidPasswordTest() {

        WebElement error = new HomePage(driver).openMyAccountPage()
                .logInInvalidData("tester@test.pl", "testerka@test.pl")
                .getError();

        Assert.assertTrue(error.getText().contains("Incorrect username or password"));

    }

//    public void addProductToCartTest(){
//    driver.get("http://seleniumdemo.com/");

//    browser.findElement(xpath("//a[@data-product_id='27']")).click();
//    //add product to cart
//    browser.findElement(xpath("//a[@title='View cart']")).click();
//    //product name
//    String productName=browser.findElement(xpath("//td[@data-title='Product']")).getText();
//    System.out.println(productName);
//    //product price
//    String productPrice=browser.findElement(xpath("//td[@data-title='Price']")).getText();
//    System.out.println(productPrice);
//    //total price
//    String Total=browser.findElement(xpath("//td[@data-title='Price']")).getText();
//    System.out.println( Total);
//
//    Assert.assertEquals(productName,"GIT basics");
//    Assert.assertEquals(productPrice,"1,00 zł");
//    Assert.assertEquals(Total,"1,00 zł");






}

