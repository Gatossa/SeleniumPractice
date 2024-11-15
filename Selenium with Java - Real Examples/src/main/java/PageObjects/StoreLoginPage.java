package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class StoreLoginPage {
    WebDriver driver;

    public StoreLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By email = By.cssSelector("section input[name='email']");
    By password = By.cssSelector("input[name='password']");
    By loginBtn = By.cssSelector("button#submit-login");

    public WebElement getEmail() {
        return driver.findElement(email);}

    public WebElement getPassword() {
        return driver.findElement(password);}

    public WebElement getLoginBtn() {
        return driver.findElement(loginBtn);}


}

