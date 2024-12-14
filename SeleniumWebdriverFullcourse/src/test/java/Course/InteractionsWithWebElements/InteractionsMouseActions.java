package Course.InteractionsWithWebElements;

import BaseTestsSetting.BaseDriversSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InteractionsMouseActions extends BaseDriversSettings {

        @Test
        public void rightButtonMouseActions(){
            driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");
            Actions action=new Actions(driver);
            action.contextClick(driver.findElement(By.id("myFile"))).perform();
            action.contextClick().perform();
            driver.close();


        }

        @Test
        public void DoubleClickMouseActions(){
            driver.get("https://testeroprogramowania.github.io/selenium/");
            driver.findElement(By.linkText("Podwójne kliknięcie")).click();
            Actions action=new Actions(driver);
            action.doubleClick(driver.findElement(By.id("bottom"))).perform();



        }
        @Test
        public void HoverMouseActions() throws InterruptedException {
            driver.get(getUrl2());
            Actions action=new Actions(driver);
            action.moveToElement(driver.findElement(By.tagName("h1"))).perform();
            Thread.sleep(3000);
            action.moveToElement(driver.findElement(By.linkText("IamWeirdLink"))).perform();
            Thread.sleep(3000);





        }


    }

