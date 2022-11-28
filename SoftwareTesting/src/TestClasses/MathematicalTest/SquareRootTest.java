package TestClasses.MathematicalTest;

import Methods.Algorithm.Anagram;
import Methods.Mathematical.SquareRoot;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareRootTest {
    SquareRoot squareRoot = new SquareRoot();
    @Before
    public void setUp(){

    }
    @After
    public void tearDown()
    {

    }
    @Test
    public void SquareRootTest(){
        assertEquals(2,squareRoot.squareroot(4));
        assertEquals(0,squareRoot.squareroot(0));
        assertEquals(-1,squareRoot.squareroot(-1));
    }
}
