package framework.decorating;

import framework.decorating.elements.IElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class LocatingCustomElementListHandler implements InvocationHandler {
    private final ElementLocator locator;
    private final Class<IElement> clazz;

    public LocatingCustomElementListHandler(ElementLocator locator, Class<IElement> clazz) {
        this.locator = locator;
        this.clazz = clazz;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] args) throws Throwable {
        List<WebElement> elements = locator.findElements();
        List<IElement> customs = new ArrayList<IElement>();

        for (WebElement element : elements) {
            customs.add(WrapperFactory.createInstance(clazz, element));
        }
        try {
            return method.invoke(customs, object);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
