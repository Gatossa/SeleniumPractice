package InteractionsWithWebElements;

import BaseTestsSetting.BaseDriversSettings;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.Array;
import java.util.ArrayList;

public class InteractionsPart2 extends BaseDriversSettings {

    @Test
    public void MoreAdvancedInteractions() throws InterruptedException {
        driver.get(getUrl2());

        WebElement userName = driver.findElement(By.name("username"));
        userName.clear();
        userName.sendKeys("Iwona");
        //retrieving the value from the text field
        System.out.println(userName.getAttribute("value"));

        //retrieving the hidden value from the text field
        WebElement hiddenText = driver.findElement(By.className("topSecret"));
        System.out.println(hiddenText.getAttribute("textContent"));


        driver.findElement(By.id("newPage")).click();
        System.out.println("Current URL is " + driver.getCurrentUrl());
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        System.out.println(windows);
        driver.switchTo().window(windows.get(1));
        System.out.println("Current URL is " + driver.getCurrentUrl());
        driver.findElement(By.id("L2AGLb")).click();
        driver.manage().window().maximize();
        driver.findElement(By.id("APjFqb")).sendKeys("Automatyzacja testów", Keys.ENTER);
        driver.switchTo().window(windows.getFirst());
        System.out.println("Current URL is " + driver.getCurrentUrl());


    }

    //IFrame
    @Test
    public void IFrames() throws InterruptedException {
        driver.get(getUrl1());

        driver.findElement(By.linkText("Strona z iframe")).click();

        driver.switchTo().frame(0);
        driver.findElement(By.id("fname")).sendKeys("Name1");
        Thread.sleep(3000);

        driver.findElement(By.id("fname")).clear();
        Thread.sleep(3000);

        System.out.println(driver.findElement(By.tagName("h1")).getText());
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.tagName("h1")).getText());

        WebElement iframe1=driver.findElement(By.cssSelector("[src='basics.html']"));
        driver.switchTo().frame(iframe1);
        driver.findElement(By.id("fname")).sendKeys("Name2");
        Thread.sleep(3000);






        //driver.switchTo().frame();



    }
}
