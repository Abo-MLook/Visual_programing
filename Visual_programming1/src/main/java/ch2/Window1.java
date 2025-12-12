/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch2;

import javax.swing.*;
import java.awt.*;


public class Window1 extends JFrame{
  JButton b1,b2;
  JLabel l1,l2,l3,l4,l5,l6,l7;
  JTextField t1,t2,t3,t4,t5;
  JRadioButton r1,r2;
   JComboBox cmb1;
 
    public Window1(String title){
super(title);


JPanel p1 =new JPanel();
p1.setLayout( new GridLayout(5,2));

l1= new JLabel("First name");
t1= new JTextField(10);
 p1.add(l1);
 p1.add(t1);

l2= new JLabel("Last name");
t2= new JTextField(10);
 p1.add(l2);
 p1.add(t2);
 
l3= new JLabel("Birthday");
p1.add(l3);


 
 t3= new JTextField(3);
 l6= new JLabel("/");
 t4= new JTextField(3);
 l7= new JLabel("/");
 t5= new JTextField(5);
  JPanel p3 =new JPanel();
 p3.add(t3);
 p3.add(l6);
 p3.add(t4);
 p3.add(l7);
 p3.add(t5);
 
 p1.add(p3);
 
 
 l4= new JLabel("Gender");
p1.add(l4);
 
 r1= new JRadioButton("male");
 r2= new JRadioButton("female");
 ButtonGroup gb=new ButtonGroup();
 gb.add(r1);
 gb.add(r2);
  JPanel p4 =new JPanel();
  p4.add(r1);
  p4.add(r2);
 
  p1.add(p4);
  
   l5= new JLabel("Adress");
  p1.add(l5);
  
  String [] st={"Buraydah","riadh","khobar"};
  cmb1= new JComboBox(st);
  p1.add(cmb1);
  
  b1=new JButton("confirm");
  b2=new JButton("cancel");
   JPanel p2 =new JPanel();
  p2.add(b1);
  p2.add(b2);
 
  
 JPanel p =(JPanel)this.getContentPane();
p.add(p1);
p.add(p2,BorderLayout.SOUTH );


this.pack();
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.setVisible(true);
 
 
 
 
 
}
            
    
    
    

    public static void main(String[] args) {
        Window1 w = new Window1("raw");
    }
}