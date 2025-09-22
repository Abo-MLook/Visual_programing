package basics_oop;

class CarL4 {
    String name;
    CarL4(String name) { this.name = name; }
} // ********************************************

class GarageL4 {
    void park(CarL4 car) {
        System.out.println("The " + car.name + " is parked in the garage");
    }
} // ********************************************

// --------------------------main-------------------------
public class passing_objects___L4 {
    public static void main(String[] args) {
        GarageL4 garage = new GarageL4();
        CarL4 car1 = new CarL4("BMW");
        CarL4 car2 = new CarL4("Tesla");
        garage.park(car1);
        garage.park(car2);
    }
}
