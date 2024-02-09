package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products extends Home{
    WebElement homeButton;
    WebElement searchField, searchClickButton, viewProductButton, addToCartButton, continueShoppingButton;
    String searchedItem = "Blue Top";

    public Products(WebDriver driver) {
        super(driver);
    }
    public WebElement getHomeButton() {
        return homeButton = driver.findElement(By.linkText("Home"));
    }
    public WebElement getSearchField() {
        return searchField = driver.findElement(By.id("search_product"));
    }
    public WebElement getSearchClickButton() {
        return searchClickButton = driver.findElement(By.id("submit_search"));
    }
    public WebElement getViewProductButton() {
        return viewProductButton = driver.findElement(By.cssSelector(".fa.fa-plus-square"));
    }
    public WebElement getAddToCartButton() {
        return addToCartButton = driver.findElement(By.cssSelector(".btn.btn-default.cart"));
    }
    public WebElement getContinueShoppingButton() {
        return continueShoppingButton = driver.findElement(By.cssSelector(".btn.btn-success.close-modal.btn-block"));
    }

    /////////////AKCIJE/////////////////

    public void clickOnHomeButton() {
        getHomeButton().click();
    }
    public void fillSearchField() {
        getSearchField().clear();
        getSearchField().sendKeys(searchedItem);
    }
    public void clickOnSearchButton() {
        getSearchClickButton().click();
    }
    public void clickOnViewProductButton() {
        getViewProductButton().click();
    }
    public void clickOnAddToCartButton() {
        getAddToCartButton().click();
    }
    public void clickOnContinueShoppingButton() {
        getContinueShoppingButton().click();
    }
    public void closeVignette(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("const elements = document.getElementsByClassName" +
                "('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
    }

}
