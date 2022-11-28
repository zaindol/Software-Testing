package TestClasses.MathematicalTest;

import Methods.Mathematical.PythagoreanTriple;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PythagoreanTriplet {
    PythagoreanTriple p = new PythagoreanTriple();
    @Before
    public void setUp(){

    }
    @After
    public void tearDown()
    {

    }
    @Test
    public void PythagoreanTest(){
        assertEquals(true,p.pythagoreantriple(3,4,5),"PythagoreanTriple Test successful");
        assertEquals(false,p.pythagoreantriple(3,6,8));
        assertNotEquals(true,p.pythagoreantriple(6,7,8));
        assertNotEquals(false,p.pythagoreantriple(6,8,10));
    }
}
