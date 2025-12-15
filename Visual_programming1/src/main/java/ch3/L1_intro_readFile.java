
package ch3;

import java.io.*;
public class L1_intro_readFile {
    
    // This program demonstrates two ways to read data from a file in Java.

// The first part uses FileReader to read the file character by character and prints each character to the console.
// It handles exceptions like FileNotFoundException (if the file doesn't exist) and IOException (for general I/O errors).

// The second part uses BufferedReader to read the file line by line and prints each line to the console.
// Similar exception handling is applied for file not found and I/O errors.

    
    public static void main(String[] args) {
        System.out.println("reading character , using normal reading : ");
        try {
          FileReader f = new FileReader("E:\\work\\AI\\Python\\Python traing\\Visual programming\\Visual_programming1\\src\\main\\java\\ch3\\CS342.txt");
           // System.out.println(f.read());
           int r;
            while ((r = f.read()) != -1) {
                //System.out.println((char)r);
                System.out.print((char)r);
                
            }
                 
        } catch (FileNotFoundException e) {
            System.out.println("not there");
        }
        catch(IOException e){ System.out.println("input or read error");}
        
        
        
                System.out.println("\nreading line by line  , using buffered reader class : ");
                
                
             try {
            BufferedReader f1 = new BufferedReader(new FileReader("CS342.txt"));
            
            String st;
            
                 while ((st = f1.readLine()) != null) {
                     System.out.println(st);
                     
                 }
            
            
          } catch (FileNotFoundException e) {
            System.out.println("not there");
        }
        catch(IOException e){ System.out.println("input or read error");}
        
        

    }
    
    
        
}
