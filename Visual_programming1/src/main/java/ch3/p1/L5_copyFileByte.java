/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3.p1;


import java.io. *;


public class L5_copyFileByte {
 private String source, destination;
 
 public L5_copyFileByte(String src, String dest) {
 this.source = src; 
 this.destination = dest;
 }
 
 public void copy () {
 try {
 FileInputStream fis = new FileInputStream(source);
 FileOutputStream fos = new FileOutputStream(destination);
 
 int Mybyte =fis.read();
 while(Mybyte!= -1) {
     
 fos.write(Mybyte); // write byte
 Mybyte =fis.read(); // go to next byte
 }
 fis.close(); 
 fos.close();
 } 
 
  catch (FileNotFoundException ex) {
        System.out.println("Path not found !!!!!!!!! ");
    } 
 catch (IOException e) {
 e.printStackTrace();
 } 

 }

public static void main (String [] args) {
 L5_copyFileByte cf = new L5_copyFileByte("source.txt","copy.txt");
 cf.copy ();
 } 
}