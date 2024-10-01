package task_10;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task10Manager {
    WebDriver webDriver;
    @BeforeTest
    void setup(){

        ChromeDriverManager.getInstance().setup();
        webDriver = new ChromeDriver();

        //ChromeOptions options = new ChromeOptions();
        //options.setHeadless(false);

    }
    @Test
    void task10Test(){

    }
}
