package testcases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.HomePage;
import pageobjects.SignInPage;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

public class FirstTest extends BaseTest {
    @Test(priority = 5, groups = {"group1"})
    public void OpenWebsite() {
        System.out.println("test1");
        homePage.OpenFullPage();
    }

    @Test(priority = 4, groups = {"group1"})
    public void OpenSignInPage() {
        System.out.println("test2");
        homePage.TakeMeToSignInPage();
    }

    @Test(priority = 3, groups = {"group1"})
    public void ValidateFieldsAndButtonDisplaying() {
        System.out.println("test3");
        homePage.TakeMeToSignInPage();
        signInPage.SingInFieldsDisplayingCheck();
    }

    @Test(priority = 2)
    public void EnterUserDataSubmit() {
        System.out.println("test4");
        homePage.TakeMeToSignInPage();
        signInPage.EnterUserDataAndSubmit();
    }

    @Test(priority = 1)
    public void IncorrectEmailError() throws InterruptedException {
        System.out.println("test5");
        homePage.TakeMeToSignInPage();
        //Thread.sleep(5000);
        signInPage.EnterUserDataAndSubmit();
        WebDriverWait waitForValidationError = new WebDriverWait(driver, Duration.ofSeconds(25));
        waitForValidationError.until(ExpectedConditions.visibilityOfElementLocated(signInPage.UserValidationError));
        signInPage.UserValidationErrorDisplayingCheck();
    }
}