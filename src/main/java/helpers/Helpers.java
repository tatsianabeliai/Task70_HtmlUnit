package helpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static core.TestBaseHtmlUnit.driverForHTMLUnit;

public class Helpers {

    public static void makeHtmlUnitScreen(String name) {

        File scrFile = ((TakesScreenshot) driverForHTMLUnit).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("target\\screens\\" + name + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

