package JUnit;

import org.junit.*;

/**
 * Created by Santer on 21.01.2016.
 */
public class JunitAnotations {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("BEfore class...\n");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("\n....Afrer class, bb!");
    }

    @Before
    public void before(){
        System.out.println("in before");
    }

    @After
    public void after(){
        System.out.println("int after");
    }

    @Test
    public void test(){
        System.out.println("IN TEST @TEST");
    }

    @Ignore
    public void ignoreTest(){
        System.out.println("in ignore @IGNORE");
    }
}
