
package ch2;

import java.awt.*;
import javax.swing.*;

public class MidQgrid extends JFrame {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
    JTextField t1, t2, t3, t4, t5;
    JRadioButton r1, r2;
    JComboBox c1;
    JButton b1, b2;
    JPanel p1, p2, p32, p42, mainp;

    public MidQgrid(String title) {
        super(title);
        mainp = (JPanel) this.getContentPane();
        p1 = new JPanel(new GridLayout(5,2));
        l1 = new JLabel("First name");
        t1 = new JTextField(15);

        p1.add(l1);
        p1.add(t1);

        l2 = new JLabel("Last name");
        t2 = new JTextField(15);
        p1.add(l2);
        p1.add(t2);

        l3 = new JLabel("Birthday");
        l4 = new JLabel("/");
        l5 = new JLabel("/");
        t3 = new JTextField(4);
        t4 = new JTextField(4);
        t5 = new JTextField(6);
        p32 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p32.add(t3);
        p32.add(l4);
        p32.add(t4);
        p32.add(l5);
        p32.add(t5);
        p1.add(l3);
        p1.add(p32);
        
        
        l7 = new JLabel("Gender");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        ButtonGroup g = new ButtonGroup();
        g.add(r1);
        g.add(r2);
        p42 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p42.add(r1);
        p42.add(r2);
        
        p1.add(l7);
        p1.add(p42);
        
                            
        
        
        l8 = new JLabel("Adress");
        String[] st = {"hjk","fgd","asd"};
        c1 = new JComboBox(st);
        p1.add(l8);
        p1.add(c1);
        
        
        b1 = new JButton("Confirm");
        b2 = new JButton("Cancel");
        p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p2.add(b1);
        p2.add(b2);
        
        mainp.add(p1);
        mainp.add(p2,BorderLayout.SOUTH);
        
      
        

        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocation(500, 500);
    }

    public static void main(String[] args) {
        
        MidQgrid l = new MidQgrid("this is me");
    }
}
