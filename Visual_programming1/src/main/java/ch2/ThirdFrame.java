
package ch2;

import javax.swing.*;
import java.awt.*;


public class ThirdFrame extends JFrame {
    JButton b;
    JLabel l;
    JTextField t;
    
    
    public ThirdFrame(String Title){
        super(Title);
        
        b = new JButton("SEND");
        l = new JLabel("MY NAME");
        t = new JTextField(20);
        
        JPanel main_p = (JPanel)this.getContentPane();
        
        JPanel j1 = new JPanel();
        JPanel j2 = new JPanel();
        
        j1.add(l);
        j1.add(t);
        j2.add(b);
        
        main_p.add(j1,BorderLayout.EAST);
        main_p.add(j2,BorderLayout.NORTH);
        
        
        
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
    
    
    public static void main(String[] args) {
        ThirdFrame f1 = new ThirdFrame("THIRD");
    }
}
