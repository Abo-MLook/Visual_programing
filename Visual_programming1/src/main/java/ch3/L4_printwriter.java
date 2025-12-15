/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3;

import java.io. *;
public class L4_printwriter {
 private String dest;
 
 public L4_printwriter(String d) {
 this.dest = d;
 }
 public void processing( ) {
 try {
 float a = (float) 2.5;
 float b = (float) 3.4; 
 int c = 1;

 PrintWriter file = new PrintWriter(new FileWriter(dest)); 
 file.println(a + "*" + b + "+" + c + "=" + (a * b + c)); 
 file.printf("%f *%f +%d =%f \n", a, b, c, a * b + c);
 file.printf("%3.2f *%3.2f +%x =%3.2f \n", a, b, c, a * b + c);
 file.close();
 } 

 catch (IOException e) {
 e.printStackTrace();
 } 
 } 
 public static void main (String [] args) {
 L4_printwriter bw = new L4_printwriter("println.txt");
 bw.processing( );
 } 
}

// This program defines a class L4_printwriter that demonstrates how to write formatted data to a file using PrintWriter.

// The constructor takes a file path as input and stores it in the 'dest' variable.

// The 'processing' method writes calculations and formatted data to the file using PrintWriter. 
// It uses the 'println' method to write simple output and the 'printf' method for formatted output. 
// The 'printf' method is used to format numbers with a specified number of decimal places and hexadecimal formatting for integers.

// In the main method, an object of L4_printwriter is created with the file path "println.txt", 
// and the processing method is called to write content to the file.
