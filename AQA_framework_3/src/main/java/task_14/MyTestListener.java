package task_14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import io.qameta.allure.Attachment;

import static task_14.DriverPull.getDriver;

public class MyTestListener implements ITestListener, IInvokedMethodListener {

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
//        makeScreenShot();
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        IInvokedMethodListener.super.afterInvocation(method, testResult);
        if(testResult.getStatus() == ITestResult.FAILURE) {
            makeDOMAttachment();
            makeScreenShot();
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        LOGGER.error(result.getName()+" onTestFailure");
//        makeScreenShot();
//        makeDOMAttachment();
    }
    @Attachment(value="Page screen", type="image/png")
    private byte[] makeScreenShot(){
        LOGGER.error("makeScreenShot");
        return ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);
    }
    @Attachment(value="DOM", type="text/plain")
    private String makeDOMAttachment(){
        LOGGER.error("makeDOMAttachment");
        return getDriver().getPageSource();
    }



}

