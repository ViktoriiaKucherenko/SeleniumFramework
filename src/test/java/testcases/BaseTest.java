package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.HomePage;
import pageobjects.SignInPage;

public class BaseTest {
    ChromeDriver driver;
    HomePage homePage;
    SignInPage signInPage;
    @BeforeMethod
    public void ChromeSetUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\ProjectAutomation\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);

    }
    @AfterMethod
    public void ChromeClose(){
        driver.close();
    }
}
