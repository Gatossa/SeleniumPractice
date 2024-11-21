package ChromeDevTools;

import BaseSetUp.base;
import com.google.common.collect.ImmutableList;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v129.network.Network;
import org.testng.annotations.Test;

import java.util.Optional;

public class NetworkIntercept extends base {

    @Test
    public void networkIntercept() throws InterruptedException {
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();

        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        devTools.send(Network.setBlockedURLs(ImmutableList.of(".png", ".jpg")));

        driver.get("https://www.automationteststore.com/");
        Thread.sleep(3000);
        devTools.send(Network.disable());
    }
}
