
package ch3;

import java.io.*;
public class L1_intro_readFile {
    
    
    
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
            BufferedReader f1 = new BufferedReader(new FileReader("E:\\work\\AI\\Python\\Python traing\\Visual programming\\Visual_programming1\\src\\main\\java\\ch3\\CS342.txt"));
            
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
