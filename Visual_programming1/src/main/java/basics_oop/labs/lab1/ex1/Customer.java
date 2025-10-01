/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics_oop.labs.lab1.ex1;

/**
 *
 * @author memom
 */
public class Customer extends Person {
    
    private int numidentity;
    
    public Customer(String lastname, String firstname,int numidentity) {
        super(lastname, firstname);
        this.numidentity = numidentity;
    }
    
void displaysCustomer(){
        super.displaysPerson();
        System.out.println("num identity : "+ numidentity);
    }
    
}
