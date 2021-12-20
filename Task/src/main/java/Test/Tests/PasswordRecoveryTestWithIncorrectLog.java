package Test.Tests;

import Test.BO.UserThree;
import Test.BO.UserTwo;
import Test.PageFactory.HomePageForMira;
import Test.PageFactory.PageForPassRecovery;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PasswordRecoveryTestWithIncorrectLog extends BaseClassForTests {
    @Test
    public void testEntry() {
        HomePageForMira hp = new HomePageForMira(driver);
        hp.open();
        PageForPassRecovery pageForPassRecovery = hp.openRecoveryPage();
        pageForPassRecovery.enterLogin(new UserTwo().getLog());
        pageForPassRecovery.pressBtnForSend();
        Assert.assertTrue(pageForPassRecovery.getMessageForBadLog().isDisplayed());
    }
}
