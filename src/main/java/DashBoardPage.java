import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends AbstractPage {
//    private final By LOGGED_LABEL_LOCATOR = By.xpath("//td[@id='headerLogin']/div[@class='blInfoLogin']");
//    private final By DASHBOARD_LABEL_LOCATOR = By.xpath("//td[@class='header1']/h1[text()='Dashboard']");

    @FindBy(xpath = "//td[@id='headerLogin']/div[@class='blInfoLogin']")
    private WebElement loggedLabel;

    @FindBy(xpath = "//td[@class='header1']/h1[text()='Dashboard']")
    private WebElement dashboardLabel;

    public String readLoggedinText(){
        Waiters.waitForElementPresent(dashboardLabel);
        return loggedLabel.getText();
    }
}
