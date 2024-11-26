package InteractionsWithWebElements;

import BaseTestsSetting.BaseDriversSettings;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class InteractionsPart1 extends BaseDriversSettings {

    @Test
    public void ClickingOnElements() throws InterruptedException {
        driver.get(getUrl1());
        //clicking
        driver.findElement(By.linkText("Podstawowa strona testowa")).click();
        driver.findElement(By.cssSelector("button#clickOnMe")).click();
        driver.navigate().refresh();
        driver.findElement(By.name("fname")).sendKeys("Joanna");

        //radio buttons and checkboxes
        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        driver.findElement(By.xpath("//form[1]/input[2]")).click();

        //clearing values in the textarea
        Thread.sleep(3000);
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).
                sendKeys("Iwona");
        Thread.sleep(3000);
        driver.findElement(By.name("password")).clear();
        Thread.sleep(3000);
        driver.findElement(By.name("password")).
                sendKeys("password");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
        //dealing with alerts
        Alert alert = driver.switchTo().alert();
        //Store the alert text in a variable and verify it
        String formularzDoAkceptacji = alert.getText();
        assertEquals("Formularz wyslany", formularzDoAkceptacji);
        //Press the OK button, this page requires double confirmation
        alert.accept();
        alert.accept();

        //select option from the dropdown menu
        WebElement chooseACar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(chooseACar);
        cars.selectByValue("volvo");
        List<WebElement> carOptions = cars.getOptions();
        System.out.println("Oto lista atrybutów:  ");
        for (WebElement a : carOptions) {
            System.out.println(a.getAttribute("outerHTML"));
        }
        System.out.println("Oto lista samochodów: ");
        for (WebElement options : carOptions) {
            System.out.println(options.getText());
        }

        CheckingOptionsMethod checkingOptionsMethod=new CheckingOptionsMethod();
        System.out.println(checkingOptionsMethod.checkOptionsInDropDownMenu("Audi", chooseACar));
        System.out.println(checkingOptionsMethod.checkOptionsInDropDownMenu("Citroen", chooseACar));









    }



}














