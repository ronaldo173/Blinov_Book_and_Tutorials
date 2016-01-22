package JUnit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Santer on 21.01.2016.
 */


public class TestJunit1 {
    String message = "Alex";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        message = " go fail";
        Assert.assertEquals(message, messageUtil.printMessage());
    }
}
