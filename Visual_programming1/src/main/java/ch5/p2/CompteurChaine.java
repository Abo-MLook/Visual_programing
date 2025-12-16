/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5.p2;


public class CompteurChaine extends CompteurThread {

    private Thread other;   
    public CompteurChaine(String name, int max, Thread other) {
        super(name, max);
        this.other = other;
    }

    @Override
    public void run() {
        System.out.println("ready : " + getNom()); // ready

        
        other.start();

       
        try {
            other.join();
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }

        super.run();
    }
}

