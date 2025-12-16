
package ch5.lab.ex1;


public class Task implements Runnable {
    
    int x , y;
    Point p;
    
    public Task(Point p,int valx,int valy){
    this.x = valx;
    this.y = valy;
    this.p  = p;
        
    }
    
    @Override
    public  void run(){
        synchronized (p) {
             this.p.scale(this.x, this.y);
        System.out.println(this.p);
        }
       
    }
    public static void main(String[] args) {
        Point p = new Point(3, 2);
                Thread t2 = new Thread (new Task(p, 3, 4));

        Thread t1 = new Thread(new Task(p, 2, 1));
        t1.start();
        t2.start();
    }
}
