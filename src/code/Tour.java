package code;

import java.util.ArrayList;

public class Tour {

    ArrayList<City> cities;

    public Tour(ArrayList<City> starting_cities){
        cities = starting_cities;
    }

    public int calcLength(){
        double distance = 0;
        City cityStore = null;
        for (City city: cities) {
            //if this is the first city
            if(cityStore == null){
                cityStore = city;
                continue;
            }

            distance = distance + city.getDistance(cityStore);
            cityStore = city;

        }

        return 0;
    }

}
