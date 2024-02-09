package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
    WebDriver driver;
    WebElement productsButton, cartButton, loginButton, testCasesButton, apiButton, videoTutorialsButton, contactUsButton;

    public Home(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getProductsButton() {
        return productsButton = driver.findElement(By.cssSelector(".material-icons.card_travel"));
    }
    public WebElement getCartButton() {
        return cartButton = driver.findElement(By.linkText("Cart"));
    }
    public WebElement getLoginButton() {
        return loginButton = driver.findElement(By.linkText("Signup / Login"));
    }
    public WebElement getTestCasesButton() {
        return testCasesButton = driver.findElement(By.linkText("Test Cases"));
    }
    public WebElement getApiButton() {
        return apiButton = driver.findElement(By.linkText("API Testing"));
    }
    public WebElement getVideoTutorialsButton() {
        return videoTutorialsButton = driver.findElement(By.linkText("Video Tutorials"));
    }
    public WebElement getContactUsButton() {
        return contactUsButton = driver.findElement(By.linkText("Contact us"));
    }

    ///////////////////////////ACTION//////////////////////////
    public void clickOnProductsButton() {
        getProductsButton().click();
    }
    public void clickOnCartButton() {
        getCartButton().click();
    }
    public void clickOnLogInButton() {
        getLoginButton().click();
    }
    public void clickOnTestCasesButton() {
        getTestCasesButton().click();
    }
    public void clickOnAPIButton() {
        getApiButton().click();
    }
    public void clickOnVideoTutorialsButton() {
        getVideoTutorialsButton().click();
    }
    public void clickOnContactUsButton() {
        getContactUsButton().click();
    }
}
