package code;

public class CityFactory {

    public CityFactory(){}

    public City makeCity(String name, double x, double y){
        return new City(name,x,y);
    }
}
