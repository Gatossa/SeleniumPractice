package WebElementsLocalisation;

import BaseTestsSetting.BaseDriversSettings;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CSSLocalisation extends BaseDriversSettings {

    @Test
    public void findingElements() {
        driver.get(getUrl2());
        driver.findElement(By.cssSelector("#clickOnMe"));
        driver.findElement(By.cssSelector(".topSecret"));
        driver.findElement(By.cssSelector("input"));
        driver.findElement(By.cssSelector("[value='volvo']"));



    }








}
