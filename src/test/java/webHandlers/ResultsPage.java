package webHandlers;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ResultsPage {

    @Test(priority = 0, enabled = true)
    public void ResultsPageFunction() throws InterruptedException {

        TestClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TestClass.getDriver().findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy S20 FE (Cloud Navy, 128 GB)')]")).click();

    }
}
