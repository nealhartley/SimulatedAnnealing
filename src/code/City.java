package code;

public class City {

    private double positionX;
    private double positionY;
    private String name;

    public City(String name,double x, double y){
        this.name = name;
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

    public double getDistance(City cityStore) {

        double opposite = this.positionX - cityStore.getPositionX();
        double adjacent = this.positionY - cityStore.getPositionY();

        double hypotenuse = ((opposite * opposite) + (adjacent * adjacent));
        hypotenuse = Math.sqrt(hypotenuse);

        return hypotenuse;
    }
}
