package JUnit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Santer on 21.01.2016.
 */
public class TestAssertions {

    @Test
    public void testAssertions() {

        String s1 = new String("abs");
        String s2 = new String("abs");
        String s3 = null;
        String s4 = "abs";
        String s5 = "abs";
        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray = {"one", "two", "three"};

        assertEquals(s1, s2);

        assertTrue(val1 < val2);

        assertFalse(val1 > val2);

        assertNotNull(s1);

        assertNull(s3);

        assertSame(s4, s5);

        assertNotSame(s1, s3);

        assertArrayEquals(expectedArray, resultArray);
    }
}
