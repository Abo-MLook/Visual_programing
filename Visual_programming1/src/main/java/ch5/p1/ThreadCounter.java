/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5.p1;

public class ThreadCounter implements Runnable {

    private String name;
    private int max;

    public ThreadCounter(String name, int max) {
        this.name = name;
        this.max = max;
    }

    public void run() {
        for (int i = 0; i < max; i++) {
            System.out.println(name + ":" + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("This is thread code : \n");
        new Thread(new ThreadCounter("Counter 1", 3)).start();
        new Thread(new ThreadCounter("Counter 2", 3)).start();
    }
}
