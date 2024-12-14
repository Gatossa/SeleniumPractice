package Course.WebElementsLocalisation;

import BaseTestsSetting.BaseDriversSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebElementsLocalisationExamples extends BaseDriversSettings {

    @Test
    public void findingElements() {
        driver.get(getUrl1());
        driver.findElement(By.linkText("Podstawowa strona testowa")).click();
        driver.findElement(By.id("clickOnMe"));
        driver.navigate().refresh();
        driver.findElement(By.name("fname")).sendKeys("Joanna");
        driver.findElement(By.className("topSecret"));
        driver.findElement(By.partialLinkText("W3Scho"));


        }

    @Test
    public void linksLists() {
        driver.get(getUrl1());
        driver.findElement(By.linkText("Podstawowa strona testowa")).click();
        List<WebElement> linki = driver.findElements(By.tagName("a"));
        System.out.println("Liczba linków " + linki.size());
        System.out.println("Oto lista linkow ");
        for (WebElement a : linki) {
            System.out.println(a.getAttribute("outerHTML"));
        }

    }

    @Test
    public void inputLists(){
        driver.get(getUrl1());
        driver.findElement(By.linkText("Podstawowa strona testowa")).click();
        List<WebElement> inputExamples = driver.findElements(By.tagName("input"));
        System.out.println("Oto lista inputów ");
        System.out.println("Liczba inputów " + inputExamples.size());
        for (WebElement input : inputExamples) {
            System.out.println(input.getAttribute("outerHTML"));}


}
}

