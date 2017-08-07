import core.TestBaseHtmlUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HtmlUnitHomePage;
import pages.HtmlUnitLoginPage;

public class HtmlUnitDriverRMSysLoginTest extends TestBaseHtmlUnit {
    public static final String USER_NAME = "EugenBorisik";
    public static final String PASSWORD = "qwerty12345";

    @Test
    public void login() {
//        makeHtmlUnitScreen("HTMLUnit screenshot");
//        It is impossible to make screenshots, the error occurs:
// java.lang.ClassCastException: org.openqa.selenium.htmlunit.HtmlUnitDriver cannot be cast to org.openqa.selenium.TakesScreenshot
        HtmlUnitLoginPage.loginToRmsys(USER_NAME, PASSWORD);
        HtmlUnitHomePage htmlUnitLoginPage = new HtmlUnitHomePage();
        Assert.assertTrue(htmlUnitLoginPage.isWelcomeMessageDisplayed(), "The Welcome message is not displayed");
    }
}
