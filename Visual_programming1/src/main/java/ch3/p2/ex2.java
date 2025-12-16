/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3.p2;
import java.io.*;

public class ex2 implements Serializable {
    String last_n , first_n;
    int birth;
    
    public ex2(String last, String first,int b){
    this.last_n = last;
    this.first_n = first;
    this.birth = b;
    
    }
    
    public String toString(){
        
        return "Last name = "+this.last_n +"\tFirst name = "+this.first_n+"\t year of birth = "+this.birth;
    }
    
    public static void main(String[] args) {
        
        // wirte -------------------------------------------------------------------------------------------
        try {
            BufferedReader read1 = new BufferedReader ( new FileReader("People.txt"));
            ObjectOutputStream enter = new ObjectOutputStream(new FileOutputStream("peaple_objects.txt"));
            
            String action;
            String[] move;
            
            while ((action = read1.readLine()) != null) {
                move = action.split(";");
                ex2 object = new ex2(move[0],move[1],Integer.parseInt(move[2]));
                 
                enter.writeObject(object);
                
                
            }
            
            read1.close();
            enter.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        catch (IOException e){ System.out.println("Input output error");}
        
        
         // read -------------------------------------------------------------------------------------------
        try {
            FileInputStream file = new FileInputStream("peaple_objects.txt");
            ObjectInputStream f = new ObjectInputStream (file) ;
            
            while (file.available()>1) {
                ex2 objectr = (ex2)f.readObject();
                System.out.println(objectr);
                
            }
            file.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not foulnc");
        }
        
        catch(IOException e){ System.out.println("in out error");}
        catch(ClassNotFoundException e){ System.out.println("Class not found");}
        catch (ClassCastException e){
            System.out.println("Exception of cast ");
        }
        
    }
}


/*
 * This program reads data from a file named "People.txt", creates objects of the class 'ex2' (which implements Serializable),
 * and writes those objects to a new file "peaple_objects.txt" using ObjectOutputStream.
 * 
 * The class 'ex2' stores personal information (last name, first name, and year of birth) and provides a custom toString method
 * to display this information in a formatted way.
 * 
 * The program performs two main tasks:
 * 1. **Writing to file**: It reads each line from the "People.txt" file, splits the line into components, and creates an 'ex2' object. 
 *    These objects are then serialized and saved into "peaple_objects.txt".
 * 2. **Reading from file**: It then reads back the serialized objects from "peaple_objects.txt", deserializes them, and prints their contents.
 * 
 * Error handling is implemented for file not found, input/output errors, class not found during deserialization, and class cast exceptions.
 */
