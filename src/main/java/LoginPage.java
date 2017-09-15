import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@name='username']")
    private Decorator userNameInput;

    @FindBy(xpath = "//input[@name='password']")
    private Decorator passwordInput;

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
