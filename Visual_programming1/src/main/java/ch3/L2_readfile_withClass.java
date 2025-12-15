/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3;
import java.io.*;

public class L2_readfile_withClass {

private String source ;

 public L2_readfile_withClass(String src) {
 this.source = src;
 }

 public void reading( ) {
 try {
 String line;
 BufferedReader file = new BufferedReader(new FileReader(source)); /*****************/

 while ((line = file.readLine())!= null) /*****************/
 { 
 //reading and test (practice!)
   
  System.out.println(line);
 }
 file.close();
 } 
 
 /*catch (IOException e) {
 e.printStackTrace();
 }*/
     catch (FileNotFoundException ex) {
        System.out.println("Path not found wrong path !!!!!!!!! ");
    } catch (IOException ex) {
        System.out.println("Path not found IO error");
    }
 }
 public static void main (String [] args) {
 L2_readfile_withClass br = new L2_readfile_withClass("CS342.txt"); 
 br.reading();
 }
    
}