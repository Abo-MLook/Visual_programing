/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch2;

import javax.swing.*;
import java.awt.*;

public class TrainEX2 extends JFrame {

    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3, t4, t5;
    JButton b1, b2;
    JRadioButton r1, r2;
    JComboBox c;

    JPanel j1, j2, j3, j4, j5, j6;

    public TrainEX2(String title) {
        super(title);

        l1 = new JLabel("First name");
        t1 = new JTextField(20);
        j1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        j1.add(l1);
        j1.add(t1);

        l2 = new JLabel("Last name");
        t2 = new JTextField(20);
        j2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        j2.add(l2);
        j2.add(t2);

        l3 = new JLabel("Birthday");
        t3 = new JTextField(3);
        l4 = new JLabel("/");
        t4 = new JTextField(3);
        l5 = new JLabel("/");
        t5 = new JTextField(6);
        j3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        j3.add(l3);
        j3.add(t3);
        j3.add(l4);
        j3.add(t4);
        j3.add(l5);
        j3.add(t5);

        l6 = new JLabel("Gender");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        j4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        j4.add(l6);
        j4.add(r1);
        j4.add(r2);
        
        l7 = new JLabel("Adress");
        String[] cities = {"Buridah", "Alress", "Unizah"};
        c = new JComboBox(cities);
        j5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        j5.add(l7);
        j5.add(c);

        b1 = new JButton("Confirm");
        b2 = new JButton("Cancel");
        j6 = new JPanel();
        j6.add(b1);
        j6.add(b2);

        JPanel main_pan = (JPanel) this.getContentPane();
        main_pan.setLayout(new GridLayout(6, 1));

        main_pan.add(j1);
        main_pan.add(j2);
        main_pan.add(j3);
        main_pan.add(j4);
        main_pan.add(j5);
        main_pan.add(j6);
        
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
            TrainEX2 t1 = new TrainEX2("new");
    }

}
