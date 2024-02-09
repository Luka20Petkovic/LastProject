package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCases extends Home{
    WebElement homeButton;
    public TestCases(WebDriver driver) {
        super(driver);
    }
    public WebElement getHomeButton() {
        return homeButton = driver.findElement(By.linkText("Home"));
    }

    public void clickOnHomeButton() {
        getHomeButton().click();
    }
}
