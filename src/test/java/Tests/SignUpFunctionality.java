package Tests;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignUpFunctionality extends BaseTest {

    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        Thread.sleep(1000);
        driver.get("https://automationexercise.com/login");
        homeURL = "https://automationexercise.com/";
        logInURL = "https://automationexercise.com/login";
    }

    @Test(priority = 10)
    public void verifyIfUserCanSignUp() throws InterruptedException {
        login.enterName();
        login.enterEmail();
        login.clickOnSignUpButton();
        login.clickOnRadioButton1();
        login.clickOnRadioButton2();
        login.enterSignUpPassword();
        login.enterDay();
        login.enterMonth();
        login.enterYear();
        login.enterFirstName();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,870)");

        login.enterLastName();
        login.enterCompany();
        login.enterAddress();
        login.enterAddress2();
        login.enterState();
        login.enterCity();
        login.enterZipCode();
        login.enterMobileNumber();
        login.clickOnCreateAccountButton();  //GOES ON NEXT PAGE
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/account_created");
        //login.clickOnContinueButton();       //GOES ON HOME PAGE
        //login.clickOnLogoutButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //WebElement element = driver.findElement(By.linkText("Account Created!"));
        //String text = element.getText();
        //Assert.assertTrue(element.isDisplayed());

        Thread.sleep(3000);
    }

    @Test(priority = 20)
    public void verifyIfUserCanLogInAndOut() {
        login.enterLogInEmail();
        login.enterLogInPassword();
        login.clickOnLoginBtn();
        Assert.assertEquals(driver.getCurrentUrl(), homeURL);
        login.clickOnLogoutButton();
        Assert.assertEquals(driver.getCurrentUrl(), logInURL);
    }

    @Test(priority = 30)
    public void verifyIfUserCanDeleteAccount() {
        login.enterLogInEmail();
        login.enterLogInPassword();
        login.clickOnLoginBtn();
        login.clickOnDeleteAccountButton();

        String expectedURL = "https://automationexercise.com/delete_account";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }
}
