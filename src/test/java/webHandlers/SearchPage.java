package webHandlers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchPage {

    @Test (priority = 0, enabled = true)
    public void SearchPageFunction() throws InterruptedException {

        String searchKeyword = "Samsung galaxy S20 fe";

        TestClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        By search = By.xpath("//input[@name='q']");
        TestClass.getDriver().findElement(search).sendKeys(searchKeyword);
        TestClass.getDriver().findElement(search).sendKeys(Keys.ENTER);



    }
}