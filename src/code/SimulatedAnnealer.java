package code;

import java.util.ArrayList;

public class SimulatedAnnealer {

    private Tour mainTour;
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
            Tour newTour = this.mainTour.mutateTwoCities();

            Double newEnergy = newTour.calcLength();
            //compute deltaE or change in Energy

            Double deltaEnergy = (newEnergy-energy);
            Double badJumper = Math.exp(-deltaEnergy/temp); //our probability for making a bad jump
            //if - deltaE is good then accept move
            if(deltaEnergy < 0){
                this.mainTour = newTour;
            }
            //else if - compute probability(change in energy / Temperature compared to rand(0,1)), At high temps we accept more bad moves
            else if(badJumper > Math.random()){
                this.mainTour = newTour;
            }

            //decrease Temp
            temp = temp*cooling_factor;
        }

        this.mainTour.printTour();
        System.out.println(
                "annealed - final distance: " + this.mainTour.calcLength()
        );
    }

}
