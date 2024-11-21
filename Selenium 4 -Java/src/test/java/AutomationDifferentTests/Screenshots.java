package AutomationDifferentTests;

import BaseSetUp.base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Screenshots extends base {
    @Test
    public void screenshots() throws IOException {

        driver.get("http://automationteststore.com");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./Screenshots/testImage.png"));


        //element screenshot
        WebElement homeBtn=driver.findElement(By.cssSelector(".menu_home"));
        scrFile=homeBtn.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./Screenshots/homeBtn.png"));



    }
    @Test
    public void fullscreen() throws IOException {
        //full page
        driver.get("http://automationteststore.com");
        File fullPage= ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fullPage, new File("./Screenshots/fullPage.png"));

    }
}
