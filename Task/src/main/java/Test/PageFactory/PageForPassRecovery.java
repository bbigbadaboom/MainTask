package Test.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageForPassRecovery extends AbstractPage {

    @FindBy(name = "loginOrEmail")
    private WebElement boxForEmail;

    @FindBy(xpath = "//button[@class = 'mira-page-forgot-password-button']") // черн
    private WebElement btnForSend;

    @FindBy(xpath = "//div[text() = 'Назад к входу в систему']")
    private WebElement btnToGoBack;

    @FindBy(xpath = "//div[text() = 'Пользователь с таким именем не найден.']")
    private WebElement messageForBadLog;

    @FindBy(xpath = "//div[text() = 'На ваш электронный адрес отправлена инструкция по восстановлению пароля.']")
    private WebElement succesRecoveryMessage;

    public PageForPassRecovery(WebDriver driver) {
        super(driver);
    }

    public HomePageForMira goBackToLogPage() {
        btnToGoBack.click();
        return new HomePageForMira(driver);
    }

    public void enterLogin(String login) {
        boxForEmail.sendKeys(login);
    }

    public void pressBtnForSend() {
        btnForSend.click();
    }

    public WebElement getMessageForBadLog() {
        return messageForBadLog;
    }

    public WebElement getSuccesRecoveryMessage() {
        return succesRecoveryMessage;
    }
}
