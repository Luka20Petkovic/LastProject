package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Payment {
    WebDriver driver;
    WebElement nameOnCardField, cardNumberField, cvcField, exparationMonthField, exparationYearField, payButton;
    String nameOnCard = "Luka", cardNumber = "1111 2222 3333 4444", cvc = "311", exparationMonth = "05", exparationYear = "2025";

    public Payment(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getNameOnCardField() {
        return nameOnCardField = driver.findElement(By.name("name_on_card"));
    }
    public WebElement getCardNumberField() {
        return cardNumberField = driver.findElement(By.name("card_number"));
    }
    public WebElement getCvcField() {
        return cvcField = driver.findElement(By.name("cvc"));
    }
    public WebElement getExparationMonthField() {
        return exparationMonthField = driver.findElement(By.name("expiry_month"));
    }
    public WebElement getExparationYearField() {
        return exparationYearField = driver.findElement(By.name("expiry_year"));
    }
    public WebElement getPayButton() {
        return payButton = driver.findElement(By.id("submit"));
    }

    /////////////////AKCIJE///////////////////////

    public void enterNameOnCard() {
        getNameOnCardField().clear();
        getNameOnCardField().sendKeys(nameOnCard);
    }
    public void enterCardNumber() {
        getCardNumberField().clear();
        getCardNumberField().sendKeys(cardNumber);
    }
    public void enterCVC() {
        getCvcField().clear();
        getCvcField().sendKeys(cvc);
    }
    public void enterExparationMonth() {
        getExparationMonthField().clear();
        getExparationMonthField().sendKeys(exparationMonth);
    }
    public void enterExparationYear() {
        getExparationYearField().clear();
        getExparationYearField().sendKeys(exparationYear);
    }
    public void clickOnPayButton() {
        getPayButton().click();
    }

}
