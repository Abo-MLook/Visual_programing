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
            System.out.println("Exception of cast: " + e.getMessage());
        }
        
    }
}
