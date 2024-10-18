package task_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static task_11.DriverPull.getDriver;

public class HomePage12Po {

    @FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[1]/a")
    private WebElement homePage;
    @FindBy(id = "login2")
    private WebElement logInButtn;
    @FindBy(xpath = "//*[@id=\"loginusername\"]")
    private CustomInput userInput;

    public HomePage12Po(){
        PageFactory.initElements(new MyFieldDecorator(getDriver()), this);
    }
    public WebElement getHomePage() {

        return homePage;
    }

    public WebElement getLogInButtn() {
        return logInButtn;
    }

    public CustomInput getUserInput() {
        return userInput;
    }
}
