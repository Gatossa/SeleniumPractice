import ProjectPageObjects.Base;
import ProjectPageObjects.ShopMainPage;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


    public class EndToEndTest extends Base {


        public EndToEndTest() throws IOException {
            super();
        }

        @BeforeTest
        public void setup() throws IOException {
            driver = getDriver();
            driver.get(getUrl());
        }
        @AfterTest
        public void tearDown(){
            driver.close();
            driver = null;
        }
        @Test
        public void endToEndTest(){
            System.out.println("Running End-to-End Test");
            ShopMainPage product=new ShopMainPage(driver);
            product.getFrame().click();

        }
    }





