package framework.page;

import framework.driver.Driver;
import framework.decorating.elements.Button;
import framework.decorating.elements.TextInput;
import framework.decorating.CustomFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@name='username']")
    private TextInput userNameInput;

    @FindBy(xpath = "//input[@name='password']")
    private TextInput passwordInput;

    @FindBy(xpath = "//input[@name='Login']")
    private Button loginButton;

    @FindBy(xpath = "//td[@class='header1']/h1")
    private WebElement loginPageText;

//    public framework.page.LoginPage() {
//        this.userNameInput = new framework.utils.CustomDecorator(userNameInput);
//        this.passwordInput = new framework.utils.CustomDecorator(passwordInput);
//        this.loginButton = new framework.utils.CustomDecorator(loginButton);
//        this.loginPageText = new framework.utils.CustomDecorator(loginPageText);
//    }


//    public LoginPage() {
//        PageFactory.initElements(new CustomFieldDecorator(Driver.getDriverInstance()), this);
//    }

    public DashBoardPage login(String userName, String pwdName){
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(pwdName);
        loginButton.click();
        return new DashBoardPage();
    }

    public String readIntroductionText(){
//        Waiters.waitForElementVisible(loginPageText);
        return loginPageText.getText();
    }
}
