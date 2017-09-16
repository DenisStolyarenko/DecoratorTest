package framework.decorating.elements;

import framework.utils.Service;
import org.openqa.selenium.WebElement;

public class Button extends Element {
    public Button(WebElement webElement) {
        super(webElement);
    }

    public void click() {
        Service.HighlightOfElement(webElement);
        webElement.click();
    }

}
