import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseInfo {
    public static WebDriver driver;
    private String url;
    private Properties prop;

    public BaseInfo() throws IOException {
        prop = new Properties();
        FileInputStream data = new FileInputStream(
                System.getProperty("user.dir") + "/src/main/resources/configuration.properties");
        prop.load(data);
    }

    public WebDriver getDriver() {
        if (prop.getProperty("browser").equals("chrome")) {
            driver = new ChromeDriver();
        } else if (prop.getProperty("browser").equals("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    public String getUrl() throws IOException {
        url = prop.getProperty("url");
        return url;
    }

    public void photo (WebDriver photoTest) throws IOException {
        File srcFile = ((TakesScreenshot) photoTest).getScreenshotAs(OutputType.FILE);

        File destFile = new File("/src/test/java/Screenshots" + timestamp() + ".png");

        FileUtils.copyFile(srcFile, destFile);
    }

    public String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
}




