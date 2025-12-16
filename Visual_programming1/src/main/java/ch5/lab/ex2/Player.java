/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5.lab.ex2;

public class Player extends Thread {

    private String name;
    private String prediction;
    private int number;
    private boolean hasChosen;
    private Player opponent;

    public Player(String name, String prediction) {
// ………………… ..
    this.name = name;
    this.prediction = prediction;
    this.hasChosen = false; 
    
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
        hasChosen = true;
        synchronized(this){
        notify();
        }
        while (!this.opponent.hasChosen) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
            
        }
            
  
        int sum = (this.number + this.opponent.number) % 2;
        if (sum ==0) {
            if(this.prediction.equals("even"));
            System.out.println(this.name+"is the winner "+ this.opponent.name + "is the loser");
            if(this.opponent.prediction.equals("even"));
            System.out.println(this.opponent.name+"is the winner "+ this.name + "is the loser");
        }
        else{
            if(this.prediction.equals("odd"));
            System.out.println(this.name+"is the winner "+ this.opponent.name + "is the loser");
            if(this.opponent.prediction.equals("odd"));
            System.out.println(this.opponent.name+"is the winner "+ this.name + "is the loser");
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
