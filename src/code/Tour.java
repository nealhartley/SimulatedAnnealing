package code;

import java.util.ArrayList;
import java.util.Random;

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



            i++;
            if(i == cities.size()){
                //we on the last loop
                distance = distance + city.getDistance(firstCity);


            }



        }
        System.out.println("distance: " + distance);
        return distance;
    }

    public Tour mutateTwoCities(){
        System.out.println("\n We are beginning the mutation");

        ArrayList<City> clonedCities = (ArrayList<City>)cities.clone();
        System.out.println(" cloned cities size 1st = " + clonedCities.size());

        //need to implement a swap between two spots in the array. Then return a new Tour with that array.

        int indice1 = (int)(Math.random()*clonedCities.size()-1);

        int indice2 = (int)(Math.random()*clonedCities.size()-1);;

        City temp;
        temp = clonedCities.get(indice1);
        clonedCities.set(indice1, clonedCities.get(indice2));
        clonedCities.set(indice2, temp);
        System.out.println(" cloned cities size end = " + clonedCities.size());
        System.out.println("mutation done\n");
        return new Tour(clonedCities);
    }

    public void printTour(){
        System.out.println("\n printing tour\n");
        for (City c: cities) {
            System.out.println("name:" + c.getName() + " position x: " + c.getPositionX() +", position y: "+ c.getPositionY());
        }
    }

}
