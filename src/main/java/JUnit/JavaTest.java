package JUnit;

import org.junit.Assert;

/**
 * Created by Santer on 21.01.2016.
 */
public class JavaTest {
    protected int val1, val2;

    protected void setUp() {
        val1 = 3;
        val2 = 3;
    }

    public void testAdd() {
        double result = val1 + val2;
        Assert.assertTrue(result == 6);
    }
}
