package tests;

import code.ThreeDigitTuple;
import org.junit.Test;
import code.CityStream;

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

        assertTrue(cs.pop().equals(new ThreeDigitTuple("Wellington", -41, 174)));

        assertTrue(cs.pop().equals(new ThreeDigitTuple("Auckland", -46, 174)));

        assertTrue(cs.pop().equals(new ThreeDigitTuple("Canberra", -35, 149)));

        assertTrue(cs.pop()==null);
    }


}