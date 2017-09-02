import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Service {
    protected static String border_3PX_green = "'3px solid green'";
    protected static String border_0PX = "'0px'";

    protected static void HighlightOfElement(WebElement element){
        ((JavascriptExecutor) Driver.getDriverInstance()).executeScript("arguments[0].style.border=" + border_3PX_green, element);
    }
}
