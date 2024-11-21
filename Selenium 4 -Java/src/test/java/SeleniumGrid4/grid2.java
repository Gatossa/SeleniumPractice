package SeleniumGrid4;

import BaseSetUp.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class grid2 extends base{


        @Test
        public void interactions2() throws InterruptedException {
            driver.get("https://webdriveruniversity.com/Actions/index.html");

            Actions actionProvider=new Actions(driver);

            //double click
            WebElement doubleClick= driver.findElement(By.id("double-click"));
            actionProvider.doubleClick(doubleClick).release().build().perform();
            Thread.sleep(3000);

            //click and hold
            WebElement clickAndHold =driver.findElement(By.id("click-box"));
            actionProvider.clickAndHold(clickAndHold).build().perform();
            actionProvider.release(clickAndHold).build().perform();
            Thread.sleep(3000);


            //drag and drop
            WebElement draggableItem= driver.findElement(By.id("draggable"));
            WebElement fieldToDragTheItem= driver.findElement(By.id("droppable"));
            actionProvider.moveToElement(draggableItem).clickAndHold().moveToElement(fieldToDragTheItem).
                    clickAndHold().release().build().perform();
            Thread.sleep(3000);

            //hover

            WebElement hover1=driver.findElement(By.cssSelector("div:nth-of-type(1) > .dropbtn"));
            actionProvider.moveToElement(hover1).pause(Duration.ofSeconds(3)).build().perform();
            Thread.sleep(3000);







        }

    }


