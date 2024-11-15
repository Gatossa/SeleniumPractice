package DOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import PageObjects.StoreLoginPage;

public class LoginToThePage {

        @Test
        public void login() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("http://teststore.automationtesting.co.uk/login?back=my-account");
            StoreLoginPage logPage = new StoreLoginPage(driver);
            logPage.getEmail().sendKeys("test@test.com");
            logPage.getPassword().sendKeys("test123");
            logPage.getLoginBtn().click();

        }

    }


