package ch5.p1;

class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running...");
    }
}

public class NewClass1 {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();   // start thread → calls run()
    }
}
