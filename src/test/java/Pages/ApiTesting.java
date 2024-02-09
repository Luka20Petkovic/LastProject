package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApiTesting extends Home{
    WebElement homeButton;
    public ApiTesting(WebDriver driver) {
        super(driver);
    }

    public WebElement getHomeButton() {
        return homeButton = driver.findElement(By.linkText("Home"));
    }

    public void clickOnHomeButton() {
        getHomeButton().click();
    }
}
