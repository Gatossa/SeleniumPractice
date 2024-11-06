package Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {
        @Test
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://automationtesting.co.uk/loader.html");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
            driver.findElement(By.cssSelector("button#loaderBtn")).click();

        }
    }



