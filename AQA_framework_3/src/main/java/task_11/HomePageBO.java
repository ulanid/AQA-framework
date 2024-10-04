package task_11;

import org.testng.Assert;

import static task_11.DriverPull.getDriver;

public class HomePageBO {
HomePagePo homePagePo;

    public HomePageBO getIndex() {
        getDriver().get("https://www.demoblaze.com/index.html");
        homePagePo = new HomePagePo();
        return this;

    }

    public HomePageBO verifyHomePageButtn() {
        Assert.assertTrue(homePagePo.getHomePage().isDisplayed());
        return this;
    }

    public HomePageBO verifyLogInButtn() {

        Assert.assertTrue(homePagePo.getLogInButtn().isDisplayed());

        // logIn.click();
        // WebElement logInButtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")));

        return this;
    }

    public void verifyUserInput() {
        Assert.assertTrue(homePagePo.getUserInput().isDisplayed());

    }
}
