
package ch5.p2;

public class CompteurThread implements Runnable {

    private String name;
    private int max;

    public CompteurThread(String name, int max) {
        this.name = name;
        this.max = max;
    }

   
    protected String getNom() {
        return name;
    }

    @Override
    public void run() {
        for (int i = 0; i < max; i++) {
            System.out.println(name + " : " + i);
        }
    }
}
