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
    public int expectedMainMenuElementsSize = 4;
    public int actualMainMenuElementsSize;
    public String actualMainMenuTitle1;
    public String actualMainMenuTitle2;
    public String actualMainMenuTitle3;
    public String actualMainMenuTitle4;
    public String expectedMainMenuTitle1 = "Course Gallery";
    public String expectedMainMenuTitle2 = "Sign In";
    public String expectedMainMenuTitle3 = "Sign Out";
    public String expectedMainMenuTitle4 = "En";
    public String mainMenuElementLocator1 = "//div[@class='menu']/a[1]";
    public String mainMenuElementLocator2 = "//div[@class='menu']/a[2]";
    public String mainMenuElementLocator3 = "//div[@class='menu']/a[3]";
    public String mainMenuElementLocator4 = "//div[@class='menu']/a[4]";

    @Test
    public void hardAssertsMainPage() {
        homePage.OpenFullPage();
        List<WebElement> mainMenuElements = driver.findElements(By.xpath("//div[@class='menu']/a"));
        actualMainMenuElementsSize = mainMenuElements.size();
        //System.out.println(actualMainMenuElementsSize);

        Assert.assertEquals(actualMainMenuElementsSize, expectedMainMenuElementsSize); // int Pass

        actualMainMenuTitle1 = driver.findElement(By.xpath(mainMenuElementLocator1)).getText();
        actualMainMenuTitle2 = driver.findElement(By.xpath(mainMenuElementLocator2)).getText();
        actualMainMenuTitle3 = driver.findElement(By.xpath(mainMenuElementLocator3)).getText();
        actualMainMenuTitle4 = driver.findElement(By.xpath(mainMenuElementLocator4)).getText();
        //System.out.println(actualTitle1);
        Assert.assertEquals(actualMainMenuTitle1, expectedMainMenuTitle1); // String Pass
        Assert.assertEquals(actualMainMenuTitle2, expectedMainMenuTitle2); // String Pass
        Assert.assertEquals(actualMainMenuTitle3, expectedMainMenuTitle3); // String Fail
        Assert.assertEquals(actualMainMenuTitle4, expectedMainMenuTitle4); // String Not executed

    }

    public boolean actualSignInErrorDisplay;
    public boolean expectedSignInErrorDisplay = false;

    public boolean actualLoginButtonDisplay;
    public boolean expectedLoginButtonDisplay = false;

    @Test
    public void softAssertsMainAndSignInPages(){
        homePage.OpenFullPage();
        List<WebElement> mainMenuElements = driver.findElements(By.xpath("//div[@class='menu']/a"));
        actualMainMenuElementsSize = mainMenuElements.size();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualMainMenuElementsSize, expectedMainMenuElementsSize); // int Pass

        actualMainMenuTitle3 = driver.findElement(By.xpath(mainMenuElementLocator3)).getText();
        softAssert.assertEquals(actualMainMenuTitle3, expectedMainMenuTitle3); // String Fail

        homePage.TakeMeToSignInPage();
        signInPage.EnterUserDataAndSubmit();
        WebDriverWait waitForValidationError = new WebDriverWait(driver, Duration.ofSeconds(25));
        waitForValidationError.until(ExpectedConditions.visibilityOfElementLocated(signInPage.UserValidationError));

        actualSignInErrorDisplay = driver.findElement(signInPage.UserValidationError).isDisplayed();
        softAssert.assertEquals(actualSignInErrorDisplay, expectedSignInErrorDisplay); // Boolean Fail

        actualLoginButtonDisplay = driver.findElement(signInPage.SubmitSigningInButton).isDisplayed();
        softAssert.assertEquals(actualLoginButtonDisplay, expectedLoginButtonDisplay); // Boolean Fail

        softAssert.assertAll();
    }
}