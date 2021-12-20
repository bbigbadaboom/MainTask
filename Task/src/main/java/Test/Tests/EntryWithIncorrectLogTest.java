package Test.Tests;

import Test.BO.UserTwo;
import Test.PageFactory.HomePageForMira;
import Test.PageFactory.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EntryWithIncorrectLogTest extends BaseClassForTests {
    @Test
    public void testEntry() {
        HomePageForMira hp = new HomePageForMira(driver);
        hp.open();
        hp.enterLog(new UserTwo().getLog());
        hp.enterPass(new UserTwo().getPass());
        MainPage mp = hp.enterAcc();
        Assert.assertEquals(driver.switchTo().alert().getText(), "Неверные данные для авторизации");
    }
}
