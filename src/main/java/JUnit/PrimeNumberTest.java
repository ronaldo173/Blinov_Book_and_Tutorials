package JUnit;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Santer on 22.01.2016.
 */
@RunWith(Parameterized.class)
public class PrimeNumberTest {


    private Integer intNum;
    private boolean expectedRes;
    private PrimeNumberChecker primeNumberChecker;

    @Before
    public void initialize() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    public PrimeNumberTest(Integer intNum, boolean expectedRes) {
        this.intNum = intNum;
        this.expectedRes = expectedRes;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {2, true},
                {6, false},
                {20, false},
                {22, false},
                {23, true}
        });
    }

    @Test
    public void testPrimeNumberChecker(){
        System.out.println("parametrized number is: " + intNum);
        System.out.println();
        Assert.assertEquals(expectedRes, primeNumberChecker.validate(intNum));
    }


}
