package code;

import java.util.ArrayList;

public class Tour {

    ArrayList<City> cities;

    public Tour(ArrayList<City> starting_cities){
        cities = starting_cities;
    }

    public double calcLength(){
        double distance = 0;
        City cityStore = null;
        City firstCity = null;

        int i = 0;
        for (City city: cities) {
            //if this is the first city
            if(cityStore == null){
                cityStore = city;
                firstCity = city;
                i++;
                continue;
            }

            distance = distance + city.getDistance(cityStore);
            cityStore = city;


            System.out.println(i + " i - city size " + cities.size());
            i++;
            if(i == cities.size()){
                //we on the last loop
                distance = distance + city.getDistance(firstCity);

                System.out.println("we on the last city");
            }

            System.out.println("inside loop" + distance + " i == "+ i);

        }
        System.out.println(cities.size());
        return distance;
    }

}
