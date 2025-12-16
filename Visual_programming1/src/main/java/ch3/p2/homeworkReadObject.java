/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3.p2;

import ch3.p2.homeworkPerson;
import java.io.*;

public class homeworkReadObject{

    public static void main(String[] args) {
        ObjectInputStream ois;
        homeworkPerson p;
      
        try {
            FileInputStream f = new FileInputStream("persons_objets.txt");
            ois = new ObjectInputStream(f);
            while(f.available()>1)
            {
               
                p= (homeworkPerson)ois.readObject();
                System.out.println("Name:"+p.getname());
                p.setBirthday(2022);
                System.out.println(p);
                
                
            
            }
            ois.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("The file person.txt is not found");
        } 
        catch (IOException e) {
            System.out.println("Exception of I/o: " + e);
        }
        catch (ClassCastException e){
            System.out.println("Exception of cast: " + e.getMessage());
        }
        catch (ClassNotFoundException e){
            System.out.println("Exception Class not found: " + e.getMessage());
        }
        
        
    }
}
