/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5.p1;

class MyThread2 implements Runnable {

    public void run() {
        System.out.println("Thread is running...");
    }
}

public class NewClass2 {

    public static void main(String[] args) {
        Thread t = new Thread(new MyThread2());
        t.start();
    }
}
