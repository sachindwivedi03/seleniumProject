package webHandlers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    @Test (priority = 0, enabled = true)
    public void LoginPageFunction() throws InterruptedException {

        String userId = "Enter user id here";
        String password = "Enter password here";

        TestClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TestClass.getDriver().get("https://www.flipkart.com/");
        TestClass.getDriver().findElement(By.xpath("//div[@class='IiD88i _351hSN']//child::input[@type='text']")).sendKeys(userId);
        TestClass.getDriver().findElement(By.xpath("//div[@class='IiD88i _351hSN']//child::input[@type='password']")).sendKeys(password);
        TestClass.getDriver().findElement(By.xpath("//div[@class='IiD88i _351hSN']//child::input[@type='password']")).sendKeys(Keys.ENTER);



        SoftAssert softAssertion= new SoftAssert();
        softAssertion.assertTrue(TestClass.getDriver().findElements(By.xpath("//div[@class='mw-parser-output']//p[2]")).isEmpty());

    }
}
