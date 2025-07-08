package pages;

import WebElementImp.CustomFieldDecorator;
import configuration.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(new CustomFieldDecorator(DriverManager.getDriver()), this);
    }
}
