/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5.lab.ex3;

/**
 *
 * @author memom
 */
public class Hat {
    private int content;
    private boolean full= false;
    
    public synchronized void add(int n)
    {
        while(full)
        {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.getLogger(Hat.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        content = n;
        full =true;
        notifyAll();
    }
    
    public synchronized int delete()
    {
        while(!full)
        {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.getLogger(Hat.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        full = false;
        notifyAll();
        return content;
    }
    
}
