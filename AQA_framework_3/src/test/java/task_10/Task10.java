package task_10;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;


import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Task10 {
    WebDriver webDriver;
    @BeforeTest
    void setup(){
        System.setProperty("webdriver.chrome.driver",
                "driver/chromedriver.exe");

        //ChromeOptions options = new ChromeOptions();
        //options.setHeadless(false);

        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

    }
    @Test
    void task10Test(){
        webDriver.get("https://www.demoblaze.com/index.html");
        WebElement homePage = webDriver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
        WebElement logIn = webDriver.findElement(By.id("login2"));

//      WebElement phone = webDriver.findElement(By.xpath("//a[contains(@href, \"prod.html?idp_\")][1]"));

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")));



        phone.click();
        webDriver.navigate().back();
        homePage.click();
        logIn = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
        logIn.click();

    }
    @AfterTest
    void closeBrowser(){
        webDriver.quit();
        webDriver.close();
    }
}



// 1. Set up ChromeDriver using the driver file and properties.
// 2. Set up ChromeDriver using DriverManager.
// 3. Navigate to the page assigned to your variant.
// 4. Select any three different elements.
// 5. Interact with all the selected elements.
// 6. Verify the visibility of each element using assertions.
// 7. Wrap all these steps into a TestNG test case.

//V2. https://www.demoblaze.com/ (Home page)