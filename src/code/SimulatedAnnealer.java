package code;

import java.util.ArrayList;

public class SimulatedAnnealer {

    private Tour mainTour;
    private  Tour newTour;
    private double TMAX;
    private double TMIN;
    private double cooling_factor;

    public SimulatedAnnealer(ArrayList<City> cities, double heat, double cold, double coolFactor){
        mainTour = new Tour(cities);
        TMAX = heat;
        TMIN = cold;
        cooling_factor = coolFactor;
    }


    public void Anneale(){

        //start with high temp Tmax which decreases to Tmin
        Double temp = TMAX;
        Double energy;
        //loop while Temp is > Tmin
        while (temp > TMIN){
            // get current Energy i.e. length of tour
            energy = mainTour.calcLength();
            //then alter and compute new energy
            //compute deltaE or change in Energy

            //if - deltaE is good then accept move
                //current config becomes new config
            //else if - compute probability(change in energy / Temperature compared to rand(0,1)), At high temps we accept more bad moves
                //current config becomes new config
            //decrease Temp
        }
    }

}
