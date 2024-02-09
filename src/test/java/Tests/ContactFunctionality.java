package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ContactFunctionality extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver.get("https://automationexercise.com/contact_us");
    }

    @Test(priority = 10)
    public void verifyIfUserCanSubmitContactForm() {
        contactUs.enterName();
        contactUs.enterEmail();
        contactUs.enterSubject();
        contactUs.enterMessage();
        contactUs.clickOnSubmitButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.switchTo().alert().accept();

        ////////Assert////////
        WebElement locator = driver.findElement(By.cssSelector(".status.alert.alert-success"));
        String text = locator.getText();
        Assert.assertTrue(locator.isDisplayed(), text);
    }

    @Test(priority = 20)
    public void verifyIfUserCannotSubmitContactFromWithoutEmail() {
        contactUs.enterName();
        contactUs.enterSubject();
        contactUs.enterMessage();
        contactUs.clickOnSubmitButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //ASSERT
        WebElement locator = driver.findElement(By.cssSelector(".status.alert.alert-success"));
        String text = locator.getText();
        Assert.assertFalse(locator.isDisplayed(), text);
    }
}
