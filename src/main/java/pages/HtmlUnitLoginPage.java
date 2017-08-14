package pages;

import org.openqa.selenium.By;

import static helpers.DriverSingleton.getDriver;

public class HtmlUnitLoginPage {
    private static final By USERNAME = By.cssSelector("input#Username");
    private static final By PASSWORD = By.id("Password");
    private static final By LOGIN_BUTTON = By.id("SubmitButton");

    public static void loginToRmsys(String username, String password) {
        getDriver().findElement(USERNAME).sendKeys(username);
        getDriver().findElement(PASSWORD).sendKeys(password);
        getDriver().findElement(LOGIN_BUTTON).click();
    }
}
