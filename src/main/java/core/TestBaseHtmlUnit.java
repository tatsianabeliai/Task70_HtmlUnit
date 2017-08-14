package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static helpers.DriverSingleton.getDriver;
import static helpers.DriverSingleton.initDriver;

public class TestBaseHtmlUnit {
    private static final String URL = "https://192.168.100.26";
    private static final int DEFAULT_TIMEOUT = 10;

    @BeforeMethod
    public void openBrowser() {
        initDriver("htmlUnit");
        getDriver().manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        getDriver().get(URL);
        getDriver().manage().window().maximize();
    }

    @AfterMethod
    public void quit() {
        getDriver().quit();
    }
}