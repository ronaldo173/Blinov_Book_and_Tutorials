package JUnit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Santer on 21.01.2016.
 */
public class TestJunit3 {

    @Test
    public void testAdd() {
        int num = 5;
        String temp = null;
        String str = "Junit works";


        Assert.assertEquals("Junit works", str);
        Assert.assertFalse(num > 6);
//        str=null;
        Assert.assertNotNull(str);
    }
}
