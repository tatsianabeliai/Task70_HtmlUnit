package pages;

import org.openqa.selenium.By;

import static helpers.DriverSingleton.getDriver;

public class HtmlUnitHomePage {
    private static final By WELCOME_MESSAGE = By.cssSelector(".welcome-message");

    public static boolean isWelcomeMessageDisplayed() {
        return getDriver().findElement(WELCOME_MESSAGE).isDisplayed();
    }
}
