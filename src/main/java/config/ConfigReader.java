package config;

import configuration.DriverType;
import utils.PropertyLoader;

public class ConfigReader {
    private static final String DRIVER_TYPE = PropertyLoader.getProperty("driver", "CHROME");

    public static DriverType getDriverType() {
        return DriverType.valueOf(DRIVER_TYPE.toUpperCase());
    }
}
