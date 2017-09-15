import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends AbstractPage {

    @FindBy(xpath = "//td[@id='headerLogin']/div[@class='blInfoLogin']")
    private Decorator loggedLabel;

    @FindBy(xpath = "//td[@class='header1']/h1[text()='Dashboard']")
    private Decorator dashboardLabel;

    public String readLoggedinText(){
        Waiters.waitForElementPresent(dashboardLabel);
        return loggedLabel.getText();
    }
}
