package JUnit;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Santer on 22.01.2016.
 */
public class TestMessageUtil3 {

    String message = "Alex";
    MessageUtil3 messageUtil3 = new MessageUtil3(message);

    @Test(expected = ArithmeticException.class)
    public void testPrintMes() {
        System.out.println("inside testPrintMessage");
        messageUtil3.printMessage();
    }

    @Test
    public void testSalut() {
        System.out.println("inside test salut()");
        message = "hi " + message;
        Assert.assertEquals(message, messageUtil3.salutationMessage());
    }
}
