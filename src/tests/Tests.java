package tests;

import code.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Tests {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testOutPutOfCreation(){
        System.out.println("testing output of creation");
        CityStream cs = new CityStream();
        cs.setupStream("Cities.txt");

        assertTrue(cs.pop().equals(new ThreeDigitTuple("Wellington", -41, 174)));

        assertTrue(cs.pop().equals(new ThreeDigitTuple("Auckland", -46, 174)));

        assertTrue(cs.pop().equals(new ThreeDigitTuple("Canberra", -35, 149)));

        assertTrue(cs.pop().equals(new ThreeDigitTuple("Sydney",-34,151)));

        assertTrue(cs.pop().equals(new ThreeDigitTuple("Niue",-19,170)));

        assertTrue(cs.pop()==null);
    }

    @Test
    public void testCity(){
        System.out.println("testing city");
        //we need some test Cities
        CityFactory cf = new CityFactory();
        City test1 = cf.makeCity("home", 2, 4);
        City test2 = cf.makeCity("home", 2, 6);

        assertTrue(test1.getDistance(test2) == 2);

    }

    @Test
    public void testTour(){
        System.out.println("testing tour");
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

    @Test
    public void testAnnealer(){
        System.out.println("testing annealer");
        CityService cs = new CityService();
        ArrayList<City> cities = cs.fetchCities();
        SimulatedAnnealer sa = new SimulatedAnnealer(cities, 1000, 10, 0.9);
        sa.Anneale();

        assertTrue(false);

    }

}