package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.RegisterPage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.WishlistPage;
import pages.ScreenshotPage;
import pages.ContactUsPage;
public class RubcoTestClass {
    WebDriver driver;

    @BeforeTest
    public void setupBrowser() {
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void launchURL() {
        driver.get("https://www.rubcogroup.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void fullUserFlowTest() throws Exception {
        // Register
        RegisterPage register = new RegisterPage(driver);
        register.register();
        register.registerDetails();

        // Logout
        LogoutPage logout = new LogoutPage(driver);
        logout.logout();

        // Login
        LoginPage login = new LoginPage(driver);
        login.login();

        // Wishlist
        WishlistPage wishlist = new WishlistPage(driver);
        wishlist.addToWishlist();

        // Screenshot
        ScreenshotPage screenshot = new ScreenshotPage(driver);
        screenshot.captureScreenshot();

        // Contact Us + Scroll
        ContactUsPage contactUs = new ContactUsPage(driver);
        contactUs.openContactUsAndScroll();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
