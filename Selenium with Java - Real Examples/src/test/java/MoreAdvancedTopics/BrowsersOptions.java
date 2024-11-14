package MoreAdvancedTopics;

import org.openqa.selenium.InsecureCertificateException;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class BrowsersOptions {



    @Test

    public void SllExeption() {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");

    }

    @Test
    public void FirefoxOptions() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setAcceptInsecureCerts(true);
        firefoxOptions.addArguments("--incognito");
        firefoxOptions.addArguments("--width=920");
        firefoxOptions.addArguments("--height=1080");
        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.get("https://automationtesting.co.uk");

    }

    @Test
    public void ManagingCookies() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setAcceptInsecureCerts(true);
        firefoxOptions.addArguments("--incognito");
        firefoxOptions.addArguments("--width=920");
        firefoxOptions.addArguments("--height=1080");
        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.get("https://automationtesting.co.uk");

    }




    }




