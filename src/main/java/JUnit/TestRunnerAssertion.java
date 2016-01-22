package JUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Santer on 21.01.2016.
 */
public class TestRunnerAssertion {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestAssertions.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
