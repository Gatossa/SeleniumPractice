package Parametrisation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import java.io.IOException;


public class propertiesFile  extends BasePage{

    public propertiesFile() throws IOException {
        super();
    }


    @Test
    public void sendingDataToForms() throws IOException {

        driver =getDriver();
        driver.get(getUrl());

        driver.findElement(By.cssSelector("input[name='first_name'")).sendKeys("Joanna");
        driver.findElement(By.cssSelector("input[name='last_name'")).sendKeys("Nowak");
        driver.findElement(By.cssSelector("input[name='email'")).sendKeys("nowak@wp.pl");
        driver.findElement(By.cssSelector("textarea[name='message'")).sendKeys("Call me");
        driver.close();
        driver.quit();

    }
    }











