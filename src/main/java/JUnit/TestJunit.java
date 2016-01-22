package JUnit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Santer on 21.01.2016.
 */
public class TestJunit {

    @Test
    public void test(){
        String str = "test JUnit";

        Assert.assertEquals("test JUnit", str);
    }
}
