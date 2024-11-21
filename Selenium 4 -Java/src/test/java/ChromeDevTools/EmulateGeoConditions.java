package ChromeDevTools;

import BaseSetUp.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class EmulateGeoConditions extends base {

    @Test
            public void MockLocations() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", Map.of(
                "profile.default_content_setting_values.geolocation", 1
        ));
        WebDriver driver = new ChromeDriver(options);

        Map<String, Object> coordinates = new HashMap<>();
        coordinates.put("latitude", 27.9805);
        coordinates.put("longitude", -82.4847);
        coordinates.put("accuracy", 100);

        ((ChromeDriver) driver).executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
        Thread.sleep(5000);

        driver.get("https://locations.kfc.com/search");



        WebElement useLocationLink = driver.findElement(By.cssSelector("button[data-ya-track='geolocate']"));
        useLocationLink.click();
        Thread.sleep(5000);




    }

}
