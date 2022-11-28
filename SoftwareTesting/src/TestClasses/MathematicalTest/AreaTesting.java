package TestClasses.MathematicalTest;

import Methods.Mathematical.Area;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AreaTesting {

    Area a = new Area();
    @BeforeEach
    public void setUp(){
    }

    @AfterEach
    public void tearDown(){
    }

    @Test
    public void areaTest(){
        assertEquals(54.0,a.area(1,3.0,0),"Cube surface area Test successful");
        assertNotEquals(55.0, a.area(1,-3.0,0));

        assertEquals(113.09733552923255,a.area(2,3.0,0),"Sphere surface area test successful");
        assertNotEquals(113.097335,a.area(2,-3.0,0));

        assertEquals(62.255854079725076,a.area(3,3.0,2.0),"Cone Surface Area");
        assertNotEquals(62.255854,a.area(3,-3.0,2.0));

        assertEquals(84.82300164692441,a.area(4,3.0,2.0),"");
        assertNotEquals(84.8230016,a.area(4,3.0,-2.0));

        assertEquals(94.24777960769379,a.area(5,3.0,2.0),"");
        assertNotEquals(94.2477796,a.area(5,-3.0,2.0));

        assertEquals(-1,a.area(7,0.9,0.8),"deafult case test successful");
    }
}
