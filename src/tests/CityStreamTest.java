package tests;

import code.*;
import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void testTour(){
        CityFactory cf = new CityFactory();
        City test1 = cf.makeCity("home", 2, 4);
        City test2 = cf.makeCity("home", 2, 6);
        City test3 = cf.makeCity("home", 2, 8);
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(test1);
        cities.add(test2);
        cities.add(test3);

        Tour tourTest = new Tour(cities);
        System.out.println(tourTest.calcLength());
        assertTrue(tourTest.calcLength() == 8);

    }

}