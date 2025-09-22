
package basics_oop.collage;



import java.io.PrintStream;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String var1, int var2, String var3) {
        this.name = var1;
        this.day = var2;
        this.month = var3;
    }

    public boolean inSameMonth(Holiday var1) {
        return this.month.equals(var1.month);
    }

    public static double avgDate(Holiday[] var0) {
        int var1 = 0;

        for(Holiday var5 : var0) {
            var1 += var5.day;
        }

        return (double)var1 / (double)var0.length;
    }

    public static void main(String[] var0) {
        Holiday var1 = new Holiday("Independence Day", 4, "July");
        Holiday[] var2 = 
        new Holiday[]{var1, new Holiday("Christmas", 25, "December"),
        new Holiday("New Year", 1, "January"), new Holiday("Another July Holiday", 14, "July")};
        System.out.println("Average date: " + avgDate(var2));
        PrintStream var10000 = System.out;
        boolean var10001 = var1.inSameMonth(var2[3]);
        var10000.println("Same month? " + var10001);
    }
}
