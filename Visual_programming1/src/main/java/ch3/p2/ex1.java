package ch3.p2;

import java.io.*;
import java.util.*;

public class ex1 {

    public static void main(String[] args) {
        String last_name, first_name, out, action = "y";
        int year_of_Birth;

        Scanner enter = new Scanner(System.in);
        try {
            BufferedWriter f = new BufferedWriter(new FileWriter("People.txt"));

            while (action.equals("y")) {
                System.out.println("Last Name : ");
                if (enter.hasNext()) {
                    last_name = enter.next();

                } else {
                    System.out.println("You should enter String character , please enter again");
                    continue;
                }
                System.out.println("First Name : ");
                if (enter.hasNext()) {
                    first_name = enter.next();

                } else {
                    System.out.println("You should enter String character , please enter again");
                    continue;
                }
                System.out.println("Year of birth: ");
                if (enter.hasNextInt()) {
                    year_of_Birth = enter.nextInt();

                } else {
                    System.out.println("You should enter Numbers as integer, please enter again");
                    continue;
                }
                
                out = last_name + ";"+first_name + ";" + year_of_Birth;
                
                f.write(out);
                f.newLine();
                
                System.out.println("\n Do you want to continue ?  (y/n)");
                action = enter.next();

            }
                f.close();
        } catch (IOException e) {

        }
        
        

    }
}


// This program collects personal information (last name, first name, and year of birth) from the user and writes it to a file named "People.txt".
// The user is prompted for the last name, first name, and year of birth, with input validation to ensure the correct data type is entered.
// If the user enters incorrect data (e.g., non-string input for names or non-integer input for the year of birth), they are asked to re-enter the information.
// After entering the data, it is written to the "People.txt" file in the format "last_name;first_name;year_of_birth".
// The program continues prompting the user for additional entries until they choose to stop by entering "n" when asked if they want to continue.
