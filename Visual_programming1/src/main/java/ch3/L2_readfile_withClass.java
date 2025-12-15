
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


// This program defines a class L2_readfile_withClass that reads a file line by line using BufferedReader.

// The constructor takes a file path as input and stores it in the 'source' variable.

// The 'reading' method reads each line from the file and prints it to the console. It handles exceptions 
// like FileNotFoundException (if the file path is incorrect) and IOException (for general I/O errors).

// In the main method, an object of L2_readfile_withClass is created with the file path "CS342.txt" and 
// the reading method is called to display the file contents.
