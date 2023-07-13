package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInPage extends BaseMain{
    public SignInPage(ChromeDriver driver){
        super(driver);
    }
    //locators
    public By EmailField = By.xpath("//input[@id='email']");
    public By PasswordField = By.xpath("//input[@id='password']");
    public By SubmitSigningInButton = By.xpath("//button[@type='submit']");
    public By UserValidationError = By.xpath("//p[contains(text(),'Error: email is incorrect')]");

    //parameters
    public String UserEmail = "TestEmail@testmail.com";
    public String UserPassword = "pwd";

    public void EnterUserDataAndSubmit(){
        driver.findElement(EmailField).sendKeys(UserEmail);
        driver.findElement(PasswordField).sendKeys(UserPassword);
        driver.findElement(SubmitSigningInButton).click();
    }
    public void SingInFieldsDisplayingCheck(){
        System.out.println(driver.findElement(EmailField).isDisplayed());
        System.out.println(driver.findElement(PasswordField).isDisplayed());
        System.out.println(driver.findElement(SubmitSigningInButton).isDisplayed());
    }
    public void UserValidationErrorDisplayingCheck(){
        System.out.println(driver.findElement(UserValidationError).isDisplayed());
    }
}
