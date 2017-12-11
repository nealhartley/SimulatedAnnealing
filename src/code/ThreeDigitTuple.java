package code;

public class ThreeDigitTuple<X, Y, Z> {

    private final X x;
    private final Y y;
    private final Z z;

    public ThreeDigitTuple(X x, Y y, Z z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean equals(ThreeDigitTuple tuple){

        if (!this.y.equals(tuple.getY())) {
            System.out.println("y not equal");
            System.out.println("y " + this.y);
            System.out.println("y " + tuple.getY());
            return false;
        }
        else if(!this.x.toString().equals( tuple.getX().toString() )/* | this.y != tuple.getY() | this.z !=tuple.getZ()*/){
            System.out.println("x not equal");
            return false;
        }
        else if(!this.z.equals( tuple.getZ())){
            System.out.println("z not equal");
            return false;
        }

        return true;
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    public Z getZ() {
        return z;
    }
}

