
package basics_oop.thoretical_ch1.Exeption_handling;

//lab1_ex6

public class CalculMoyenne {
    private static int moyenne(String[] list) throws ExceptionEmpty {
        int sum = 0, integer, nbNotes = 0;
        for (int i = 0; i < list.length; i++) {
            try {
                integer = Integer.parseInt(list[i]);
                if (integer < 0)
                    throw new ExceptionRange("few");
                else if (integer > 20)
                    throw new ExceptionRange("large");
                else {
                    sum += integer;
                    nbNotes++;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Note no." + (i + 1) + " is not complete");
            } catch (ExceptionRange ei) {
                System.out.println("Note no." + (i + 1) + " is too " + ei.getMessage());
            }
        }
        if (nbNotes == 0)
            throw new ExceptionEmpty();
        return sum / nbNotes;
    }

    public static void main(String[] args) {
        //String[] tab = { "14", "12", "13", "16", "18", "15" }; // 1 ; answer : no exception everything is good
        //String[] tab = { "x", "2", "-1", "30", "18" }; // 2      ; answer :  Number format exception ,and range low ,and larg exception
        String[] tab = { "x", "-3", "2.3" }; // 3               ; answer   :  Number format exception, and range low ,Number format exception
        try {
            System.out.println("The average is: " + moyenne(tab));
        } catch (ExceptionEmpty er) {
            System.out.println(er);
        }
    }
}

