
package basics_oop.thoretical_ch1.Exeption_handling;

/**
 *
 * @author memom
 */
public class DivisionOnZeroException extends Exception {
    
    public DivisionOnZeroException(){}
    public DivisionOnZeroException(String massage){
        super(massage);
    }
    
    public String toString(){
    return "You can not divid on zero";
    }
    
}
