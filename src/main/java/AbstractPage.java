import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
    private final String ADDITIONAL_URL = "/login.do?logout=true&tz=GMT%2B06:00";
//    Decorator decorator = new Decorator();

    @FindBy(xpath = "//a[@href='logout.do']")
    private Decorator logoutButton;

    protected AbstractPage(){
//        PageFactory.initElements(Driver.getDriverInstance(), this);
        PageFactory.initElements(Driver.getDriverInstance(), Decorator.class);

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
