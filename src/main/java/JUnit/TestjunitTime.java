package JUnit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Santer on 21.01.2016.
 */
public class TestjunitTime {

    String message = "it's time for break";
    MessageUtil2 messageUtil2 = new MessageUtil2(message);

    @Test(timeout = 1000)
    public void testPrint() {
        System.out.println("inside print");
        messageUtil2.printMessage();
    }

    @Test
    public void testSalutation() {
        System.out.println("inside salutqation");
        message = "hi " + message;
        Assert.assertEquals(message, messageUtil2.salutationMEssage());
    }
}
