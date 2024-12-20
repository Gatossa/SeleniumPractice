package SeleniumDemoPageTest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedUserPage {

    @FindBy(linkText ="Dashboard" )
    private WebElement dashBoardLink;




    private  WebDriver driver;
    public LoggedUserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }


    public WebElement getDashBoard(){
            return dashBoardLink;
        }





    }
