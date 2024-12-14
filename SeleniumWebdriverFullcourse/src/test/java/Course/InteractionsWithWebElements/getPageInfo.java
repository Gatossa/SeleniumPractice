package Course.InteractionsWithWebElements;

import BaseTestsSetting.BaseDriversSettings;
import org.testng.annotations.Test;

public class getPageInfo extends BaseDriversSettings {

    @Test
    public void pageInfo(){
        driver.get(getUrl2());
        System.out.println( "To tytuł strony: " + "\n" + driver.getTitle());

        System.out.println("To bieżący URL: " + "\n" + driver.getCurrentUrl());
        System.out.println("A to numer zakładki: " + "\n" + driver.getWindowHandle());
        System.out.println( "To żródło strony: "  + "\n"+ driver.getPageSource());



    }
}
