package task_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static task_11.DriverPull.getDriver;

public class HomePagePo {
    public WebElement getHomePage() {
        return getDriver().findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
    }

    public WebElement getLogInButtn() {
        return getDriver().findElement(By.id("login2"));
    }

    public WebElement getUserInput() {
        return getDriver().findElement(By.xpath("//*[@id=\"loginusername\"]"));

    }
}
