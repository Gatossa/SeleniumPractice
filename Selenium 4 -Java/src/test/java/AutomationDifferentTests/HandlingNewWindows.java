package AutomationDifferentTests;

import BaseSetUp.base;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HandlingNewWindows extends base {
@Test
    public void newWindow(){
        driver.get("http://webdriveruniversity.com");
        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://automationteststore.com/");

        driver.manage().window().maximize();

        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(0));
        System.out.println("Current URL is " + driver.getCurrentUrl());
        driver.switchTo().window(windows.get(1));
        System.out.println("Current URL is " + driver.getCurrentUrl());
        driver.close();
    driver.switchTo().window(windows.get(0));
    System.out.println("Current URL is " + driver.getCurrentUrl());
        }
}
