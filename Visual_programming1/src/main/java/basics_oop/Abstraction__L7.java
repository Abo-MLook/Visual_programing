
package basics_oop;


public class Abstraction__L7 {

    public static void main(String[] args) {

        //Vehicle vehicle = new Vehicle();  // error 
        Vcar car = new Vcar(); // force the user to choose a Vehicle

        car.go();
    }
}
//****************************************

// abstract =  	abstract classes cannot be instantiated(called in same object or created), but they can have a subclass(its attirbute can be taken)
// abstract methods are declared without an implementation

abstract class Vehicle {
    // atirbutes of any Vehicle.... 

     void go(){
        System.out.println("The driver is driving the car");

    }
}
//****************************************

class Vcar extends Vehicle {

     // must be
    void go() {
        System.out.println("The driver is stopping the car");

    }
}
//***************************************
