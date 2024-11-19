package DOM;

import PageObjects.StoreLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginToThePageTest {
@Test
    public void login(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://teststore.automationtesting.co.uk/index.php?controller=authentication?back=https%3A%2F%2Fteststore.automationtesting.co.uk%2Findex.php");

        StoreLoginPage log= new StoreLoginPage(driver);
        log.getEmail().sendKeys("test@test.com");
        log.getPassword().sendKeys("test123");
        log.getLoginBtn().click();
        driver.quit();

    }
}
