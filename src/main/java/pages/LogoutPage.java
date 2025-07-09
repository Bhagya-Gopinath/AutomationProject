package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    WebDriver driver;

    By logout = By.xpath("/html/body/div[1]/main/section/div/article/div/div/p[1]/a");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() {
        driver.findElement(logout).click();
    }
}
