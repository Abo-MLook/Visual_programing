/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics_oop;

/**
 *
 * @author memom
 */
//****************************************main
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

    abstract void go();
}
//****************************************

class Vcar extends Vehicle {

    @Override // must be
    void go() {
        System.out.println("The driver is driving the car");

    }
}
//***************************************
