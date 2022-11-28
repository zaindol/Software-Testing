package TestClasses.MathematicalTest;

import Methods.Mathematical.Construct2D;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Contruct2DTest {
    Construct2D construct2D = new Construct2D() ;

    @Before
    public void setUp(){

    }
    @After
    public void tearDown()
    {

    }
    @Test
    public void contruct2DTest(){
        int[] arr = new int[]{1,2,3,4,5,6} ;
        int[][] res = {{1,2},{3,4},{5,6}};
        int m = 2 ;
        int n = 3 ;
        assertTrue(Arrays.deepEquals(res,construct2D.construct2DArray(arr,m,n)));

    }
}
