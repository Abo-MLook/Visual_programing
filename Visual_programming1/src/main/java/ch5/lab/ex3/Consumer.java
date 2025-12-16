/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5.lab.ex3;

public class Consumer extends Thread {
    private Hat h;
    private int num, numb;

    public Consumer(Hat h, int num, int numb) {
        this.h = h;
        this.num = num;
        this.numb = numb;
    }
    public void run()
    { int n;
    for(int i=0;i<this.numb;i++){
        n= h.delete();
        System.out.println("Consumer "+this.num+ " delete the value "+n);
           try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException ex) {
                System.getLogger(Producer.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }     
    }
    }
}
