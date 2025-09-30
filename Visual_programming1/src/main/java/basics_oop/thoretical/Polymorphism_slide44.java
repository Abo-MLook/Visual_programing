/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics_oop.thoretical;

// slide 33 - 34

// Base class Employee
class Employee {
    // Method defined in Employee
    public void work() {
        System.out.println("Employee working...");
    }

    // Another method specific to Employee
    public void takeBreak() {
        System.out.println("Employee taking a break...");
    }
}

// Derived class Lawyer extends Employee
class Lawyer extends Employee {
    // Method specific to Lawyer
    public void sue() {
        System.out.println("Lawyer suing...");
    }

    // Overriding the work method to show polymorphism
    @Override
    public void work() {
        System.out.println("Lawyer working on a case...");
    }
}


//Employee ed = new Lawyer(); so here for all are the same 
//way I can call any method that is exist in Employee and exist in both,
//but if only method exist on Lawyer , I can not call it 
public class Polymorphism_slide44 {
    public static void main(String[] args) {
        // Polymorphism: Employee reference, but a Lawyer object
        Employee ed = new Lawyer();

        // Calling method from Employee class (works fine)
        ed.work(); // Output: Lawyer working on a case...
        ed.takeBreak(); // Output: Employee taking a break...

        // The following would give a compiler error, because `sue()` is not in the Employee class:
        // ed.sue(); // Compiler error: cannot find symbol

        // To call the `sue()` method (which is specific to Lawyer), we need to cast `ed` to `Lawyer`
        ((Lawyer) ed).sue(); // Output: Lawyer suing...
        
        // Attempt to cast to an incorrect type (casting to a non-existent class)
        // This will throw a runtime error if the cast is not correct
        // Object someObject = new Employee();
        // ((Lawyer) someObject).sue(); // Runtime error: ClassCastException
    }
}
