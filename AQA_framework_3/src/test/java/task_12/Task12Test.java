package task_12;

import com.automation.remarks.testng.UniversalVideoListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import task_13.MyExecutionListener;
import task_13.MyTestListener;

@Listeners({MyTestListener.class, MyExecutionListener.class, UniversalVideoListener.class})
public class Task12Test {
    @Test(description = "HomePage modal test suite")
    public void task11Test(){

        //Step 1 - verify homePage button
        new HomePage12BO()
                .getIndex()
                .verifyHomePageButtn().clickLogin()
                //step 2 - verify logIn button reference
                .verifyLogInButtn()
                //step 3 - verify input is visibile
                .verifyUserInput();

    }

    @Test(description = "HomePage modal test suite")
    public void task11FailureTest(){

        //Step 1 - verify homePage button
        new HomePage12BO()
                .getIndex()
                .verifyHomePageButtn().clickLogin()
                //step 3 - verify input is visibile
                .verifyUserInput();

    }
}
