package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.BaseMain;
import pageobjects.HomePage;
import pageobjects.SignInPage;

import java.time.Duration;

public class BaseTest {
    ChromeDriver driver;
    HomePage homePage;
    SignInPage signInPage;
    BaseMain baseMain;
    @BeforeMethod
    public void ChromeSetUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\ProjectAutomation\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        baseMain = new BaseMain(driver);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterMethod
    public void ChromeClose(){
        driver.quit();
    }
}
