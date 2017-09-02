import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
//    private final By LOGOUT_LOCATOR = By.xpath("//a[@href='logout.do']");
    private final String ADDITIONAL_URL = "/login.do?logout=true&tz=GMT%2B06:00";

    @FindBy(xpath = "//a[@href='logout.do']")
    private WebElement logoutButton;
//    private Decorator DlogoutButton;

    protected AbstractPage(){
        PageFactory.initElements(Driver.getDriverInstance(), this);
//        PageFactory.initElements(Driver.getDriverInstance(), Decorator.class);

    }

    public void open(String baseUrl){
        Driver.getDriverInstance().get(baseUrl + ADDITIONAL_URL);
    }

    public void logout(){
        Waiters.waitForElementVisible(logoutButton);
        Waiters.waitForElementEnabled(logoutButton);
        logoutButton.click();
    }

    public void confirmation(){
        Driver.getDriverInstance().switchTo().alert().accept();
    }
}
