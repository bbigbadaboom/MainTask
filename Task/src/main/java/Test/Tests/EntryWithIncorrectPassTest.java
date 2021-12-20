package Test.Tests;

import Test.BO.UserThree;
import Test.PageFactory.HomePageForMira;
import Test.PageFactory.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EntryWithIncorrectPassTest extends BaseClassForTests {
    @Test
    public void testEntry() {
        HomePageForMira hp = new HomePageForMira(driver);
        hp.open();
        hp.enterLog(new UserThree().getLog());
        hp.enterPass(new UserThree().getPass());
        MainPage mp = hp.enterAcc();
        Assert.assertEquals(driver.switchTo().alert().getText(), "Неверные данные для авторизации");
    }
}
