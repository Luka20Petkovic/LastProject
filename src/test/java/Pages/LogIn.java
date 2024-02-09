package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LogIn extends Home{
    WebElement homeButton;
    WebElement nameField, emailSignUpField, signUpButton, emailLogInField, logInBtn;
    String name = "Luka", email = "luka@gmail.com";
    String password = "Password123!@#", lastname = "Petkovic", companyName = "Dzervin", addressName = "PinPoint Street", address2Name = "Green Street",
            stateName = "Kanzas", cityName = "Nis", zipcodeName = "18000", phoneNumber = "061234567", dayDate = "5", monthDate = "January", yearDate = "1990";
    WebElement radioButton1, radioButton2, passwordSignUpField, firstName, lastName, company, address, address2, state, city, zipcode,
            mobileNumber, day, month, year, createAccountButton, continueButton, deleteAccountButton, logOutButton, passwordLogInFiled;



    public LogIn(WebDriver driver) {
        super(driver);
    }
    public WebElement getHomeButton() {
        return homeButton = driver.findElement(By.linkText("Home"));
    }
    public WebElement getNameField() {
        return nameField = driver.findElement(By.name("name"));
    }
    public WebElement getEmailSignUpField() {
        return emailSignUpField = driver.findElement(By.xpath("(//input[@name='email'])[2]")); //(//tagname[@attribute='value’])[2]
    }
    public WebElement getSignUpButton() {
        return signUpButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
    }
    public WebElement getRadioButton1() {
        return radioButton1 = driver.findElement(By.id("id_gender1"));
    }
    public WebElement getRadioButton2() {
        return radioButton2 = driver.findElement(By.id("id_gender2"));
    }
    public WebElement getPasswordSignUpField() {
        return passwordSignUpField = driver.findElement(By.id("password"));
    }
    public WebElement getDay() {
        return day = driver.findElement(By.id("days"));
    }
    public WebElement getMonth() {
        return month = driver.findElement(By.id("months"));
    }
    public WebElement getYear() {
        return year = driver.findElement(By.id("years"));
    }
    public WebElement getFirstName() {
        return firstName = driver.findElement(By.id("first_name"));
    }
    public WebElement getLastName() {
        return lastName = driver.findElement(By.id("last_name"));
    }
    public WebElement getCompany() {
        return company = driver.findElement(By.id("company"));
    }
    public WebElement getAddress() {
        return address = driver.findElement(By.id("address1"));
    }
    public WebElement getAddress2() {
        return address2 = driver.findElement(By.id("address2"));
    }
    public WebElement getState() {
        return state = driver.findElement(By.id("state"));
    }
    public WebElement getCity() {
        return city = driver.findElement(By.id("city"));
    }
    public WebElement getZipcode() {
        return zipcode = driver.findElement(By.id("zipcode"));
    }
    public WebElement getMobileNumber() {
        return mobileNumber = driver.findElement(By.id("mobile_number"));
    }
    public WebElement getCreateAccountButton() {
        return createAccountButton = driver.findElement(By.cssSelector(".btn.btn-default"));
    }
    public WebElement getContinueButton() {
        return continueButton = driver.findElement(By.linkText("Continue"));
    }
    public WebElement getDeleteAccountButton() {
        return deleteAccountButton = driver.findElement(By.cssSelector(".fa.fa-trash-o"));
    }
    public WebElement getEmailLogInField() {
        return emailLogInField = driver.findElement(By.xpath("(//input[@name='email'])[1]")); //(//button[@attribute='value’])[2]
    }
    public WebElement getPasswordLogInFiled() {
        return passwordLogInFiled = driver.findElement(By.name("password"));
    }
    public WebElement getLogInBtn() {
        return logInBtn = driver.findElement(By.cssSelector("button[data-qa='login-button']"));
    }
    public WebElement getLogOutButton() {
        return logOutButton = driver.findElement(By.cssSelector(".fa.fa-lock"));
    }

    /////////////////////ACTION///////////////////////

    public void clickOnHomeButton() {
        getHomeButton().click();
    }
    public void enterName() {
        getNameField().clear();
        getNameField().sendKeys(name);
    }
    public void enterEmail() {
        getEmailSignUpField().clear();
        getEmailSignUpField().sendKeys(email);
    }
    public void clickOnSignUpButton() {
        getSignUpButton().click();
    }
    public void clickOnRadioButton1() {
        getRadioButton1().click();
    }
    public void clickOnRadioButton2() {
        getRadioButton2().click();
    }
    public void enterSignUpPassword() {
        getPasswordSignUpField().clear();
        getPasswordSignUpField().sendKeys(password);
    }
    public void enterDay() {
        //getDay().clear();
        getDay().sendKeys(dayDate);
    }
    public void enterMonth() {
        //getMonth().clear();
        getMonth().sendKeys(monthDate);
    }
    public void enterYear() {
        //getYear().clear();
        getYear().sendKeys(yearDate);
    }
    public void enterFirstName() {
        getFirstName().clear();
        getFirstName().sendKeys(name);
    }
    public void enterLastName() {
        getLastName().clear();
        getLastName().sendKeys(lastname);
    }
    public void enterCompany() {
        getCompany().clear();
        getCompany().sendKeys(companyName);
    }
    public void enterAddress() {
        getAddress().clear();
        getAddress().sendKeys(addressName);
    }
    public void enterAddress2() {
        getAddress2().clear();
        getAddress2().sendKeys(address2Name);
    }
    public void enterState() {
        getState().clear();
        getState().sendKeys(stateName);
    }
    public void enterCity() {
        getCity().clear();
        getCity().sendKeys(cityName);
    }
    public void enterZipCode() {
        getZipcode().clear();
        getZipcode().sendKeys(zipcodeName);
    }
    public void enterMobileNumber() {
        getMobileNumber().clear();
        getMobileNumber().sendKeys(phoneNumber);
    }
    public void clickOnCreateAccountButton() {
        getCreateAccountButton().click();
    }
    public void clickOnContinueButton() {
        getContinueButton().click();
    }
    public void clickOnDeleteAccountButton() {
        getDeleteAccountButton().click();
    }
    public void enterLogInEmail() {
        getEmailLogInField().sendKeys(email);
    }
    public void enterLogInPassword() {
        getPasswordLogInFiled().sendKeys(password);
    }
    public void clickOnLoginBtn() {
        getLogInBtn().click();
    }
    public void clickOnLogoutButton() {
        getLogOutButton().click();
    }


}
