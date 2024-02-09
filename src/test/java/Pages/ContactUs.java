package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs extends Home{
    WebElement homeButton;
    WebElement nameField, emailField, subjectField, messageField, submitButton;
    String name = "Luka", email = "luka@gmail.com", subject = "question", message = "Lorem ipsum dolor sit amet";
    public ContactUs(WebDriver driver) {
        super(driver);
    }
    public WebElement getHomeButton() {
        return homeButton = driver.findElement(By.linkText("Home"));
    }

    public WebElement getNameField() {
        return nameField = driver.findElement(By.name("name"));
    }
    public WebElement getEmailField() {
        return emailField = driver.findElement(By.name("email"));
    }
    public WebElement getSubjectField() {
        return subjectField = driver.findElement(By.name("subject"));
    }
    public WebElement getMessageField() {
        return messageField = driver.findElement(By.id("message"));
    }
    public WebElement getSubmitButton() {
        return submitButton = driver.findElement(By.name("submit"));
    }

    ////////////////ACTION//////////////////

    public void clickOnHomeButton() {
        getHomeButton().click();
    }

    public void enterName() {
        getNameField().clear();
        getNameField().sendKeys(name);
    }
    public void enterEmail() {
        getEmailField().clear();
        getEmailField().sendKeys(email);
    }
    public void enterSubject() {
        getSubjectField().clear();
        getSubjectField().sendKeys(subject);
    }
    public void enterMessage() {
        getMessageField().clear();
        getMessageField().sendKeys(message);
    }
    public void clickOnSubmitButton() {
        getSubmitButton().click();
    }
}
