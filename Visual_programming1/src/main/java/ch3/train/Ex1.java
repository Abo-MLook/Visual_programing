/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3.train;
import ch3.p2.ex2;
import java.io.*;

public class Ex1 {
    
    String sorce ,dis;
    
    
    public Ex1(){
        this.sorce = "People.txt";
    }
    
    public void copy_with_byte(){
      this.dis = "fileByte.txt";

        try {
            FileReader fd = new FileReader(this.sorce);
            FileWriter fr = new FileWriter(this.dis);
            
            int c;
            while((c = fd.read())!= -1){
                fr.write(c);
            }
            
            fd.close();
            fr.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Not found");
        }
        catch (IOException e) {
            System.out.println("Input output error");
        }
        
        
        
        
    }
    
    
    public void copy_with_byteSt(){
      this.dis = "fileByteStream.txt";

        try {
            FileOutputStream fr = new FileOutputStream(this.dis);
            FileInputStream fd = new FileInputStream(this.sorce);
            
            int c;
            while((c = fd.read())!= -1){
                fr.write(c);
            }
            
            fd.close();
            fr.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Not found");
        }
        catch (IOException e) {
            System.out.println("Input output error");
        }
    }
       public void copy_with_bufferd(){
      this.dis = "fileBuffer.txt";

        try {
            BufferedWriter fr = new BufferedWriter(new FileWriter(this.dis));
            BufferedReader fd = new BufferedReader(new FileReader(this.sorce));
            
            
            String c;
            while((c = fd.readLine())!= null){
                fr.write(c);
                fr.newLine();
            }
            
            fd.close();
            fr.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Not found");
        }
        catch (IOException e) {
            System.out.println("Input output error");
        }
        
        
        
    }
       
       
       public void copy_with_Object(){
           this.sorce = "peaple_objects.txt";
      this.dis = "fileObject.txt";

        try {
            FileInputStream f1 = new FileInputStream(this.sorce);
            ObjectInputStream fd = new ObjectInputStream(f1);
           ObjectOutputStream fr = new ObjectOutputStream(new FileOutputStream(this.dis));

            
            
            
            String c;
            while( f1.available() > 1){
                ex2 ob = (ex2)fd.readObject();
                fr.writeObject(ob);
                System.out.println(ob);
                
            }
            
            fd.close();
            fr.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Not found");
        }
        catch (IOException e) {
            System.out.println("Input output error");
        }
        
        catch(ClassNotFoundException e){System.out.println("class not found");}
        catch(ClassCastException e){System.out.println(" cast problem");}
        
        
        
    }
       
       
       
       public static void main(String[] args) {
        Ex1 d = new Ex1();
        d.copy_with_byte();
        d.copy_with_byteSt();
        d.copy_with_bufferd();
        d.copy_with_Object();
    }
}
