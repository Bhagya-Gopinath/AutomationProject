package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By login_register = By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/ul/li/a");
    By usernameOrEmail = By.xpath("//*[@id=\"username\"]");
    By password1 = By.xpath("//*[@id=\"password\"]");
    By rememberMe = By.xpath("//*[@id=\"rememberme\"]");
    By login = By.xpath("/html/body/div[3]/div[1]/div[2]/div/div[1]/div/form/p[3]/button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login() throws InterruptedException {
        driver.findElement(login_register).click();
        Thread.sleep(5000);
        driver.findElement(usernameOrEmail).sendKeys("bhagya.gopinath2001@gmail.com");
        driver.findElement(password1).sendKeys("Bgg@ffy5646$74");
        driver.findElement(rememberMe).click();
        driver.findElement(login).click();
    }
}
