package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class JavaAndSeleniumPracticeTest extends BaseTest{

    @Test
    public void ValidateJobList() throws InterruptedException {
        homePage.TakeMeToSignUpPage();
        WebElement searchJobDropdownElement;
        searchJobDropdownElement = driver.findElement(By.id("job-title"));
        Select searchJobDropdown = new Select(searchJobDropdownElement);
        List<WebElement> jobOptions = new ArrayList<>();
        jobOptions = searchJobDropdown.getOptions();
        int jobListSize = jobOptions.size();
        for (int i=0; i<jobListSize; i++){
            System.out.println(jobOptions.get(i).getText());
        }

    }
}
