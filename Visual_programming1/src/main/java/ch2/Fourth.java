package ch2;

import javax.swing.*;
import java.awt.*;

public class Fourth extends JFrame {

    JTextField t1, t2, t3;
    JButton b1, b2;
    JLabel l1, l2, l3, l4, l5, l6;
    JComboBox c;
    JRadioButton r1, r2;
    JPanel j1, j2, j3, j4, j5, j6, j7;
    JCheckBox a1, a2;

    public Fourth(String title) {
        super(title);

        l1 = new JLabel("Fname");
        t1 = new JTextField(15);
        j1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        j1.add(l1);
        j1.add(t1);

        l2 = new JLabel("LName");
        t2 = new JTextField(25);
        j2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        j2.add(l2);
        j2.add(t2);

        String[] st = {"10-20", "30-40", "50-60"};
        l3 = new JLabel("Age");
        c = new JComboBox(st);
        j3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        j3.add(l3);
        j3.add(c);

        l4 = new JLabel("Gender");
        r1 = new JRadioButton("Female");
        r2 = new JRadioButton("Male");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        j4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        j4.add(l4);
        j4.add(r1);
        j4.add(r2);

        l5 = new JLabel("Email");
        t3 = new JTextField(25);
        j5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        j5.add(l5);
        j5.add(t3);

        b1 = new JButton("create");
        b2 = new JButton("Cancel");
        j6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        j6.add(b1);
        j6.add(b2);

        l6 = new JLabel("Education : ");
        a1 = new JCheckBox("University Degree");
        a2 = new JCheckBox("External Degree");
        
        j7 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        j7.add(l6);
        j7.add(a1);
        j7.add(a2);

        JPanel main_p = (JPanel) this.getContentPane();
        main_p.setLayout(new GridLayout(7, 1));

        main_p.add(j1);
        main_p.add(j2);
        main_p.add(j3);
        main_p.add(j4);
        main_p.add(j5);
        main_p.add(j7);
        main_p.add(j6);

        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        Fourth f1 = new Fourth("Hal");

    }
}
