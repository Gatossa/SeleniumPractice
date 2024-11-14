package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class BrowserTabs {

    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationtesting.co.uk/browserTabs.html");
        driver.manage().window().maximize();
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.cssSelector("[type]")).click();
        }

        ArrayList<String> WindowsHandles = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(WindowsHandles.size());

        for (String item : WindowsHandles) {
            Thread.sleep(2000);
            driver.switchTo().window(item);

        }
        Thread.sleep(2000);
        driver.switchTo().window(WindowsHandles.get(0));
    }
}
