/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5.lab.ex2;

public class Player extends Thread {

    private String name, prediction;
    private int number;
    private boolean hasChosen;
    private Player opponent;

    public Player(String name, String prediction) {
        this.name = name;
        this.prediction = prediction;
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public void run() {
        try {
            sleep((int) (Math.random() * 10));
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        number = (int) (Math.random() * 6);
        this.hasChosen = true;
        if (!this.opponent.hasChosen) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        int rest = (this.number + this.opponent.number) % 2;
        if (rest == 0) {
            if (this.prediction.equals("even")) {
                System.out.println(this.name + "is the winner and " + this.opponent.name + " is looser");
            }

        } else {
            if (this.prediction.equals("odd")) {
                System.out.println(this.name + "is the winner and " + this.opponent.name + " is looser");
            }

        }
        synchronized (this.opponent) {
            this.opponent.notify();
        }
    }

    public static void main(String args[]) {
        Player j1 = new Player("Ali", "even");
        Player j2 = new Player("Mohamed", "odd");
        j1.setOpponent(j2);
        j2.setOpponent(j1);
        j1.start();
        j2.start();
    }
}
