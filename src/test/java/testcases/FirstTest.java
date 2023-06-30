package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

    public ChromeDriver driver;
    public String websiteURL = "https://shafa.ua/";
    public By UserSignInButton = By.xpath("//a[contains(text(),'Вхід')]");
    public By EmailField = By.xpath("//input[@name='username']");
    public By PasswordField = By.xpath("//input[@name='password']");
    public By SubmitSigningInButton = By.xpath("//button[contains(text(),'Увійти')]");
    public String UserEmail = "TestEmail";
    public String UserPassword = "pwd";
    public By UserValidationError = By.xpath("//div[contains(text(),\"Будь ласка, введіть правильні ім'я користувача та \")]");

    @BeforeMethod
    public void ChromeSetUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\ProjectAutomation\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void ChromeClose(){
        driver.close();
    }


    @Test
    public void OpenWebsite() throws InterruptedException {
        driver.get(websiteURL);
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }@Test
    public void OpenSignInPage() throws InterruptedException {
        driver.get(websiteURL);
        driver.manage().window().maximize();

        driver.findElement(UserSignInButton).click();
        Thread.sleep(3000);
    }@Test
    public void ValidateFieldsAndButtonDisplaying() throws InterruptedException {
        driver.get(websiteURL);
        driver.manage().window().maximize();

        driver.findElement(UserSignInButton).click();

        System.out.println(driver.findElement(EmailField).isDisplayed());
        System.out.println(driver.findElement(PasswordField).isDisplayed());
        System.out.println(driver.findElement(SubmitSigningInButton).isDisplayed());
        Thread.sleep(3000);
    }@Test
    public void EnterIncorrectData() throws InterruptedException {
        driver.get(websiteURL);
        driver.manage().window().maximize();

        driver.findElement(UserSignInButton).click();

        driver.findElement(EmailField).sendKeys(UserEmail);
        Thread.sleep(2000);
        driver.findElement(PasswordField).sendKeys(UserPassword);
        Thread.sleep(2000);
        driver.findElement(SubmitSigningInButton).click();
        Thread.sleep(4000);
    }@Test
    public void IncorrectEmailError() throws InterruptedException {
        driver.get(websiteURL);
        driver.manage().window().maximize();

        driver.findElement(UserSignInButton).click();

        driver.findElement(EmailField).sendKeys(UserEmail);
        Thread.sleep(2000);
        driver.findElement(PasswordField).sendKeys(UserPassword);
        Thread.sleep(2000);
        driver.findElement(SubmitSigningInButton).click();
        Thread.sleep(5000);

        System.out.println(driver.findElement(UserValidationError).isDisplayed());
    }
}