import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Webdrivers{

    public static void main(String[] args) {
        ChromeOptions chromeoptions=new ChromeOptions();
                chromeoptions.setAcceptInsecureCerts(true);
                //chromeoptions.addArguments("--start-maximized");
                chromeoptions.addArguments("--incognito");
        WebDriver driver=new ChromeDriver(chromeoptions);
        driver.get("https://www.webdriveruniversity.com/");
        driver.manage().window().maximize();
        driver.quit();
        driver.findElement().h


        FirefoxOptions firefoxOptions=new FirefoxOptions();
        firefoxOptions.setAcceptInsecureCerts(true);
        //firefoxOptions.addArguments("--width=920");
        //firefoxOptions.addArguments("--height=1080");
        firefoxOptions.addArguments("--incognito");
        WebDriver driver1=new FirefoxDriver(firefoxOptions);
        driver1.get("https://www.webdriveruniversity.com/");
        //driver1.manage().window().setSize(new Dimension(1024, 868));
        driver1.manage().window().maximize();
            driver1.quit();


//
//
//        WebDriver driver2=new EdgeDriver();
//        driver2.get("https://www.webdriveruniversity.com/");
//        driver2.manage().window().maximize();
//       driver2 .quit();
    }
}


