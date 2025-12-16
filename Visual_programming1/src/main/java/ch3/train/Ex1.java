package ch3.train;

import ch3.p2.ex2;
import java.io.*;

public class Ex1 {

    String sorce, dis;

    public Ex1() {
        this.sorce = "People.txt";
    }

    public void copy_with_byte() {
        this.dis = "fileByte.txt";

        try {
            FileReader fd = new FileReader(this.sorce);
            FileWriter fr = new FileWriter(this.dis);

            int c;
            while ((c = fd.read()) != -1) {
                fr.write(c);
            }

            fd.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("Not found");
        } catch (IOException e) {
            System.out.println("Input output error");
        }

    }

    public void copy_with_byteSt() {
        this.dis = "fileByteStream.txt";

        try {
            FileOutputStream fr = new FileOutputStream(this.dis);
            FileInputStream fd = new FileInputStream(this.sorce);

            int c;
            while ((c = fd.read()) != -1) {
                fr.write(c);
            }

            fd.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("Not found");
        } catch (IOException e) {
            System.out.println("Input output error");
        }
    }

    public void copy_with_bufferd() {
        this.dis = "fileBuffer.txt";

        try {
            BufferedWriter fr = new BufferedWriter(new FileWriter(this.dis));
            BufferedReader fd = new BufferedReader(new FileReader(this.sorce));

            String c;
            while ((c = fd.readLine()) != null) {
                fr.write(c);
                fr.newLine();
            }

            fd.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("Not found");
        } catch (IOException e) {
            System.out.println("Input output error");
        }

    }

    public void copy_with_Object() {
        this.sorce = "peaple_objects.txt";
        this.dis = "fileObject.txt";

        try {
            FileInputStream f1 = new FileInputStream(this.sorce);
            ObjectInputStream fd = new ObjectInputStream(f1);
            ObjectOutputStream fr = new ObjectOutputStream(new FileOutputStream(this.dis));

            String c;
            while (f1.available() > 1) {
                ex2 ob = (ex2) fd.readObject();
                fr.writeObject(ob);
                System.out.println(ob);

            }

            fd.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("Not found");
        } catch (IOException e) {
            System.out.println("Input output error");
        } catch (ClassNotFoundException e) {
            System.out.println("class not found");
        } catch (ClassCastException e) {
            System.out.println(" cast problem");
        }

    }

    public static void main(String[] args) {
        Ex1 d = new Ex1();
        d.copy_with_byte();
        d.copy_with_byteSt();
        d.copy_with_bufferd();
        d.copy_with_Object();
    }
}


/*
 * This program demonstrates four different methods for copying data from one file to another:
 * 1. **copy_with_byte**: This method copies data using `FileReader` and `FileWriter`, working with individual bytes.
 * 2. **copy_with_byteSt**: This method copies data using `FileInputStream` and `FileOutputStream`, which also work with bytes but use stream-based input/output.
 * 3. **copy_with_buffered**: This method uses `BufferedReader` and `BufferedWriter` to read and write data, providing buffered input/output for better performance, especially with large files.
 * 4. **copy_with_Object**: This method reads serialized objects from a file ("peaple_objects.txt") and writes them into another file ("fileObject.txt") using `ObjectInputStream` and `ObjectOutputStream`
       . It handles object deserialization and serialization, including error handling for class-related issues.
 * 
 * Error handling for file not found, input/output errors, class not found during deserialization, and class cast exceptions is included.
 */
