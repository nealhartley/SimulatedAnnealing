package tests;

import code.CityFactory;
import code.ThreeDigitTuple;
import org.junit.Test;
import code.CityStream;
import code.City;

import static org.junit.Assert.*;

public class CityStreamTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testOutPutOfCreation(){
        CityStream cs = new CityStream();
        cs.setupStream("Cities.txt");

        assertTrue(cs.pop().equals(new ThreeDigitTuple("Wellington", -41, 174)));

        assertTrue(cs.pop().equals(new ThreeDigitTuple("Auckland", -46, 174)));

        assertTrue(cs.pop().equals(new ThreeDigitTuple("Canberra", -35, 149)));

        assertTrue(cs.pop()==null);
    }

    @Test
    public void testCity(){
        //we need some test Cities
        CityFactory cf = new CityFactory();
        City test1 = cf.makeCity("home", 2, 4);
        City test2 = cf.makeCity("home", 2, 6);

        assertTrue(test1.getDistance(test2) == 2);

    }

}