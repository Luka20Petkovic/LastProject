package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    public Home home;
    public Products products;
    public Cart cart;
    public LogIn login;
    public TestCases testCases;
    public ApiTesting apiTesting;
    public VideoTutorials videoTutorials;
    public ContactUs contactUs;
    public Payment payment;
    public String homeURL, productsURL, cartURL, logInURL, testCasesURL, apiURL, videoTutorialsURL, contactUsURL;


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        home = new Home(driver);
        products = new Products(driver);
        cart = new Cart(driver);
        login = new LogIn(driver);
        testCases = new TestCases(driver);
        apiTesting = new ApiTesting(driver);
        videoTutorials = new VideoTutorials(driver);
        contactUs = new ContactUs(driver);
        payment = new Payment(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }

}

