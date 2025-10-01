package basics_oop.labs.lab1.ex1;

public class Date {

    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date : [" + year + "/" + month + "/" + day;
    }
    
    
}
