package BaseObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ShopHomepage {
    public WebDriver driver;

    By product1 = By.linkText("Hummingbird Printed T-Shirt");
    By product2 = By.linkText("Hummingbird Printed Sweater");
    By product3 = By.linkText("The Best Is Yet To Come'...");
    By product4 = By.linkText("The Adventure Begins Framed...");
    By product5 = By.linkText("Today Is A Good Day Framed...");
    By product6 = By.linkText("Mug The Best Is Yet To Come");
    By product7 = By.linkText("Mug The Adventure Begins");
    By product8 = By.linkText("Mug Today Is A Good Day");

    public ShopHomepage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getProd1() {
        return driver.findElement(product1);
    }

    public WebElement getProd2() {
        return driver.findElement(product2);
    }

    public WebElement getProd3() {
        return driver.findElement(product3);
    }

    public WebElement getProd4() {
        return driver.findElement(product4);
    }

    public WebElement getProd5() {
        return driver.findElement(product5);
    }

    public WebElement getProd6() {
        return driver.findElement(product6);
    }

    public WebElement getProd7() {
        return driver.findElement(product7);
    }

    public WebElement getProd8() {
        return driver.findElement(product8);
    }



}
