package task_13;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.*;

public class MyExecutionListener implements ISuiteListener, IExecutionListener, IInvokedMethodListener {

    protected final Logger LOGGER = LogManager.getLogger(this.getClass());
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        IInvokedMethodListener.super.beforeInvocation(method, testResult);
        LOGGER.info("Starting: " + method.getTestMethod().getMethodName());
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        IInvokedMethodListener.super.afterInvocation(method, testResult);
        LOGGER.info("Finished: " + method.getTestMethod().getMethodName());
    }
}

//V2. ITestListener method task (2, 3); ISuiteListener,IExecutionListener,IInvokedM…(5, 6)