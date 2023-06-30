package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SignInPage;

public class FirstTest extends BaseTest{

    @Test
    public void OpenWebsite() throws InterruptedException {
        homePage.OpenFullPage();
    }@Test
    public void OpenSignInPage() throws InterruptedException {
        homePage.TakeMeToSignInPage();
    }@Test
    public void ValidateFieldsAndButtonDisplaying() throws InterruptedException {
        homePage.TakeMeToSignInPage();
        signInPage.SingInFieldsDisplayingCheck();
    }@Test
    public void EnterUserDataSubmit() throws InterruptedException {
        homePage.TakeMeToSignInPage();
        signInPage.EnterUserDataAndSubmit();
    }@Test
    public void IncorrectEmailError() throws InterruptedException {
        homePage.TakeMeToSignInPage();
        signInPage.EnterUserDataAndSubmit();
        signInPage.UserValidationErrorDisplayingCheck();
    }
}