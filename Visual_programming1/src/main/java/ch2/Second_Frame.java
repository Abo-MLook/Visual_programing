
package ch2;

import javax.swing.*;
import java.awt.*;

    

public class Second_Frame extends JFrame {
    JButton b1;
    JLabel l1;
    JTextField t1;
    
    
    public Second_Frame(String title){
        super(title);
        
        b1 = new JButton("send");
        l1 = new JLabel("My name");
        t1 = new JTextField(15);
        
        JPanel main_p = (JPanel)this.getContentPane();
        
        JPanel j1 = new JPanel();
        JPanel j2 = new JPanel();
        
        j1.add(l1);
        j1.add(t1);
        j2.add(b1);
        
        main_p.add(j1,BorderLayout.NORTH);
        main_p.add(j2,BorderLayout.CENTER);
        
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        Second_Frame p = new Second_Frame("trining");
    }
    
}
