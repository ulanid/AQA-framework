package task_14;

import org.testng.Assert;
import task_14.HomePage14Po;

import static task_14.DriverPull.getDriver;

public class HomePage14BO {
HomePage14Po homePagePo;

    public HomePage14BO getIndex() {
        getDriver().get("https://www.demoblaze.com/index.html");
        homePagePo = new HomePage14Po();
        return this;

    }

    public HomePage14BO verifyHomePageButtn() {
        Assert.assertTrue(homePagePo.getHomePage().isDisplayed());
        return this;
    }

    public HomePage14BO verifyLogInButtn() {

        Assert.assertTrue(homePagePo.getLogInButtn().isDisplayed());

        // logIn.click();
        // WebElement logInButtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")));

        return this;
    }

    public void verifyUserInput() {
        Assert.assertTrue(homePagePo.getUserInput().isDisplayed());

    }

    public HomePage14BO clickLogin() {
        homePagePo.getLogInButtn().click();
        return this;
    }
}
