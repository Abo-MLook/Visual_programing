/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics_oop;

/**
 *
 * @author memom
 */

public class polymorphism__L10 {

    public static void main(String[] args) {

        VehicleL10 car = new CarL10();
        VehicleL10 bicycle = new BicycleL10();
        VehicleL10 boat = new BoatL10();

        VehicleL10[] racers = { car, bicycle, boat };

        for (VehicleL10 x : racers) {
            x.go();
        }
       
    }
}

// ---- top-level classes in the SAME FILE (package-private) ----

class VehicleL10 {
    public void go() {
        // base behavior (intentionally empty)
    }
}

class CarL10 extends VehicleL10 {
    @Override
    public void go() {
        System.out.println("*The car begins moving*");
    }
}

class BicycleL10 extends VehicleL10 {
    @Override
    public void go() {
        System.out.println("*The bicycle begins moving*");
    }
    void ao() {
        System.out.println("awa*");
    }
}

class BoatL10 extends VehicleL10 {
    @Override
    public void go() {
        System.out.println("*The boat begins moving*");
    }
}
