package task_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static task_14.DriverPull.getDriver;

public class HomePage14Po {
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
