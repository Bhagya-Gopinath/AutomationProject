package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotPage {
    WebDriver driver;

    public ScreenshotPage(WebDriver driver) {
        this.driver = driver;
    }

    public void captureScreenshot() throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshot, new File("F://rubco.png"));
    }
}
