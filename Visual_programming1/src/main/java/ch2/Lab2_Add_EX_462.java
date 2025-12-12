/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch2;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author dell
 */
public class Lab2_Add_EX_462 extends JFrame{
    private JLabel lfname, llname, lage, lgender;
    private JTextField tfname, tlname;
    private JComboBox cb1;
    private JRadioButton rb1, rb2;
    private JButton b1,b2;
    private String st[]={"under 10","10-20","grand than 20"};
    public Lab2_Add_EX_462(String title){
        super(title);
        this.setLocation(400,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = (JPanel) this.getContentPane();
        
        lfname = new JLabel("First Name:");
        tfname= new JTextField(10);
        JPanel p11= new JPanel();
        p11.add(lfname);
        p11.add(tfname);
        
        llname = new JLabel("Last Name:");
        tlname= new JTextField(10);
        JPanel p12= new JPanel();
        p12.add(llname);
        p12.add(tlname);
        
        lage = new JLabel("Age :");
        cb1 = new JComboBox(st);
        //FlowLayout ff = new FlowLayout(FlowLayout.LEFT);
        JPanel p13= new JPanel();
        p13.add(lage);
        p13.add(cb1);
        
        lgender = new JLabel("Gender");
        rb1 = new JRadioButton("Male");
        rb2 = new JRadioButton("Female");
        ButtonGroup b = new ButtonGroup();
        b.add(rb1);
        b.add(rb2);
        JPanel p14= new JPanel();
        p14.add(lgender);
        p14.add(rb1);
        p14.add(rb2);
        
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,1));
        p1.add(p11);
        p1.add(p12);
        p1.add(p13);
        p1.add(p14);
        
        b1= new JButton("Register");
        b2 = new JButton("Cancel");
        JPanel p2 = new JPanel();
        p2.add(b1);
        p2.add(b2);
        
        p.add(p1);
        p.add(p2,BorderLayout.SOUTH);
        
        this.pack();
        this.setVisible(true);
    }
    
    

    public static void main(String[] args) {
        Lab2_Add_EX_462 f = new Lab2_Add_EX_462("Register Form");
    }
}
