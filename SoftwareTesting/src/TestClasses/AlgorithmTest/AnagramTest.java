package TestClasses.AlgorithmTest;

import Methods.Algorithm.Anagram;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {
    Anagram anagram= new Anagram();
    @Before
    public void setUp(){

    }
    @After
    public void tearDown()
    {

    }
    @Test
    public void anagramTest(){
        String str1 = "Zainul" ;
        String str2 = "Haque" ;

        assertFalse(anagram.anagram("",str1));
        assertFalse(anagram.anagram(str1,""));
        assertTrue(anagram.anagram("Zainul",str1));
        assertTrue(anagram.anagram("ZAINUL",str1));
        assertFalse(anagram.anagram(str1,str2)); ;

    }
}
