package JUnit;

import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * Created by Santer on 21.01.2016.
 */
public class JunitTestSuite2 {

    public static void main(String[] args) {
        TestSuite suite = new TestSuite(TestJunit1.class,
                TestJunit2.class, TestJunit3.class, TestJunit4.class);
        TestResult result = new TestResult();
        suite.run(result);

        System.out.println("number of test cases: " + result.runCount()+
        "..testCount: " + suite.testCount());
    }
}
