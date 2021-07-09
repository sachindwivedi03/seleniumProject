package webHandlers;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;
public class ProductPage {

        @Test(priority = 0, enabled = true)
        public void ProductPageFunction() throws InterruptedException {

            TestClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // to switch the active window
            Set<String> windowHandles = TestClass.getDriver().getWindowHandles();
            for(String winHandle : TestClass.getDriver().getWindowHandles()){
                TestClass.getDriver().switchTo().window(winHandle);
            }

            // add to cart button
            TestClass.getDriver().findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

            Assert.assertTrue(TestClass.getDriver().findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).isDisplayed());


        }
}
