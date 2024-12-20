package SeleniumDemoPageTest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    @FindBy(id ="reg_email")
    private WebElement regEmailInput;

    @FindBy(id ="reg_password")
    private WebElement regPasswordInput;

    @FindBy(name="register")
    private WebElement registerButton;

    @FindBy(xpath = "//ul[@class='woocommerce-error']//li")
    private WebElement errorMessage;

    @FindBy(id ="username")
    private WebElement usernameInput;


    @FindBy(id ="password")
    private WebElement PasswordInput;

    @FindBy(name="login")
    private WebElement loginButton;






    private WebDriver driver;


    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    public LoggedUserPage registerUserValid(String email, String password) {
        registerUser(email, password);
        return new LoggedUserPage(driver);

    }

    public MyAccountPage registeredUserInvalid(String email, String password) {
        registerUser(email, password);
        return this;

    }

    private void registerUser(String email, String password) {
        regEmailInput.sendKeys(email);
        regPasswordInput.sendKeys(password);
        registerButton.click();}

    public  LoggedUserPage logInValidData(String username, String password) {
      Login(username, password);
        return new LoggedUserPage(driver);
    }


    public  MyAccountPage logInInvalidData(String username, String password) {
        Login(username, password);
        return this;
    }

private void Login(String username, String password){
    usernameInput.sendKeys(username);
    PasswordInput.sendKeys(password);
    loginButton.click();

}

    public WebElement getError(){
        return errorMessage;
    }



}



