import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
//    private final By USER_NAME_INPUT_LOCATOR = By.xpath("//input[@name='username']");
//    private final By PASSWORD_INPUT_LOCATOR = By.xpath("//input[@name='password']");
//    private final By LOGIN_BUTTON_LOCATOR = By.xpath("//input[@name='Login']");
//    private final By LOGIN_PAGE_TEXT_LOCATOR = By.xpath("//td[@class='header1']/h1");

    @FindBy(xpath = "//input[@name='username']")
    private WebElement userNameInput;
    private Decorator userNameInputD;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;
    private Decorator passwordInputD;

    @FindBy(xpath = "//input[@name='Login']")
    private Decorator loginButton;

    @FindBy(xpath = "//td[@class='header1']/h1")
    private Decorator loginPageText;


    public DashBoardPage login(String userName, String pwdName){
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(pwdName);
        loginButton.click();
        return new DashBoardPage();
    }

    public String readIntroductionText(){
        Waiters.waitForElementVisible(loginPageText);
        return loginPageText.getText();
    }
}
