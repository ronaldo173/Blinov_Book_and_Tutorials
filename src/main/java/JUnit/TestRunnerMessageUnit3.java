package JUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Santer on 22.01.2016.
 */
public class TestRunnerMessageUnit3 {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestMessageUtil3.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
