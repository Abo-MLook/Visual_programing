/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics_oop;

import java.util.Scanner;
/**
 *
 * @author memom
 */

class pizza{
   private String bread;
   private String sauce ;
   private  String cheese;
   private  String topping;

     pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

     pizza() {
                Scanner scanner = new Scanner(System.in);
               System.out.println("Enter ingredients : ");
               System.out.print("bread : ");
               bread = scanner.nextLine();
               System.out.print("sauce : ");
               sauce = scanner.nextLine();
               System.out.print("cheese : ");
               cheese = scanner.nextLine();
               System.out.print("topping : ");
               topping = scanner.nextLine();
    }
    
    void getall(){
        System.out.println("Ingredients are : ");
        System.out.println("bread : "+ bread);
                System.out.println("souce : "+ sauce);
        System.out.println("cheese : "+ cheese);

                System.out.println("topping : "+ topping);

                
    
    
    }

    
    
}
public class Constructers_L2 {
    
    public static void main(String[] args) {
        pizza dish = new pizza("por", "ransh", "smoth", "poprony");
        dish.getall();
                pizza dish1 = new pizza();
                dish1.getall();

    }
    
}
