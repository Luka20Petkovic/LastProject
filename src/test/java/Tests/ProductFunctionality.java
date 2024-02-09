package Tests;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProductFunctionality extends BaseTest {
    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver.get("https://automationexercise.com/login");
        login.enterLogInEmail();
        login.enterLogInPassword();
        login.clickOnLoginBtn();
        home.clickOnProductsButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Thread.sleep(1000);
    }

    @Test(priority = 10)
    public void verifyIfUserCanPurchaseItem() throws InterruptedException {
        products.closeVignette();
        products.fillSearchField();
        products.clickOnSearchButton();
        Thread.sleep(1500);
        products.closeVignette();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        products.clickOnViewProductButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Thread.sleep(1500);
        products.closeVignette();

        products.clickOnAddToCartButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Thread.sleep(1500);
        products.closeVignette();

        products.clickOnContinueShoppingButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Thread.sleep(1500);
        products.closeVignette();

        products.clickOnCartButton();
        products.closeVignette();

        cart.clickOnProceedToCheckoutButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");

        cart.clickOnPlaceOrderButton();
        Thread.sleep(1500);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        products.closeVignette();

        payment.enterNameOnCard();
        payment.enterCardNumber();
        payment.enterCVC();
        payment.enterExparationMonth();
        payment.enterExparationYear();
        payment.clickOnPayButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //ASSERT
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/payment_done/500");
        Thread.sleep(5000);
    }
}
