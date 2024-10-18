package task_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static task_11.DriverPull.wait;

public class CustomInput extends Element{
    public CustomInput(WebElement webElement){
        super(webElement);
    }
    public boolean isVisible(){
        return webElement.isDisplayed();

    }

    public void waitForClickable(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")));

    }


}
