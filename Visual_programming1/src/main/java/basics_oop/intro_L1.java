
package basics_oop;



 class Car1 {

    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    void drive() {
        System.out.println("You drive the car");
    }

    void brake() {
        System.out.println("You step on the brakes");
    }
}



// main -------------------------------
public class intro_L1 {
    public static void main(String[] args) {
        Car1 myCar1 = new Car1();
        Car1 myCar2 = new Car1();

System.out.println(myCar1.make);
System.out.println(myCar1.model);
myCar1.drive();
myCar1.brake();
System.out.println();
System.out.println(myCar2.make);
System.out.println(myCar2.model);
myCar2.drive();
    }
    
}
