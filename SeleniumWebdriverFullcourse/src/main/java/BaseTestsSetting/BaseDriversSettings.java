package BaseTestsSetting;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

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

public class BaseDriversSettings {

    public WebDriver driver;
    private String url;


    @BeforeTest
    public void setUp() throws IOException {
        Properties properties = new Properties();
        FileInputStream propFile = new FileInputStream(System.getProperty("user.dir")
                + "/src/main/resources/config.properties");
        properties.load(propFile);
        String browserTypes = properties.getProperty("browser").toLowerCase().trim();

        switch (browserTypes) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new ChromeDriver(chromeOptions);
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                chromeOptions.setAcceptInsecureCerts(true);
                chromeOptions.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
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
                driver = new RemoteWebDriver(new URL("http://localhost:4444"), gridChromeOptions);
                break;


        }


        driver.manage().window().maximize();


    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}









