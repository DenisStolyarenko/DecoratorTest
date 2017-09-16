package framework.decorating.elements;

import framework.utils.Service;
import org.openqa.selenium.WebElement;

public class TextInput extends Element {
    public TextInput(WebElement webElement) {
        super(webElement);
    }

    public void sendKeys(CharSequence... keysToSend) {
        Service.HighlightOfElement(webElement);
        webElement.sendKeys(keysToSend);
    }
}
