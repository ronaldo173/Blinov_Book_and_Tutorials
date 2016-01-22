package JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Santer on 21.01.2016.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestJunit1.class,
        TestJunit2.class
})

public class JunitTestSuite {
}
