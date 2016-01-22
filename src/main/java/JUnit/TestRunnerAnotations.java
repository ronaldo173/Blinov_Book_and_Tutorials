package JUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Santer on 21.01.2016.
 */
public class TestRunnerAnotations {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JunitAnotations.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure);
        }


        System.out.println(result.getRunCount());
        System.out.println(result.getRunTime());
        System.out.println(result.getIgnoreCount());
        System.out.println(result.wasSuccessful());
    }
}
