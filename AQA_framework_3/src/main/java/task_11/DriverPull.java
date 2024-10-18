package task_11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverPull {
    public static WebDriverWait wait;
    public static WebDriver getDriver(){

        if(driver==null) {
            System.setProperty("webdriver.chrome.driver",
                    "driver/chromedriver.exe");

            //ChromeOptions options = new ChromeOptions();
            //options.setHeadless(false);

            driver = new ChromeDriver();

            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
        return driver;
    }
    static WebDriver driver;

}
