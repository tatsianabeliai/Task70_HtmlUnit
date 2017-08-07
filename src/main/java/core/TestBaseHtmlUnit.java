package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBaseHtmlUnit {
    public static final String URL = "https://192.168.100.26";
    private static final int DEFAULT_TIMEOUT = 10;
    public static WebDriver driverForHTMLUnit;

    @BeforeMethod
    public void openBrowser() {
        driverForHTMLUnit = new HtmlUnitDriver();
        driverForHTMLUnit.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        driverForHTMLUnit.get(URL);
        System.out.println(driverForHTMLUnit.getTitle());
        driverForHTMLUnit.manage().window().maximize();
    }

    @AfterMethod
    public void quit() {
        driverForHTMLUnit.quit();
    }
}