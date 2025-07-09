package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;

    By login_register = By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/ul/li/a");
    By register = By.xpath("/html/body/div[3]/div[1]/div[2]/div/div[2]/a");
    By firstname = By.name("billing_first_name");
    By lastname = By.name("billing_last_name");
    By username = By.xpath("//*[@id=\"reg_username\"]");
    By email = By.name("email");
    By password = By.xpath("//*[@id=\"reg_password\"]");
    By registerbutton = By.name("register");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void register() throws InterruptedException {
        driver.findElement(login_register).click();
        Thread.sleep(5000);
        driver.findElement(register).click();
    }

    public void registerDetails() {
        driver.findElement(firstname).sendKeys("Bhagya");
        driver.findElement(lastname).sendKeys("Gopinath");
        driver.findElement(username).sendKeys("Bhagya39");
        driver.findElement(email).sendKeys("bhagya.gopinath2001@gmail.com");
        driver.findElement(password).sendKeys("Bgg@ffy5646$74");
        driver.findElement(registerbutton).click();
    }
}
