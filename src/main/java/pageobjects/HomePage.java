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
    public By UserSignInButton = By.xpath("//a[contains(text(),'Вхід')]");

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
    }
}
