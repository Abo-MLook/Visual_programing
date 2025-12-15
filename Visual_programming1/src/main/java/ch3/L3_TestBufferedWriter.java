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
//  BufferedWriter file = new BufferedWriter(new FileWriter(dest, true)); writing true mean do not remove existing content , and add on it , it is by defualt false mean reomve and write

 file.write("Hello CS221");
 file.newLine();
 file.write("The number is");
 file.write(":" + number);
  file.newLine();
 file.close();
 } catch (IOException e) { // only IOException because it is create if not 
 e.printStackTrace();
 } 
 } 
 public static void main (String [] args) {
 L3_TestBufferedWriter bw = new L3_TestBufferedWriter("CS(writing).txt");
 bw.processing( );
 } 
}


// This program defines a class L3_TestBufferedWriter that writes data to a file using BufferedWriter.

// The constructor takes a file path as input and stores it in the 'dest' variable.

// The 'processing' method writes a string and a number to the file. It uses BufferedWriter, which is more efficient 
// for writing large amounts of data compared to FileWriter. The file is overwritten by default, but you can append 
// content by passing 'true' as the second argument in the FileWriter constructor.

// In the main method, an object of L3_TestBufferedWriter is created with the file path "CS(writing).txt", 
// and the processing method is called to write content to the file.
