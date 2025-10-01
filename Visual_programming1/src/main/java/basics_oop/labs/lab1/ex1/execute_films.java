/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics_oop.labs.lab1.ex1;

/**
 *
 * @author memom
 */
public class execute_films {
    
    public static void main(String[] args) {
         Organize o = new Organize(5);
     o.addfilm(new Film("Mad Max","Action","1",new Date(12,10,2020)));
     o.addfilm(new Film("Jhon Wick","Action","2",10,12,2014));
     o.addfilm(new Film("Gladiator","Historic","3",new Date(31,3,2000)));
     
     o.display_list();
     
     o.searchMovie("Fast and Furious");
     o.searchMovie("Gladiator");
    }
    
}
