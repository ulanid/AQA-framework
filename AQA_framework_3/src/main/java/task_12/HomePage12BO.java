package task_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import task_11.HomePagePo;

import static task_11.DriverPull.getDriver;
import static task_11.DriverPull.wait;

public class HomePage12BO {
HomePage12Po homePagePo;

    public HomePage12BO getIndex() {
        getDriver().get("https://www.demoblaze.com/index.html");
        homePagePo = new HomePage12Po();
        return this;

    }

    public HomePage12BO verifyHomePageButtn() {
        Assert.assertTrue(homePagePo.getHomePage().isDisplayed());
        return this;
    }

    public HomePage12BO verifyLogInButtn() {

        Assert.assertTrue(homePagePo.getLogInButtn().isDisplayed());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")));


//        WebElement logInButtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")));

        return this;
    }
    public HomePage12BO clickLogin() {
        homePagePo .getLogInButtn().click();
        return this;
    }

    public void verifyUserInput() {
        Assert.assertTrue(homePagePo.getUserInput().isVisible());

    }


}
