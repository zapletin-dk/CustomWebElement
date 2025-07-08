package WebElementImp;

import configuration.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CustomElement implements BaseElement {
    private final WebElement element;

    public CustomElement(WebElement element) {
        this.element = element;
    }

    private WebElement waitElementToBeClickable(WebElement element) {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    @Override
    public void click() {
        waitElementToBeClickable(element).click();
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }

    @Override
    public String getText() {
        return "wqe";
    }
}
