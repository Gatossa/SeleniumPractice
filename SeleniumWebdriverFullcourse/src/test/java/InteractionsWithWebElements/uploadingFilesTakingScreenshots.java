package InteractionsWithWebElements;

import BaseTestsSetting.BaseDriversSettings;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class uploadingFilesTakingScreenshots extends BaseDriversSettings {

    @Test
    public void uploadingFile() throws InterruptedException, IOException {

        driver.get(getUrl1());

        WebElement basicLink = driver.findElement(By.linkText("Załadowanie pliku"));
        basicLink.click();


        driver.findElement(By.id("myFile")).sendKeys(
                "E:\\Atester\\SeleniumPractice\\SeleniumWebdriverFullcourse\\sample.txt");

        // Take a screenshot after uploading the file
        takeScreenshot("TestScreenshot");
    }

    public void takeScreenshot(String screenshotName) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        // Take a screenshot and store it as a file
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        // Set destination file path with timestamp
        File destFile = new File(System.getProperty("user.dir") + "\\src\\test\\Screenshots\\" +
                screenshotName + "_" + timestamp() + ".png");

        // Copy the screenshot to the destination file
        FileUtils.copyFile(srcFile, destFile);

        System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
    }

    public String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
    }


    }














