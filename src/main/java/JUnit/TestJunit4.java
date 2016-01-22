package JUnit;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;
import org.junit.Test;

/**
 * Created by Santer on 21.01.2016.
 */
public class TestJunit4 extends TestResult {

    public synchronized void addError(Test test, Throwable t){
        super.addError((junit.framework.Test) test, t);
    }

    public synchronized void addFailure(Test test, AssertionFailedError t){
        super.addFailure((junit.framework.Test) test, t);
    }

    @Test
    public void testAdd(){
        System.out.println("test");
    }

    public synchronized void stop(){

    }
}
