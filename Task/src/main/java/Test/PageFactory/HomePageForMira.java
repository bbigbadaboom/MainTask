package Test.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageForMira extends AbstractPage {
    private static final String URL = "https://lmslite47vr.demo.mirapolis.ru/mira";

    @FindBy(name = "user")
    private WebElement accountEntry;

    @FindBy(xpath = "//input[contains(@placeholder, 'Введите ваш пароль')]")
    private WebElement passwordBox;

    @FindBy(id ="button_submit_login_form")
    private WebElement entryButton;

    @FindBy(id = "show_password")
    private WebElement showPasswordButton;

    @FindBy(css = ".mira-default-login-page-link > div")
    private WebElement forgottenPassButton;

    public HomePageForMira(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    public void enterLog(String log) {
        accountEntry.sendKeys(log);
    }

    public void enterPass(String pass) {
        passwordBox.sendKeys(pass);
    }

    public MainPage enterAcc() {
        entryButton.click();
        return new MainPage(driver);
    }

    public PageForPassRecovery openRecoveryPage() {
        forgottenPassButton.click();
        return new PageForPassRecovery(driver);
    }

    public void showPass() {
        showPasswordButton.click();
    }

    public WebElement getPasswordBox() {
        return passwordBox;
    }
}
