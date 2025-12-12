

package ch2;

import java.awt.HeadlessException;
import javax.swing.*;
/**
 *
 * @author dell
 */
public class Lab2_Ex1_462 extends JFrame{
private JLabel l;
    public Lab2_Ex1_462(){
        this.setTitle("My Window");
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = (JPanel)this.getContentPane();
        l= new JLabel("Good Morning");
        p.add(l);
        this.setVisible(true);
        
    }
    

    public static void main(String[] args) {
       Lab2_Ex1_462 f = new Lab2_Ex1_462();
    }
}
