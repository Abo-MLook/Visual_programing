/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5.p1;

public class ThreadCounterSleep implements Runnable {

    private String name;
    private int max;
    private long waiting;

    public ThreadCounterSleep(String name, int max, long waiting) {
        this.name = name;
        this.max = max;
        this.waiting = waiting;
    }

    public void run() {
        try {
            for (int i = 0; i < max; i++) {
                System.out.println(name + ":" + i);
                Thread.sleep(waiting);  // هنا نوقف الخيط قليلاً
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        new Thread(new ThreadCounterSleep("Counter 1", 3, 60)).start();
        new Thread(new ThreadCounterSleep("Counter 2", 6, 10)).start();

    }
}
