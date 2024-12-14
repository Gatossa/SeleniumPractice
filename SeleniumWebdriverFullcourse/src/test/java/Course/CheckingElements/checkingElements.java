package Course.CheckingElements;

import BaseTestsSetting.BaseDriversSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkingElements extends BaseDriversSettings {

    @Test
    public void ElementsChecking() {
        driver.get(getUrl2());
        System.out.println(isElementPresent(By.tagName("p")) + "\n" + " Element exists and is visible on the page.");
        System.out.println(isElementPresent(By.id("topSecret")) + "\n" + " Element is not visible on the page.");
        System.out.println("Element is displayed: " + "\n" + driver.findElement(By.tagName("p")).isDisplayed());
        System.out.println("Element is checked/selected: " + "\n" + driver.findElement(By.cssSelector("[type='checkbox']")).isSelected());
    }

    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;

        } catch (NoSuchElementException ex) {
            return false;

        }


    }

    public boolean isElementPresent2(By locator) {

        return driver.findElements(locator).size() > 0;

    }

    @Test
    public void CheckingUploadingOfThePicture() {
        driver.get(getUrl2());
        WebElement image = driver.findElement(By.id("smileImage"));
        System.out.println(image.getAttribute("naturalHeight"));


    }

    @Test
    public void CheckingThePictureNotLoaded() {

        driver.get(getUrl1());
        driver.findElement(By.linkText("Ładowanie obrazka")).click();
        WebElement image = driver.findElement(By.id("smileImage"));
        String ImageHeight=image.getAttribute("naturalHeight");
       Assert.assertEquals("0", ImageHeight);
        System.out.println(image.getAttribute("naturalHeight"));


    }
}

