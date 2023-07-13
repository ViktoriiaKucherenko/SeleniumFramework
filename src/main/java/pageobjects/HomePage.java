package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BaseMain{

    public HomePage(ChromeDriver driver){
        super(driver);
    }
    //locators
    //public String websiteURL = "https://shafa.ua/";
    public String websiteURLfork = "https://test.my-fork.com/";
    public By UserSignInButton = By.xpath("//a[@href='https://test.my-fork.com/login']");
    public By UserSignUpButton = By.xpath("//a[@href='https://test.my-fork.com/register']");

    public void OpenFullPage(){
        driver.get(websiteURLfork);
    }
    public void TakeMeToSignInPage(){
        driver.get(websiteURLfork);
        driver.findElement(UserSignInButton).click();

    }public void TakeMeToSignUpPage(){
        driver.get(websiteURLfork);
        driver.findElement(UserSignUpButton).click();
    }
}
