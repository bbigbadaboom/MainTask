package Test.Tests;

import Test.BO.UserOne;
import Test.PageFactory.HomePageForMira;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShowPassTest extends BaseClassForTests {
    @Test
    public void showPass() {
        HomePageForMira hp = new HomePageForMira(driver);
        hp.open();
        hp.enterPass(new UserOne().getPass());
        hp.showPass();
        Assert.assertEquals(hp.getPasswordBox().getAttribute("type"), "text");
    }
}
