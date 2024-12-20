package SeleniumDemoPageTest.Tests;

import SeleniumDemoPageTest.Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegisterTest extends BaseTest {

@Test
public void RegisterUserTest() {
    int random= (int) (Math.random()*1000);

    WebElement dashBoardLink = new HomePage(driver).openMyAccountPage()
            .registerUserValid("Hopeless" + random+"@test.pl", "test@test.pl")
            .getDashBoard();

    Assert.assertEquals(dashBoardLink.getText(), "Dashboard");



}

    @Test
    public void RegisteredUserTest() {

        WebElement error = new HomePage(driver).openMyAccountPage()
                .registeredUserInvalid("test@test.pl", "test@test.pl")
                .getError();

        Assert.assertEquals(error.getText(), "Error: An account is already registered with your email address. Please log in.");

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

