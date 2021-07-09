package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test case started " + iTestResult.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test case success " + iTestResult.getName());

    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test case failed " + iTestResult.getName()+" in test Class " +iTestResult.getTestClass() + iTestResult.getThrowable());
    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Test case skipped " + iTestResult.getName());

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        System.out.println("Tests started ");

    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("Tests Completed ");

    }
}
