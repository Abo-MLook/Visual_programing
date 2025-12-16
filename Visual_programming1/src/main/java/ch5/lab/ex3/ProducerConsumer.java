/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5.lab.ex3;

/**
 *
 * @author memom
 */
public class ProducerConsumer {

    public static void main(String[] args) {

        Hat hat = new Hat();
// Producer n ° 1 produces 2 issues
        Producer p1 = new Producer(hat, 1, 2);
// Producer n ° 2 produces 4 issues
        Producer p2 = new Producer(hat, 2, 4);
// Consumer n ° 1 consumes 3 numbers
        Consumer c1 = new Consumer(hat, 1, 3);
// Consumer n ° 2 consumes 3 numbers
        Consumer c2 = new Consumer(hat, 2, 3);
        p1.start();
        p2.start();
        c1.start();
        c2.start();

    }
}
