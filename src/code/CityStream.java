package code;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CityStream {

    ArrayList<ThreeDigitTuple> tuples;
    int currentIndex = 0;

    public CityStream(){}

    public boolean setupStream(String fileName){

        //we are gonna make an array of tuples that represent cities and store it
        tuples = new ArrayList<>();

        try {
            //open stream to read from text file
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            while (line!=null){
                System.out.println(line);
                String[] parts = line.split(",");



                tuples.add(new ThreeDigitTuple(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));


                line = br.readLine();
            }


            br.close();
        } catch (FileNotFoundException e){
            System.out.println("file not found");
            return false;
        } catch (IOException e){
            System.out.println("IO Exception");
            return false;
        }
        //loop through file creating a tuple for each line
        return true;
    }


    public void printTuples(){
        for (ThreeDigitTuple tuple: tuples
             ) {
            System.out.println( tuple.getX() + ", ");
            System.out.println( tuple.getY() + ", ");
            System.out.println( tuple.getZ() + "\n");
        }

    }

    public ThreeDigitTuple pop(){

        if(currentIndex == tuples.size()){
            return null;
        }
        currentIndex++;
        return tuples.get(currentIndex-1);
    }


}
