package MoreAdvancedTopics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationtesting.co.uk/");
        driver.manage().window().maximize();

        zdjecie(driver);

    }

    public static void zdjecie(WebDriver zdjecietestu) throws IOException {
        File srcFile = ((TakesScreenshot) zdjecietestu).getScreenshotAs(OutputType.FILE);

        File destFile = new File("src/test/java/Screenshots"
                + timestamp() + ".png");

        FileUtils.copyFile(srcFile, destFile);

    }

    public static String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

}
