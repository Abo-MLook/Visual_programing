/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch2;

import javax.swing.*;
import java.awt.*;

public class Train_Th extends JFrame{
    JLabel l1 , l2;

    public Train_Th(String title, String a, String b)  {
        super(title);
        this.setLocation(500,500);
        
        float a1 = Float.parseFloat(a);
        float b1 = Float.parseFloat(b);
        
        float z = (a1 + b1) / 2 ;
        
        String s = Float.toString(z);
        
        l1 = new JLabel("avarage = ");
        l2 = new JLabel(s);
        
        l2.setForeground(Color.red);
        
        String s1 ="The averge of 20 and 30" ;
        l2.setToolTipText(s1);
        
        JPanel main_p = (JPanel)this.getContentPane();
        main_p.setBackground(Color.LIGHT_GRAY);
        main_p.add(l1);
        main_p.add(l2,BorderLayout.EAST);
       
        
        
        
        
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
            
    
    
    public static void main(String[] args) {
        Train_Th t = new Train_Th("hellow",Integer.toString(30) ,Integer.toString(20));
    }
    
}
