import org.testng.annotations.Test;

public class CheckingDecoratorTest {
    private LoginPage loginPage = new LoginPage();

    @Test(description = "Log in")
    public void login(){
        loginPage.open("https://tst2.epm-ctc.projects.epam.com/");
        loginPage.login("dab","1q2w3e4r5t");
    }

    @Test(description = "Log out", dependsOnMethods ="login")
    public void logOut(){
        loginPage.logout();
        loginPage.confirmation();
    }
}
