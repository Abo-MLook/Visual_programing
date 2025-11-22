
package basics_oop.thoretical_ch1.Exeption_handling;

//lab1_ex7

public class Temps {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor to initialize the time
    public Temps(int h, int m, int s) throws TempsException {
        if(h > 24 || m > 59 || s > 59){
            throw new TempsException();
        }
        
        hours = h;
        minutes = m;
        seconds = s;
    }

    // Method to display the time in HH:MM:SS format
    public void displayTime() {
        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }

    public static void main(String[] args) {
        
        try {
            Temps t = new Temps(24, 12, 59); // Example of incorrect time
        t.displayTime(); // Should display a normalized time
        } catch (TempsException te) {
            System.out.println(te);
        }
       
    }
}
