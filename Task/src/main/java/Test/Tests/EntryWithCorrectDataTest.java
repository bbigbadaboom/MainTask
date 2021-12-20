package Test.Tests;

import Test.BO.UserOne;
import Test.PageFactory.HomePageForMira;
import Test.PageFactory.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EntryWithCorrectDataTest extends BaseClassForTests {
    @Test
    public void testEntry() {
        HomePageForMira hp = new HomePageForMira(driver);
        hp.open();
        hp.enterLog(new UserOne().getLog());
        hp.enterPass(new UserOne().getPass());
        MainPage mp = hp.enterAcc();
        Assert.assertTrue(mp.getButtonForNewLetter().isDisplayed());
    }
}
