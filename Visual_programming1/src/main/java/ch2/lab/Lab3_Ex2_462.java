/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch2.lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author dell
 */
public class Lab3_Ex2_462 extends JFrame {
    private JTextField t1, t2;
    private JComboBox cb1, cb2;
    private JLabel l1, lr;
    private JButton bconvert, bcancel;
    private String st[]= {"RiyalSA","DollarAM","EuroEU"};
    private double [][] cv= {{1,0.27,0.25},{3.75,1,0.87},{4,1.16,1}};
    public Lab3_Ex2_462(String title)
    {
        super(title);
        this.setLocation(200,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = (JPanel)this.getContentPane();
        
        JPanel p1 = new JPanel();
        t1= new JTextField(10);
        cb1 = new JComboBox(st);
        l1 = new JLabel("rate = ");
        lr= new JLabel("1");
        lr.setForeground(Color.red);
        t2= new JTextField(10);
        cb2= new JComboBox(st);
        
        p1.add(t1);
        p1.add(cb1);
        p1.add(l1);
        p1.add(lr);
        p1.add(t2);
        p1.add(cb2);
        
        JPanel p2 = new JPanel();
        this.bconvert= new JButton("Convert");
        this.bcancel= new JButton("Cancel");
        p2.add(bconvert);
        p2.add(bcancel);
        
        this.bcancel.addActionListener(new Cancel_Listener());
        this.bconvert.addActionListener(new ConvertListener());
        
        p.add(p1);
        p.add(p2,BorderLayout.SOUTH);
        
        this.pack();
        this.setVisible(true);
    }
    
    private class Cancel_Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            t1.setText("");
            t2.setText("");
            cb1.setSelectedIndex(0);
            cb2.setSelectedIndex(0);
            lr.setText("1");
          }
    }
    
    private class ConvertListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           try{ if( t1.getText() == null)
                throw new EmptyFieldExecption("Please Enter a value to Convert");
           if(cb1.getSelectedIndex() == cb2.getSelectedIndex())
               throw new Exception("Wrong input, Select different Currencies");
            double d = Double.parseDouble(t1.getText());
            if (d<0) throw new Exception("Wrong input!!! please enter a positive double");
            
            double res =0;
            double r= cv[cb1.getSelectedIndex()][cb2.getSelectedIndex()];
            
            res = d* r;
            
            t2.setText(""+res);
            lr.setText(""+r);
            
            
            
           }
           catch(EmptyFieldExecption e1)
           {
               JOptionPane.showMessageDialog(null, e1.getMessage(), "Wrong Input",JOptionPane.ERROR_MESSAGE);
           }
           catch(NumberFormatException e3)
           {
               
                JOptionPane.showMessageDialog(null, "Please Enter a double value ", "Wrong Input",JOptionPane.ERROR_MESSAGE);
           
           }
           catch (Exception e2)
           {
               JOptionPane.showMessageDialog(null, e2.getMessage(), "Warning", HEIGHT);
           }
           }
    
    }
    

    public static void main(String[] args) {
        Lab3_Ex2_462 fen = new Lab3_Ex2_462("Convert");
    }
}
