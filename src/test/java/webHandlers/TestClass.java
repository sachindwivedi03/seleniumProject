package webHandlers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestClass {


    private static WebDriver driver;


    public static WebDriver getDriver() {
        return driver;
    }


    @BeforeSuite
    public void beforeSuite() {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium chrome webdriver//chromedriver.exe");// path to web driver
        driver = new ChromeDriver();

    }

    @AfterSuite
    public void afterSuite() throws InterruptedException {
        driver.close();
        driver.quit();
    }

}
