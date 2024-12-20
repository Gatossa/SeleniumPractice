package TravelApplicationTest;

import BaseTestsSetting.BaseDriversSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class searchHotel extends BaseDriversSettings {

//STRONA NIE DZIALA
    @Test
    public void findingHotel() throws InterruptedException {
        driver.get(getUrl3());
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        driver.navigate().refresh();
       driver.findElement(By.xpath("//span[text()='Search by Hotel or City Name'")).click();
//cityField.sendKeys("Dubai");







    }





}
