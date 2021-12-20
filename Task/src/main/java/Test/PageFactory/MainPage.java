package Test.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {

    @FindBy(xpath = "//span[text() =  'Главная страница']")
    private WebElement buttonForNewLetter;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getButtonForNewLetter() {
        return buttonForNewLetter;
    }
}
