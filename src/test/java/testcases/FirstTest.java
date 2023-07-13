package testcases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SignInPage;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

public class FirstTest extends BaseTest {
    @Test
    public void OpenWebsite() {
        homePage.OpenFullPage();
    }

    @Test
    public void OpenSignInPage() {
        homePage.TakeMeToSignInPage();
    }

    @Test
    public void ValidateFieldsAndButtonDisplaying() {
        homePage.TakeMeToSignInPage();
        signInPage.SingInFieldsDisplayingCheck();
    }

    @Test
    public void EnterUserDataSubmit() {
        homePage.TakeMeToSignInPage();
        signInPage.EnterUserDataAndSubmit();
    }

    @Test
    public void IncorrectEmailError() throws InterruptedException {
        homePage.TakeMeToSignInPage();
        //Thread.sleep(5000);
        signInPage.EnterUserDataAndSubmit();
        WebDriverWait waitForValidationError = new WebDriverWait(driver, Duration.ofSeconds(25));
        waitForValidationError.until(ExpectedConditions.visibilityOfElementLocated(signInPage.UserValidationError));
        signInPage.UserValidationErrorDisplayingCheck();
    }

    @Test
    public void test() {
        driver.get("https://shafa.ua/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.TAB);
        List<String> tabHandler = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabHandler.size());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.TAB);
        tabHandler = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabHandler.size());

        baseMain.methodSwitchTab(0);

        baseMain.methodScrollPage(3000);
        baseMain.methodScrollPage(-1000);
    }
}