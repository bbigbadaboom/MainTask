package Test.Tests;

import Test.BO.UserOne;
import Test.PageFactory.HomePageForMira;
import Test.PageFactory.PageForPassRecovery;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PasswordRecoveryTestWithCorrectLog extends BaseClassForTests {
    @Test
    public void testEntry() {
        HomePageForMira hp = new HomePageForMira(driver);
        hp.open();
        PageForPassRecovery pageForPassRecovery = hp.openRecoveryPage();
        pageForPassRecovery.enterLogin(new UserOne().getLog());
        pageForPassRecovery.pressBtnForSend();
        Assert.assertTrue(pageForPassRecovery.getSuccesRecoveryMessage().isDisplayed());
        pageForPassRecovery.goBackToLogPage();
        Assert.assertTrue(hp.getPasswordBox().isDisplayed());
    }
}
