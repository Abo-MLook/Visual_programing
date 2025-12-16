/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5.p1;

public class SimpleCounter {

    private String name;
    private int max;

    public SimpleCounter(String name, int max) {
        this.name = name;
        this.max = max;
    }

    public void startUp() {
        for (int i = 0; i < max; i++) {
            System.out.println(name + ":" + i);
        }
    }

    public static void main(String[] args) {
        new SimpleCounter("Counter 1", 3).startUp();
        new SimpleCounter("Counter 2", 3).startUp();

    }
}
