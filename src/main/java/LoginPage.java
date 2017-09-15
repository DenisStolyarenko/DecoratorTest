import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@name='username']")
    private WebElement userNameInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@name='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//td[@class='header1']/h1")
    private WebElement loginPageText;

    public LoginPage() {
        this.userNameInput = new Decorator(userNameInput);
        this.passwordInput = new Decorator(passwordInput);
        this.loginButton = new Decorator(loginButton);
        this.loginPageText = new Decorator(loginPageText);
    }

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
