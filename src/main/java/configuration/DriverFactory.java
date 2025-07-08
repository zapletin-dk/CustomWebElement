package configuration;

import config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    private DriverFactory () {}

    public static WebDriver createDriver() {
        DriverType type = ConfigReader.getDriverType();

       return switch (type) {
            case CHROME -> new ChromeDriver();
            case EDGE -> new EdgeDriver();
            case SAFARI -> new SafariDriver();
            case FIREFOX -> new FirefoxDriver();
            default -> throw new IllegalArgumentException("Unknown driver type: " + type);
        };
    }
}
