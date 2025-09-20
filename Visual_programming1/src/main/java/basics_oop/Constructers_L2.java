
package basics_oop;

import java.util.Scanner;



class pizza {

    private String bread;
    private String sauce;
    private String cheese;
    private String topping;
        // constructer with paramter
    pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
       // constructer with no paramter
    pizza() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("dish is being created ...");
        System.out.println();
        System.out.println("Enter ingredients please ");
        System.out.print("bread : ");
        bread = scanner.nextLine();
        System.out.print("sauce : ");
        sauce = scanner.nextLine();
        System.out.print("cheese : ");
        cheese = scanner.nextLine();
        System.out.print("topping : ");
        topping = scanner.nextLine();
    }

    void getall() {
        System.out.println("\nIngredients are : ");
        System.out.println("bread : " + bread);
        System.out.println("sauce : " + sauce);
        System.out.println("cheese : " + cheese);

        System.out.println("topping : " + topping);

    }
    // toString is inbulit function that return the addres of object  pizaa = pizaa.toStrint() = address 
    // over writing it like this will be like pizaa = pizaa.toStrint() = allAtrib
    // public is a must
     public String toString(){
            String allAtrib = "\nIngredients are : \n" + 
                 "bread : " + bread + "\n" 
                 + "sauce : " + sauce + "\n"
                 + "cheese : " + cheese + "\n"
                 + "topping : " + topping + "\n"
                 ;
            
         return allAtrib;
    }

}



// main -------------------------------
public class Constructers_L2 {

    public static void main(String[] args) {
        pizza dish = new pizza("por", "ransh", "smoth", "poprony");
        dish.getall();
        pizza dish1 = new pizza();
        dish1.getall();
        System.out.println(dish.toString());
        System.out.println("print the name of object :");
        System.out.println(dish);
        

    }

}
