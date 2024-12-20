package MoreAdvancedTopics;
import PageObjects.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class TravelEasyJet extends Base {

    public TravelEasyJet() throws IOException {
        super();
    }

    @Test
    public void findingCity() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.findElement(By.id("ensCloseBanner")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//img[@alt='clear']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.cssSelector("input#from")).click();
        driver.findElement(By.cssSelector("input#from")).sendKeys("Londyn");


        List<WebElement> listaLotniskZ = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[data-testid='airport-name']")));

        for (WebElement lotniska : listaLotniskZ) {
            if (lotniska.getText().contains("Luton")) {
                System.out.println(lotniska.getText() + "   Lista lotnisk z"); //to check if the list is printed
                lotniska.click();
                break;  //to avoid StaleException
            }

        }
        driver.findElement(By.cssSelector("input#to")).click();
        driver.findElement(By.cssSelector("input#to")).sendKeys("M");
        List<WebElement> listaLotniskDo = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy
                        (By.cssSelector("[data-testid='airport-label']")));


        for (WebElement lotniska2 : listaLotniskDo) {
            if (lotniska2.getText().contains("AD)"))       //Madryt
            {
                System.out.println(lotniska2.getText() + "   Lista lotnisk do"); //to check if the list is printed
                lotniska2.click();
                break;  //to avoid StaleException

            }

        }

    }

    @Test
    public void choosingWhen() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement shadowHost = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#when")));
        Boolean shadowRootAttached = (Boolean) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].shadowRoot !== null", shadowHost);

        if (shadowRootAttached) {
            WebElement shadowRoot = (WebElement) ((JavascriptExecutor) driver)
                    .executeScript("return arguments[0].shadowRoot", shadowHost);

            WebElement dateField = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(shadowRoot.findElement(By.cssSelector("input#when"))));

            dateField.click();
        } else {
            System.out.println("Shadow root of a date not yet attached.");
        }

//WebDriverWait wait4=new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait4.until(ExpectedConditions.visibilityOfElementLocated
        //(By.cssSelector("input#when")));
        //driver.findElement(By.cssSelector("input#when")).sendKeys(Keys.RETURN);
        //WebElement element = driver.findElement(By.cssSelector("input#when"));
        //Actions actions = new Actions(driver);
        //actions.moveToElement(element).click().perform();
        //actions.moveToElement(element).click().perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",
                driver.findElement(By.cssSelector("input#when")));
        driver.findElement(By.cssSelector("input#when")).click();



        //WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(8));
        //wait2.until(ExpectedConditions.visibilityOfElementLocated
        //(By.cssSelector("input#when"))).click();
        //driver.findElement(By.cssSelector("button[data-testid='3-1-2025']")).click();


    }

    @Test @Ignore
    public void choosingNumberOfPeople(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement shadowHost = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#who")));
        Boolean shadowRootAttached = (Boolean) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].shadowRoot !== null", shadowHost);

        if (shadowRootAttached) {
            WebElement shadowRoot = (WebElement) ((JavascriptExecutor) driver)
                    .executeScript("return arguments[0].shadowRoot", shadowHost);

            WebElement personField = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(shadowRoot.findElement(By.cssSelector("input#who"))));

            personField.click();
        } else {
            System.out.println("Shadow root of a person not yet attached.");
        }
        driver.findElement(By.cssSelector("input#who")).click();
        //button[@aria-label='Dodaj 1 dorosły']
        //WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.visibilityOfElementLocated
        // (By.cssSelector("button[data-testid='3-1-2025']"))).click();
        //driver.findElement(By.cssSelector("input#who")).click();
        //"[data-testid='submit']"
    }




}









//driver.findElement(By.cssSelector("[data-testid='toggleThumb']")).click();

















