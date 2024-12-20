package TravelApplicationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReservationPageObjects {

    public WebDriver driver;

    public ReservationPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    By cityField = By.cssSelector("div#select2-drop  .select2-input");



    public WebElement getCityField() {return driver.findElement(cityField);

    }


    }















