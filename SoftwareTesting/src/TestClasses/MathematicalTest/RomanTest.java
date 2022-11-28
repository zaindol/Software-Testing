package TestClasses.MathematicalTest;

import Methods.Mathematical.romantoInt;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanTest {
    romantoInt r = new romantoInt();
    @Before
    public void setUp(){

    }
    @After
    public void tearDown()
    {

    }
    @Test
    public void RomanTest(){
        assertEquals(3,r.romanToInt("III"),"Successful");
        assertEquals(1994,r.romanToInt("MCMXCIV"),"Successful");
        assertEquals(58,r.romanToInt("LVIII"),"Successful");
    }
}
