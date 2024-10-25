package task_14;

import org.testng.annotations.*;
import task_14.HomePage14BO;
import task_14.MyTestListener;

@Listeners({MyTestListener.class})
public class Task14Test {
    @Test(description = "HomePage modal test suite")
    public void task14Test(){

        //Step 1 - verify homePage button
        new HomePage14BO()
                .getIndex()
                .verifyHomePageButtn().clickLogin()
                //step 2 - verify logIn button reference
                .verifyLogInButtn()
                //step 3 - verify input is visibile
                .verifyUserInput();

    }
    @BeforeSuite
    public void initDriver(){
        DriverPull.getDriver();

    }
    @AfterSuite
    public void closeDriver(){
        DriverPull.getDriver().close();
    }

}
