package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderButtonsFunctionality extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.get("https://automationexercise.com/");
        homeURL = "https://automationexercise.com/";
        productsURL = "https://automationexercise.com/products";
        cartURL = "https://automationexercise.com/view_cart";
        logInURL = "https://automationexercise.com/login";
        testCasesURL = "https://automationexercise.com/test_cases";
        apiURL = "https://automationexercise.com/api_list";
        videoTutorialsURL = "https://www.youtube.com/c/AutomationExercise";
        contactUsURL = "https://automationexercise.com/contact_us";

    }

    @Test(priority = 10)
    public void verifyingButtonFunctionalityFromHomePage() {
        home.clickOnProductsButton();
        Assert.assertEquals(driver.getCurrentUrl(), productsURL);
        driver.navigate().back();

        home.clickOnCartButton();
        Assert.assertEquals(driver.getCurrentUrl(), cartURL);
        driver.navigate().back();

        home.clickOnLogInButton();
        Assert.assertEquals(driver.getCurrentUrl(), logInURL);
        driver.navigate().back();

        home.clickOnTestCasesButton();
        Assert.assertEquals(driver.getCurrentUrl(), testCasesURL);
        driver.navigate().back();

        home.clickOnAPIButton();
        Assert.assertEquals(driver.getCurrentUrl(), apiURL);
        driver.navigate().back();

        home.clickOnVideoTutorialsButton();
        Assert.assertEquals(driver.getCurrentUrl(), videoTutorialsURL);
        driver.navigate().back();

        home.clickOnContactUsButton();
        Assert.assertEquals(driver.getCurrentUrl(), contactUsURL);
    }

    @Test(priority = 20)
    public void verifyingButtonFunctionalityFromProductsPage() {
        home.clickOnProductsButton();
        products.clickOnHomeButton();
        Assert.assertEquals(driver.getCurrentUrl(), homeURL);
        driver.navigate().back();

        products.clickOnCartButton();
        Assert.assertEquals(driver.getCurrentUrl(), cartURL);
        driver.navigate().back();

        products.clickOnLogInButton();
        Assert.assertEquals(driver.getCurrentUrl(), logInURL);
        driver.navigate().back();

        products.clickOnTestCasesButton();
        Assert.assertEquals(driver.getCurrentUrl(), testCasesURL);
        driver.navigate().back();

        products.clickOnAPIButton();
        Assert.assertEquals(driver.getCurrentUrl(), apiURL);
        driver.navigate().back();

        products.clickOnVideoTutorialsButton();
        Assert.assertEquals(driver.getCurrentUrl(), videoTutorialsURL);
        driver.navigate().back();

        products.clickOnContactUsButton();
        Assert.assertEquals(driver.getCurrentUrl(), contactUsURL);
        driver.navigate().back();
    }

    @Test(priority = 30)
    public void verifyingButtonFunctionalityFromCartPage() {
        home.clickOnCartButton();
        cart.clickOnHomeButton();
        Assert.assertEquals(driver.getCurrentUrl(), homeURL);
        driver.navigate().back();

        cart.clickOnProductsButton();
        Assert.assertEquals(driver.getCurrentUrl(), productsURL);
        driver.navigate().back();

        cart.clickOnLogInButton();
        Assert.assertEquals(driver.getCurrentUrl(), logInURL);
        driver.navigate().back();

        cart.clickOnTestCasesButton();
        Assert.assertEquals(driver.getCurrentUrl(), testCasesURL);
        driver.navigate().back();

        cart.clickOnAPIButton();
        Assert.assertEquals(driver.getCurrentUrl(), apiURL);
        driver.navigate().back();

        cart.clickOnVideoTutorialsButton();
        Assert.assertEquals(driver.getCurrentUrl(), videoTutorialsURL);
        driver.navigate().back();

        cart.clickOnContactUsButton();
        Assert.assertEquals(driver.getCurrentUrl(), contactUsURL);
        driver.navigate().back();
    }

    @Test(priority = 40)
    public void verifyingButtonFunctionalityFromLoginPage() {
        home.clickOnLogInButton();
        login.clickOnHomeButton();
        Assert.assertEquals(driver.getCurrentUrl(), homeURL);
        driver.navigate().back();

        login.clickOnProductsButton();
        Assert.assertEquals(driver.getCurrentUrl(), productsURL);
        driver.navigate().back();

        login.clickOnCartButton();
        Assert.assertEquals(driver.getCurrentUrl(), cartURL);
        driver.navigate().back();

        login.clickOnTestCasesButton();
        Assert.assertEquals(driver.getCurrentUrl(), testCasesURL);
        driver.navigate().back();

        login.clickOnAPIButton();
        Assert.assertEquals(driver.getCurrentUrl(), apiURL);
        driver.navigate().back();

        login.clickOnVideoTutorialsButton();
        Assert.assertEquals(driver.getCurrentUrl(), videoTutorialsURL);
        driver.navigate().back();

        login.clickOnContactUsButton();
        Assert.assertEquals(driver.getCurrentUrl(), contactUsURL);
        driver.navigate().back();
    }

    @Test(priority = 50)
    public void verifyingButtonFunctionalityFromTestCasesPage() {
        home.clickOnTestCasesButton();
        testCases.clickOnHomeButton();
        Assert.assertEquals(driver.getCurrentUrl(), homeURL);
        driver.navigate().back();

        testCases.clickOnProductsButton();
        Assert.assertEquals(driver.getCurrentUrl(), productsURL);
        driver.navigate().back();

        testCases.clickOnCartButton();
        Assert.assertEquals(driver.getCurrentUrl(), cartURL);
        driver.navigate().back();

        testCases.clickOnLogInButton();
        Assert.assertEquals(driver.getCurrentUrl(), logInURL);
        driver.navigate().back();

        testCases.clickOnAPIButton();
        Assert.assertEquals(driver.getCurrentUrl(), apiURL);
        driver.navigate().back();

        testCases.clickOnVideoTutorialsButton();
        Assert.assertEquals(driver.getCurrentUrl(), videoTutorialsURL);
        driver.navigate().back();

        testCases.clickOnContactUsButton();
        Assert.assertEquals(driver.getCurrentUrl(), contactUsURL);
        driver.navigate().back();
    }

    @Test(priority = 60)
    public void verifyingButtonFunctionalityFromAPITestingPage() {
        home.clickOnAPIButton();
        apiTesting.clickOnHomeButton();
        Assert.assertEquals(driver.getCurrentUrl(), homeURL);
        driver.navigate().back();

        apiTesting.clickOnProductsButton();
        Assert.assertEquals(driver.getCurrentUrl(), productsURL);
        driver.navigate().back();

        apiTesting.clickOnCartButton();
        Assert.assertEquals(driver.getCurrentUrl(), cartURL);
        driver.navigate().back();

        apiTesting.clickOnLogInButton();
        Assert.assertEquals(driver.getCurrentUrl(), logInURL);
        driver.navigate().back();

        apiTesting.clickOnTestCasesButton();
        Assert.assertEquals(driver.getCurrentUrl(), testCasesURL);
        driver.navigate().back();

        apiTesting.clickOnVideoTutorialsButton();
        Assert.assertEquals(driver.getCurrentUrl(), videoTutorialsURL);
        driver.navigate().back();

        apiTesting.clickOnContactUsButton();
        Assert.assertEquals(driver.getCurrentUrl(), contactUsURL);
        driver.navigate().back();
    }

    @Test(priority = 70)
    public void verifyingButtonFunctionalityFromContactUsPage() {
        home.clickOnContactUsButton();
        contactUs.clickOnHomeButton();
        Assert.assertEquals(driver.getCurrentUrl(), homeURL);
        driver.navigate().back();

        contactUs.clickOnProductsButton();
        Assert.assertEquals(driver.getCurrentUrl(), productsURL);
        driver.navigate().back();

        contactUs.clickOnCartButton();
        Assert.assertEquals(driver.getCurrentUrl(), cartURL);
        driver.navigate().back();

        contactUs.clickOnLogInButton();
        Assert.assertEquals(driver.getCurrentUrl(), logInURL);
        driver.navigate().back();

        contactUs.clickOnTestCasesButton();
        Assert.assertEquals(driver.getCurrentUrl(), testCasesURL);
        driver.navigate().back();

        contactUs.clickOnAPIButton();
        Assert.assertEquals(driver.getCurrentUrl(), apiURL);
        driver.navigate().back();

        contactUs.clickOnVideoTutorialsButton();
        Assert.assertEquals(driver.getCurrentUrl(), videoTutorialsURL);
        driver.navigate().back();
    }


}
