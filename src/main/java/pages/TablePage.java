package pages;

import WebElementImp.CustomElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TablePage extends BasePage{
    @FindBy(xpath = "//div[@class='rt-thead -header']")
    private WebElement header;

    @FindBy(xpath ="//div")
    private CustomElement custom;

    @FindBy(id = "1")
    private WebElementImpl elemn;

    @FindBy(className = "wa")
    private ToggleElement w;


    public TablePage() {
        super();
    }
}
