package BaseTestsSetting;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import static java.sql.DriverManager.getDriver;

public class BaseDriversSettings {

    public WebDriver driver;
    private String url1;
    private String url2;
    private String url3;


    @BeforeTest
    public void setUp() throws IOException {

        Properties properties = new Properties();
        FileInputStream propFile = new FileInputStream(System.getProperty("user.dir")
                + "/src/main/resources/config.properties");
        properties.load(propFile);

        url1 = properties.getProperty("url1").trim();
        url2 = properties.getProperty("url2").trim();
        url3 = properties.getProperty("url3").trim();
        String browserTypes = properties.getProperty("browser").toLowerCase().trim();


        switch (browserTypes) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                //chromeOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080");
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                chromeOptions.setAcceptInsecureCerts(true);
                chromeOptions.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
                driver = new ChromeDriver(chromeOptions);
                break;

            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                driver = new FirefoxDriver(firefoxOptions);
                firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

                break;

            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                driver = new EdgeDriver(edgeOptions);
                edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                break;

            case "grid":
                ChromeOptions gridChromeOptions = new ChromeOptions();
                gridChromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                gridChromeOptions.addArguments("start-maximized");
                driver = new RemoteWebDriver(new URL("http://localhost:4444"),
                        gridChromeOptions);
                break;


        }


        driver.manage().window().maximize();


    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public String getUrl1() {
        return url1;

    }

    public String getUrl2() {
        return url2;

    }

    public String getUrl3() {
        return url3;


    }

}














