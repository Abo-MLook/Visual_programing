package basics_oop;

public class Encapsulation__L8 {
    public static void main(String[] args) {
        CarL8 c1 = new CarL8("Chevrolet", "Camaro", 2021);
        CarL8 c2 = new CarL8(c1);   // copy constructor

        System.out.println(c1);
        System.out.println(c2);
        System.out.println();

        System.out.println(c1.getMake());
        System.out.println(c1.getModel());
        System.out.println(c1.getYear());
        System.out.println();

        System.out.println(c2.getMake());
        System.out.println(c2.getModel());
        System.out.println(c2.getYear());
    }
}

// Encapsulation = attributes of a class will be hidden or private,
//                 accessed only through methods (getters & setters),
//                 keep fields private unless you have a good reason to make them public.

class CarL8 {

    private String make;
    private String model;
    private int year;

    public CarL8(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // copy constructor
    public CarL8(CarL8 other){
        this(other.make, other.model, other.year);
    }

    // optional copier
    public void copyFrom(CarL8 other){
        this.make = other.make;
        this.model = other.model;
        this.year = other.year;
    }

    // getters / setters
    public String getMake()  { return make; }
    public String getModel() { return model; }
    public int getYear()     { return year; }
    public void setMake(String make)   { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year)      { this.year = year; }

    @Override public String toString() {
        return make + " " + model + " (" + year + ")";
    }
}
