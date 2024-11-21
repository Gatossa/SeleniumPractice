package AutomationDifferentTests;

import BaseSetUp.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class relativeLocators extends base {

    @Test
    public void relativeLocators() throws InterruptedException {
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
        WebElement lastNameTextField =driver.findElement(RelativeLocator.
                with(By.xpath("//input[@name='last_name']")));
        //above
        WebElement firstNameTextField= driver.findElement(RelativeLocator.with(By.tagName("input")).above(lastNameTextField));

        //below
        WebElement emailTextField= driver.findElement(RelativeLocator.with(By.tagName("input")).below(lastNameTextField));
        WebElement commentTextField= driver.findElement(RelativeLocator.with(By.tagName("textarea")).below(lastNameTextField));
        WebElement resetBtn= driver.findElement(RelativeLocator.with(By.tagName("input")).below(commentTextField));

        WebElement submitBtn = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(resetBtn));

        //filling the fields
        firstNameTextField.sendKeys("Joanna");
        lastNameTextField.sendKeys("King");
        emailTextField.sendKeys("joannaking@com.pl");
        commentTextField.sendKeys("I can use relative locators and I am proud of it");
        //resetBtn.click();
        submitBtn.click();

        Thread.sleep(3000);

    }





    }





