
package ch2;

import javax.swing.*;
import java.awt.*;

public class TrainonEX2 extends JFrame {

    JLabel l1, l2, l3, l4, l5, l6;
    JTextField t1, t2, t3, t4, t5;
    JRadioButton r1, r2;
    JComboBox c1;
    JButton b1, b2;

    public TrainonEX2(String title) {
        super(title);
        this.setLocation(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel main_p = (JPanel) this.getContentPane();

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5, 2));

        JPanel p2 = new JPanel();

        l1 = new JLabel("First name");
        t1 = new JTextField(10);
        p1.add(l1);
        p1.add(t1);

        l2 = new JLabel("Last name");
        t2 = new JTextField(10);
        p1.add(l2);
        p1.add(t2);

        l3 = new JLabel("Birthday");
        p1.add(l3);
        JPanel p32 = new JPanel();
        t3 = new JTextField(2); // day
        l3 = new JLabel("/");
        t4 = new JTextField(2); // month
        l4 = new JLabel("/");
        t5 = new JTextField(4); // year
        p32.add(t3);
        p32.add(l3);
        p32.add(t4);
        p32.add(l4);
        p32.add(t5);

        p1.add(p32);

        l5 = new JLabel("Gender");
        p1.add(l5);
        JPanel p42 = new JPanel();
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        p42.add(r1);
        p42.add(r2);

        p1.add(p42);

        l6 = new JLabel("Addres");
        String[] Adress = {"Buraidah", "Alress", "Unizah"};
        c1 = new JComboBox(Adress);
        p1.add(l6);
        p1.add(c1); // last one 5 2

        b1 = new JButton("Confirm");
        b2 = new JButton("Cancel");

        p2.add(b1);
        p2.add(b2);

        main_p.add(p1);
        main_p.add(p2, BorderLayout.SOUTH);

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        
        TrainonEX2 f1 = new TrainonEX2("MawMaw");

    }
}
