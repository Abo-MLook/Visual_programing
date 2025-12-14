


package ch2.Dialog;
import javax.swing.*;

public class L2_excersice {
    
    
    public static void main(String[] args) {
        
        int checker = 0;
        
        while (checker ==0) {
            try {
             String n1 = JOptionPane.showInputDialog(null,"enter number1 = ","n1",JOptionPane.INFORMATION_MESSAGE);
            String n2 = JOptionPane.showInputDialog(null,"enter number2 = ","n2",JOptionPane.INFORMATION_MESSAGE);
            int sum =  Integer.parseInt(n1) + Integer.parseInt(n2);
            
            JOptionPane.showMessageDialog(null, n1 + " + "+n2+" = "+sum);
            
            // if press   yes give 0 , if no give 1 
            checker = JOptionPane.showConfirmDialog(null, "you want to continue ? ","conform",JOptionPane.YES_NO_OPTION);
             
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You entered wrong data type","Eror window",JOptionPane.ERROR_MESSAGE);
                            checker = JOptionPane.showConfirmDialog(null, "you want to continue ? ","conform",JOptionPane.YES_NO_OPTION);

            }
      
                        

            
            
        }
        
        
    }
}
