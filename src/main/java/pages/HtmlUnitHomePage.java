package pages;

import org.openqa.selenium.By;

import static core.TestBaseHtmlUnit.driverForHTMLUnit;

public class HtmlUnitHomePage {
    private static final By WELCOME_MESSAGE = By.cssSelector(".welcome-message");

    public static boolean isWelcomeMessageDisplayed() {
        return driverForHTMLUnit.findElement(WELCOME_MESSAGE).isDisplayed();
    }
}
