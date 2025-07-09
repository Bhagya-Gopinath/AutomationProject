package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
    WebDriver driver;

    By contactus = By.xpath("/html/body/div[2]/header/div[2]/div/div/div[3]/div/nav/ul/li[7]");

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openContactUsAndScroll() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(contactus).click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
    }
}
