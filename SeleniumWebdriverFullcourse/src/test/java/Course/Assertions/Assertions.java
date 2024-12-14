package Course.Assertions;

import BaseTestsSetting.BaseDriversSettings;
import Course.TestListeners.TestListener;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

@Listeners(value={TestListener.class})

public class Assertions extends BaseDriversSettings {

    @Test
    public void HardAssertions() throws InterruptedException {
        driver.get(getUrl1());
        driver.findElement(By.linkText("Oczekiwanie na element II")).click();

        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();
        Thread.sleep(5000);
        WebElement para = driver.findElement(By.cssSelector("p"));

        Assert.assertEquals(para.getText(), "Dopiero się pojawiłem!", "Teksty są identyczne");
        Assert.assertTrue(para.getText().startsWith("Dopiero"));
        Assert.assertTrue(para.isDisplayed());
        Assert.assertFalse(para.getText().startsWith("Nie to"));
                  //Assert.assertEquals(para, "Dopiero się poojawiłem!", "Teksty się róznią");


    }


    @Test
    public void SoftAssertions() throws InterruptedException {
        driver.get(getUrl1());
        driver.findElement(By.linkText("Oczekiwanie na element II")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();
        WebElement para = driver.findElement(By.cssSelector("p"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(para.getText(), "Dopiero się poojawiłem!", "Teksty się różnią");
        Assert.assertEquals(para.getText(), "Dopiero się pojawiłem!");
        Assert.assertTrue(para.getText().startsWith("Dopiero"));

        Assert.assertTrue(para.isDisplayed());
        Assert.assertFalse(para.getText().startsWith("Nie to"));
        softAssert.assertTrue(para.getText().startsWith("Nie to"), "Soft assertion verified");
        softAssert.assertAll();


    }
}

































