package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WishlistPage {
    WebDriver driver;

    By footWear = By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[4]/a");
    By redcolorFW = By.xpath("//*[@id=\"main\"]/ul/li[2]/div[1]/div/a");
    By wishlist = By.xpath("//*[@id=\"yith-wcwl-icon-heart-outline\"]");

    public WishlistPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToWishlist() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(footWear).click();
        WebElement redFootwear = driver.findElement(redcolorFW);
        Actions action = new Actions(driver);
        action.moveToElement(redFootwear).perform();
        Thread.sleep(5000);
        driver.findElement(wishlist).click();
    }
}
