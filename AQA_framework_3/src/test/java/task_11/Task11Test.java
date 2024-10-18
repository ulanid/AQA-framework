package task_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static task_11.DriverPull.getDriver;
import static task_11.DriverPull.wait;

public class Task11Test {

    @Test
    public void task11Test(){

        //Step 1 - verify homePage button
        new HomePageBO().getIndex().verifyHomePageButtn()
                //step 2 - verify logIn button reference
                .verifyLogInButtn()
                //step 3 - verify input is visibile
                .verifyUserInput();

    }

    @AfterTest
    void closeBrowser(){
        getDriver().quit();
//        getDriver().close();
    }
}

// General task
// 1. Make up one simple UI end-to-end test case for your test page from Task_10
// 2. Automate that scenario using WebDriver
// 3. Create PageObject (use Busines object if need)for all pages used in scenario
//
// Scenario example (new account)
//- Navigate to the sign-up page
//- Enter a valid email address, a username, and a strong password
//- Click on the "Sign Up" button
//- Verify that the user is redirected to the home page
//- Verify that the user account is created andlogged in