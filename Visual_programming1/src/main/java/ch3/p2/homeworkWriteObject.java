/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3.p2;





import ch3.p2.homeworkPerson;
import java.io.*;


public class homeworkWriteObject {

    public static void main(String[] args) {
        BufferedReader br;
        ObjectOutputStream oos;
        String ligne, champs[];
        String name, firstname;
        int birthday;
        homeworkPerson p;
        try {
           br = new BufferedReader(new FileReader("persons.txt"));
           oos = new ObjectOutputStream(new FileOutputStream("persons_objets.txt"));
            
           
           while ((ligne = br.readLine()) != null) {
                champs = ligne.split(";");
                name = champs[0];
              //  System.out.println("name: "+name);
                firstname = champs[1];
             //   System.out.println("first name"+firstname);
                birthday = Integer.parseInt(champs[2]);
                p = new homeworkPerson(name, firstname, birthday);
                oos.writeObject(p);       
            }
            br.close();
            oos.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("The file person.txt is not found");
        } 
        catch (IOException e) {
            System.out.println("Exception of E/S: " + e.getMessage());
        } 
        catch (NumberFormatException e) {
            System.out.println("Exception of conversion: " + e.getMessage());
        }
    }
    


}
