/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics_oop.labs.lab1.ex1;

/**
 *
 * @author memom
 */
public class Owner extends Person {
    private  String nameclub;
    private  String adrclub;

    public Owner(String lastname, String firstname,String nameclub,String adrclub) {
        super(lastname, firstname);
        this.nameclub = nameclub;
        this.adrclub = adrclub;
    }
    
    void displaysOwner(){
        super.displaysPerson();
        System.out.println("Name of club : "+ nameclub  + "\nAddress of clup : " + adrclub);
    }
    
}
