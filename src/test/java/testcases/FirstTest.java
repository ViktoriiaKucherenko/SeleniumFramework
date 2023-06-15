package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void OpenWebsite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ProjectAutomation\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();

    }@Test
    public void OpenSignInPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ProjectAutomation\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
    }@Test
    public void ValidateFieldsAndButtonDisplaying() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ProjectAutomation\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//input[@id='password']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed());
    }@Test
    public void EnterIncorrectData() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ProjectAutomation\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testEmail");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pwd");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }@Test
    public void IncorrectEmailError() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ProjectAutomation\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testEmail");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pwd");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        //p[contains(text(),'Error: email is incorrect')]
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Error: email is incorrect')]")).isDisplayed());
    }@Test
    public void ValidateCheckbox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ProjectAutomation\\TestProject\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
        System.out.println(driver.findElement(By.id("auth-page-remember-me")).isSelected());
    }
}