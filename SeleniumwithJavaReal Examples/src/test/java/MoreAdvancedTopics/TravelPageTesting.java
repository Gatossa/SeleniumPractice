package MoreAdvancedTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;


public class TravelPageTesting {

    @Test
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.easyjet.com/pl");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.id("ensCloseBanner")).click();
        driver.findElement(By.cssSelector("input#from")).click();
        driver.findElement(By.cssSelector("input#from")).sendKeys("Londyn");


        List<WebElement> listaLotniskZ = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[data-testid='airport-name']")));

        for (WebElement lotniska : listaLotniskZ) {
            if (lotniska.getText().contains("Luton")) {
                System.out.println(lotniska.getText()); //to check if the list is printed
                lotniska.click();
                break;  //to avoid StaleException
            }

        }

        driver.findElement(By.cssSelector("input#to")).click();
        driver.findElement(By.cssSelector("input#to")).sendKeys("A");
        List<WebElement> listaLotniskDo = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy
                        (By.cssSelector("[data-testid='airport-label']")));

        for (WebElement lotniska2 : listaLotniskDo) {
            if (lotniska2.getText().contains("YT)"))       //Antalya
            {
                System.out.println(lotniska2.getText()); //to check if the list is printed
                lotniska2.click();
                break;  //to avoid StaleException
            }

        }
        driver.findElement(By.cssSelector("[data-testid='when']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.cssSelector("button[data-testid='31-12-2024']"))).click();

        //WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.visibilityOfElementLocated
                //(By.cssSelector("button[data-testid='03-01-2025']"))).click();



        //driver.findElement(By.cssSelector("[input#who]")).click();
        //driver.findElement(By.cssSelector("[data-testid='toggleThumb']")).click();


       // WebDriverWait wait1 =new WebDriverWait(driver, Duration.ofSeconds(5));
       // wait1.until(ExpectedConditions.visibilityOfElementLocated
                //(By.cssSelector("[data-testid='submit']"))).click();





            }

        }
















