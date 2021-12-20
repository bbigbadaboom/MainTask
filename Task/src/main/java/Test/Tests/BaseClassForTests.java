package Test.Tests;

import Test.Driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public class BaseClassForTests {
    protected WebDriver driver;
    @BeforeClass(alwaysRun = true)
    protected void initBrowser() {
        driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @AfterClass
    protected void kill() {
        driver.quit();
    }
}
