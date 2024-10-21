package task_13;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {

    protected final Logger LOGGER = LogManager.getLogger(this.getClass());
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        LOGGER.info("Test Started: " + result.getMethod().getMethodName() + " " + result.getMethod().getDescription());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        LOGGER.info("Test Passed: " + result.getMethod().getMethodName() + " " + result.getMethod().getDescription());
    }
}


//V2. ITestListener method task (2, 3); ISuiteListener,IExecutionListener,IInvokedM…(5, 6)
