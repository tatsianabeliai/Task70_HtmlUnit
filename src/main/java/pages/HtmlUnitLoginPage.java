package pages;

import org.openqa.selenium.By;

import static core.TestBaseHtmlUnit.driverForHTMLUnit;

public class HtmlUnitLoginPage {
    private static final By USERNAME = By.cssSelector("input#Username");
    private static final By PASSWORD = By.id("Password");
    private static final By LOGIN_BUTTON = By.id("SubmitButton");

    public static void loginToRmsys(String username, String password) {
        driverForHTMLUnit.findElement(USERNAME).sendKeys(username);
        driverForHTMLUnit.findElement(PASSWORD).sendKeys(password);
        driverForHTMLUnit.findElement(LOGIN_BUTTON).click();
    }
}
