/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch2.Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class L2_actuino_with_IneerClass extends JFrame {

    JButton b1, b2 ,b3;
    JTextField t1;
    JLabel l1;
    JPanel p1, p2, mainp;

    public L2_actuino_with_IneerClass(String title) {
        super(title);

        p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        mainp = (JPanel) this.getContentPane();

        l1 = new JLabel("Enter text");
        t1 = new JTextField(15);
        p1.add(l1);
        p1.add(t1);

        b1 = new JButton("Save");
        b2 = new JButton("Clear"); 
        b3 = new JButton("Close all"); 

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);


        mainp.add(p1, BorderLayout.NORTH);
        mainp.add(p2, BorderLayout.SOUTH);

        b1.addActionListener(new ActionSave());
        b2.addActionListener(new ActionCancel());
        b3.addActionListener(new ActionClose());

        this.setLocation(1000, 500);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    class ActionClose implements ActionListener{
    @Override
    
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
    
    }

    class ActionSave implements ActionListener { 

        @Override
        public void actionPerformed(ActionEvent e) {

            t1.setText("Has been saved");

        }

    }

    class ActionCancel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            t1.setText("");

        }

    }



    public static void main(String[] args) {
        L2_actuino_with_IneerClass f = new L2_actuino_with_IneerClass("with Ineer classes");
    }

}
