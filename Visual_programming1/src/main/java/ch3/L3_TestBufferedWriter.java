/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3;

/**
 *
 * @author memom
 */

import java.io. *;
public class L3_TestBufferedWriter {
 
    private String dest;
 
 public L3_TestBufferedWriter(String d) {
 this.dest = d;
 }
 
 public void processing( ) {
 try {
 int number = 12345; 
 
 BufferedWriter file = new BufferedWriter(new FileWriter(dest));
 
 file.write("Hello CS221");
 file.newLine();
 file.write("The number is");
 file.write(":" + number);
  file.newLine();
 file.close();
 } catch (IOException e) {
 e.printStackTrace();
 } 
 } 
 public static void main (String [] args) {
 L3_TestBufferedWriter bw = new L3_TestBufferedWriter("CS(writing).txt");
 bw.processing( );
 } 
}