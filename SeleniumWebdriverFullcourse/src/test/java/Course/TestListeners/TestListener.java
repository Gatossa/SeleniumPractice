package Course.TestListeners;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.apache.commons.io.FileUtils.copyFile;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        System.out.printf("I am starting test\n");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        System.out.printf("Tests are successful\n");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        WebDriver driver = new ChromeDriver();
        String screenshotName= "FailedTest";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        // Take a screenshot and store it as a file
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        // Set destination file path with timestamp
        File destFile = new File(System.getProperty("user.dir") + "\\src\\test\\Screenshots\\" +
                screenshotName + "_" + timestamp() + ".png");

        // Copy the screenshot to the destination file
        try {
            copyFile(srcFile, destFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Screenshot of the failed test saved at: " + destFile.getAbsolutePath());


    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        System.out.print("Test is skipped\n");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
        System.out.print("Started\n");
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        System.out.print("Finished\n");
    }

    public String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
    }

}
