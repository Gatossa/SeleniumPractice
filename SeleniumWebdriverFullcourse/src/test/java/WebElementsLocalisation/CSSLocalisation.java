package WebElementsLocalisation;

import BaseTestsSetting.BaseDriversSettings;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CSSLocalisation extends BaseDriversSettings {

    @Test
    public void findingElementsByCSS() {
        driver.get(getUrl2());
        driver.findElement(By.cssSelector("#clickOnMe"));
        driver.findElement(By.cssSelector(".topSecret"));
        driver.findElement(By.cssSelector("input"));
        driver.findElement(By.cssSelector("[value='volvo']"));


    }


    @Test
    public void findingElementsByXPath() {
        driver.get(getUrl2());
        driver.findElement(By.xpath("//button[@id='clickOnMe']"));
        driver.findElement(By.xpath("//p[@class='topSecret']"));
        driver.findElement(By.xpath("//input[@id='fname']"));
        driver.findElement(By.xpath("//div/ul/li[3]"));


    }
}
