package TestClasses.AlgorithmTest;

import Methods.Algorithm.BinarySearch;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static Methods.Algorithm.BinarySearch.binarysearch;
import static org.junit.jupiter.api.Assertions.*;
public class SearchBinaryTest {
    BinarySearch b = new BinarySearch();
    @Before
    public void setUp(){

    }

    @After
    public void tearDown(){

    }

    @Test
    public void binarySearchTest(){
        int arr[] = new int[]{4,7,9,15,17} ;
        assertEquals(4, binarysearch(arr,17),"Binary Search Test successful");
        assertEquals(2, binarysearch(arr,9));
        assertEquals(0, binarysearch(arr,4));
        assertEquals(-1,binarysearch(arr,8));


    }
}
