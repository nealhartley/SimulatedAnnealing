package code;

public class City {

    private double positionX;
    private double positionY;
    private String name;

    public City(String name,double x, double y){
        name = name;
        positionX = x;
        positionY = y;
    }

    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public String getName() {
        return name;
    }
}
