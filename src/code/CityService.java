package code;

import java.util.ArrayList;

public class CityService {

    private CityStream cs;
    private CityFactory cf;

    public CityService(){
        cs = new CityStream();
        cf = new CityFactory();
    }

    public ArrayList<City> fetchCities(){
        //set up cs
        cs.setupStream("Cities.txt");

        ArrayList<City> cities = new ArrayList<City>();

        //loop through cs return values to create cities w factory
        ThreeDigitTuple t = cs.pop();
        while (t !=null){
            cities.add(cf.makeCity((String)t.getX(),(double)((Integer)t.getY()).intValue(),(double)((Integer)t.getZ()).intValue()));

            t=cs.pop();
        }

        //return list of Cities
        return cities; // temp
    }

}
