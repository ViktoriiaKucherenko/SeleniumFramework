package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInPage extends BaseMain{
    public SignInPage(ChromeDriver driver){
        super(driver);
    }
    //locators
    public By EmailField = By.xpath("//input[@name='username']");
    public By PasswordField = By.xpath("//input[@name='password']");
    public By SubmitSigningInButton = By.xpath("//button[contains(text(),'Увійти')]");
    public By UserValidationError = By.xpath("//div[contains(text(),\"Будь ласка, введіть правильні ім'я користувача та \")]");

    //parameters
    public String UserEmail = "TestEmail";
    public String UserPassword = "pwd";

    public void EnterUserDataAndSubmit() throws InterruptedException {
        driver.findElement(EmailField).sendKeys(UserEmail);
        Thread.sleep(2000);
        driver.findElement(PasswordField).sendKeys(UserPassword);
        Thread.sleep(2000);
        driver.findElement(SubmitSigningInButton).click();
        Thread.sleep(5000);
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
