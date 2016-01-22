package JUnit;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Santer on 21.01.2016.
 */
public class TestJunit2 extends TestCase {

    protected double fVal1;
    protected double fVal2;

    @Before
    public void setUp() {
        fVal1 = 2.0;
        fVal2 = 3.0;
    }

    @Test
    public void testAdd() {
        System.out.println("no of Test case: " + this.countTestCases());

        String name = this.getName();
        System.out.println("Test case name: " + name);

        this.setName("testName");
        String newName = this.getName();
        System.out.println("Update test case name: " +  newName);
    }

    public void tearDown(){

    }
}
