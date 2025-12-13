package ch2;

import java.awt.*;
import javax.swing.*;

public class MidQflow extends JFrame {

    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3, t4, t5;
    JRadioButton r1, r2;
    JComboBox c1;
    JButton b1, b2;
    JPanel p1, p2, p3, p4, p5, p6, mainp;

    public MidQflow(String title) {
        super(title);
        mainp = (JPanel) this.getContentPane();

        l1 = new JLabel("First name");
        t1 = new JTextField(15);
        p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));

        l2 = new JLabel("Last name");
        t2 = new JTextField(15);
        p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        l2 = new JLabel("Birthday");
        t2 = new JTextField(15);
        p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {

    }
}
