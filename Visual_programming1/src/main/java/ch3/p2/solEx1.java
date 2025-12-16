/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3.p2;

import java.util.*;
import java.io.*;
import javax.swing.*;


public class solEx1 {

    public static void main(String[] args)  {
        String name, firstname;
        int birthday;
        try{
        PrintWriter outputfile = new PrintWriter(new FileWriter("persons.txt", false));   
        String rep = "y";
        String ligne ;
        Scanner toscan = new Scanner(System.in);
        do {
            System.out.print("name :");
            name = toscan.next();
            System.out.print("first name :");
            firstname = toscan.next();
            System.out.print("birthday :");
            birthday = toscan.nextInt();
            ligne = name + ";" + firstname + ";" + birthday;
            outputfile.println(ligne);      
            System.out.println("Do you want to add another person (y/n)? ");
            rep = toscan.next();
        } while (rep.equals("y"));
        
        toscan.close();
        outputfile.close();
     
        }
        catch (Exception e){
        System.out.println("Error");
          JOptionPane.showMessageDialog ( null , "Error" );
        }
      
    }
}