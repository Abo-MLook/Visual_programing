package basics_oop.thoretical_ch1.Exeption_handling;

public class Exemple1 {

    public static void validate_y(int y) throws DivisionOnZeroException {
        if (y == 0) {
            throw new DivisionOnZeroException("cannot divide on zero--------11");
        }
    }

    ;
 public static void main(String[] args)  {
        int x = 10, y = 0, z = 0;
                    
        try{
            validate_y(y);
            z = x / y;
            System.out.println(x + " / " + y + " = " + z);
        }
        
        catch(DivisionOnZeroException doz){
            //System.out.println("You can not divid on zero");
            System.out.println(doz);
        }

       
        System.out.println("Program End");
    }
}
