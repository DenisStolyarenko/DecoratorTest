import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends AbstractPage {

    @FindBy(xpath = "//td[@id='headerLogin']/div[@class='blInfoLogin']")
    private WebElement loggedLabel;

    @FindBy(xpath = "//td[@class='header1']/h1[text()='Dashboard']")
    private WebElement dashboardLabel;

    public DashBoardPage() {
        this.loggedLabel = new Decorator(loggedLabel);
        this.dashboardLabel = new Decorator(dashboardLabel);
    }

    public String readLoggedinText(){
        Waiters.waitForElementPresent(dashboardLabel);
        return loggedLabel.getText();
    }
}
