package task_12;

import org.testng.annotations.Test;

public class Task12Test {
    @Test
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
}
