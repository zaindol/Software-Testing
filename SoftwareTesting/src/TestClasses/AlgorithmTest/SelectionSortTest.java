package TestClasses.AlgorithmTest;

import Methods.Algorithm.SelectionSort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SelectionSortTest {
    SelectionSort Sort = new SelectionSort();
    @Before
    public void setUp(){

    }
    @After
    public void tearDown()
    {

    }
    @Test
    public void selectionSortTest(){
        int arr1[] = new int[] {7,2,1,5,9};
        int arr2[] = new int[] {1,2,5,7,9};
        assertArrayEquals(arr2,Sort.selectionSort(arr1,5),"Successful");
        assertArrayEquals(arr2,Sort.selectionSort(arr2,5));
    }

}
