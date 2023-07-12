package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BaseMain{

    public HomePage(ChromeDriver driver){
        super(driver);
    }
    //locators
    public String websiteURL = "https://shafa.ua/";
    public String websiteURLfork = "https://test.my-fork.com/";
    public By UserSignInButton = By.xpath("//a[contains(text(),'Вхід')]");
    public By UserSignUpButton = By.xpath("//a[@href='https://test.my-fork.com/register']");

    public void OpenFullPage() throws InterruptedException {
        driver.get(websiteURL);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    public void TakeMeToSignInPage() throws InterruptedException {
        driver.get(websiteURL);
        driver.manage().window().maximize();
        driver.findElement(UserSignInButton).click();
        Thread.sleep(3000);
    }public void TakeMeToSignUpPage() throws InterruptedException {
        driver.get(websiteURLfork);
        //driver.manage().window().maximize();
        driver.findElement(UserSignUpButton).click();
        Thread.sleep(3000);
    }
}
