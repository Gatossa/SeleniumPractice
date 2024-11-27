package InteractionsWithWebElements;

import BaseTestsSetting.BaseDriversSettings;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends BaseDriversSettings {

    @Test
    public void JavaScriptExecutorInAction(){

        driver.get(getUrl1());
        WebElement basicLink=driver.findElement(By.linkText("Podstawowa strona testowa"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",basicLink);

        WebElement firstName= driver.findElement(By.name("fname"));
        js.executeScript(("arguments[0].setAttribute('value','ImiezJS')"),firstName);



    }


}
