package framework.page;

import framework.driver.Driver;
import framework.decorating.elements.Button;
import framework.decorating.CustomFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
    private final String ADDITIONAL_URL = "/login.do?logout=true&tz=GMT%2B06:00";
    //Locators

    @FindBy(xpath = "//a[@href='logout.do']")
    private Button logoutButton;

    protected AbstractPage(){
//        PageFactory.initElements(framework.driver.Driver.getDriverInstance(), this);
//        PageFactory.initElements(Driver.getDriverInstance(), CustomDecorator.class);
        PageFactory.initElements(new CustomFieldDecorator(Driver.getDriverInstance()), this);

    }

    public void open(String baseUrl){
        Driver.getDriverInstance().get(baseUrl + ADDITIONAL_URL);
    }

    public void logout(){
//        Waiters.waitForElementVisible(logoutButton);
//        Waiters.waitForElementEnabled(logoutButton);
        logoutButton.click();
    }

    public void confirmation(){
        Driver.getDriverInstance().switchTo().alert().accept();
    }
}
