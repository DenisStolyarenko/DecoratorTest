import org.openqa.selenium.*;

import java.util.List;

public class Decorator implements WebElement {
    protected WebElement element;

    public Decorator(WebElement element) {
        this.element = element;
    }

    @Override
    public void click() {
        Service.HighlightOfElement(element);
        element.click();
    }

    @Override
    public void submit() {
        element.submit();
    }

    @Override
    public void sendKeys(CharSequence... keysToSend) {
        Service.HighlightOfElement(element);
        element.sendKeys(keysToSend);
    }

    @Override
    public void clear() {
        element.clear();
    }

    @Override
    public String getTagName() {
        return element.getTagName();
    }

    @Override
    public String getAttribute(String name) {
        return element.getAttribute(name);
    }

    @Override
    public boolean isSelected() {
        return element.isSelected();
    }

    @Override
    public boolean isEnabled() {
        return element.isEnabled();
    }

    @Override
    public String getText() {
        return element.getText();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return element.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return element.findElement(by);
    }

    @Override
    public boolean isDisplayed() {
        return element.isDisplayed();
    }

    @Override
    public Point getLocation() {
        return element.getLocation();
    }

    @Override
    public Dimension getSize() {
        return element.getSize();
    }

    @Override
    public Rectangle getRect() {
        return element.getRect();
    }

    @Override
    public String getCssValue(String propertyName) {
        return element.getCssValue(propertyName);
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return element.getScreenshotAs(target);
    }

    //    @Override
//    public void click(){
//        Service.HighlightOfElement(this);
//        this.click();
//    }
//
//    @Override
//    public void submit() {
//        this.submit();
//    }
//
//    @Override
//    public void sendKeys(CharSequence... charSequences) {
//        Service.HighlightOfElement(this);
//        this.sendKeys(charSequences);
//    }
//
//    @Override
//    public void clear() {
//        this.clear();
//    }
//
//    @Override
//    public String getTagName() {
//        return this.getTagName();
//    }
//
//    @Override
//    public String getAttribute(String s) {
//        return this.getAttribute(s);
//    }
//
//    @Override
//    public boolean isSelected() {
//        return this.isSelected();
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return this.isEnabled();
//    }
//
//    @Override
//    public String getText() {
//        return this.getText();
//    }
//
//    @Override
//    public List<WebElement> findElements(By by) {
//        return this.findElements(by);
//    }
//
//    @Override
//    public WebElement findElement(By by) {
//        return this.findElement(by);
//    }
//
//    @Override
//    public boolean isDisplayed() {
//        return this.isDisplayed();
//    }
//
//    @Override
//    public Point getLocation() {
//        return this.getLocation();
//    }
//
//    @Override
//    public Dimension getSize() {
//        return this.getSize();
//    }
//
//    @Override
//    public Rectangle getRect() {
//        return this.getRect();
//    }
//
//    @Override
//    public String getCssValue(String s) {
//        return this.getCssValue(s);
//    }
//
//    @Override
//    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
//        return this.getScreenshotAs(outputType);
//    }
}
