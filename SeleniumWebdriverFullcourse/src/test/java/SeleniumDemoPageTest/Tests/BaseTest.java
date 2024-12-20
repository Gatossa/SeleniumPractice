package SeleniumDemoPageTest.Tests;

import SeleniumDemoPageTest.Utils.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;


    @BeforeMethod
    public void setup(){
     driver =DriverFactory.getDriver();
     driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
     driver.manage().window().maximize();
     driver.get("http://seleniumdemo.com");
 }

    @BeforeMethod
    public void tearDown(){
        //driver.quit();
    }

}
