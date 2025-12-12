
package basics_oop;


public class Abstraction__L7 {

    public static void main(String[] args) {

        //Vehicle vehicle = new Vehicle();  // error 
        Vehicle car = new Vcar(); // force the user to choose a Vehicle 
        // Vcar car = new Vcar() will work but above it is // Polymorphism

       
        car.stoping();
    }
}
//****************************************

// abstract =  	abstract classes cannot be instantiated(called in same object or created), but they can have a subclass(its attirbute can be taken)
// abstract methods are declared without an implementation

abstract class Vehicle {
    // atirbutes of any Vehicle.... 
    void go() {
        

    }
     void stoping(){
        System.out.println("The driver is stopping the Vehicle");

    }
     
    abstract  void type();
}
//****************************************

class Vcar extends Vehicle {

     // must be
    
    
    @Override
    void stoping(){
        System.out.println("The driver is stopping the car");

    }
    
    // not writing this will cause an error because in parent it is abstract
    
   void type(){
       System.out.println("the type is toyota");
   }
}
//***************************************
