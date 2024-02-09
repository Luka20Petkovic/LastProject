package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart extends Home{
    WebElement homeButton;
    WebElement proceedToCheckoutButton, placeOrderButton;
    public Cart(WebDriver driver) {
        super(driver);
    }
    public WebElement getHomeButton() {
        return homeButton = driver.findElement(By.linkText("Home"));
    }
    public WebElement getProceedToCheckoutButton() {
        return proceedToCheckoutButton = driver.findElement(By.cssSelector(".btn.btn-default.check_out"));
    }
    public WebElement getPlaceOrderButton() {
        return placeOrderButton = driver.findElement(By.cssSelector(".btn.btn-default.check_out"));
    }

    /////////////////ACTION//////////////////////

    public void clickOnHomeButton() {
        getHomeButton().click();
    }
    public void clickOnProceedToCheckoutButton() {
        getProceedToCheckoutButton().click();
    }
    public void clickOnPlaceOrderButton() {
        getPlaceOrderButton().click();
    }


}
