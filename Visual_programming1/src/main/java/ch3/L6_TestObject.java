/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3;

import java.io. *;
 
 public class L6_TestObject {
 
     private L6_SerializableObject point;
     private String name; // file name
 
     public L6_TestObject(L6_SerializableObject pt, String nf) { 
         this.point = pt;
         this.name = nf;
     }
 

 

public void Save(){
 try {
    ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(name));
    oos.writeObject(point);
    oos.close();
 } 
 catch (IOException e) {
    System.out.println ("I/O error");
 } 
}

public void charge() {
 try {
    ObjectInputStream ow= new ObjectInputStream(new FileInputStream(name));
    point = (L6_SerializableObject) (ow.readObject());
    System.out.println("Abscissa= " + point.getAbscissa());
    ow.close();
 } 
 catch (IOException e) {
    System.out.println ("I/O error");
    } 
 catch (ClassNotFoundException e) {
    System.out.println ("error out of I / O");
    } 
} 

     public static void main (String [] args) {
          L6_SerializableObject p = new L6_SerializableObject(80,30);
         L6_TestObject tos = new L6_TestObject(p, "obj.txt");
         tos.Save();
         tos.charge();
    }
}