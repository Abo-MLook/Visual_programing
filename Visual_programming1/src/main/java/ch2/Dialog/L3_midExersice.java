
package ch2.Dialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class L3_midExersice extends JFrame {
    
    JLabel l1,l2,l3;
    JTextField t1 , t2;
    JButton b1,b2;
    JPanel p1 , p2 ,mainp;
    
    
    public L3_midExersice(String title){
        
        l1 = new JLabel("Dollar");
        l2 = new JLabel("=   Ryal");
        
        t1 = new JTextField(6);
        t2 = new JTextField(6);
        t2.setEditable(false);
        b1 = new JButton("Convert");
        b2 = new JButton("Clear");
        
        p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        mainp = (JPanel)this.getContentPane();
        
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        
        p2.add(b1);
        p2.add(b2);
        
        b1.addActionListener(new Converter());
        b2.addActionListener(new Clear());
        
        mainp.add(p1,BorderLayout.NORTH);
        mainp.add(p2,BorderLayout.CENTER);
        
        
        
        
        
        
        this.setLocation(1000,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    
    class Converter implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ev){
        
           String st = t1.getText();
            
            if (st.equals("")) {
                
            JOptionPane.showMessageDialog(null, "Please Enter a number first","Eror",JOptionPane.ERROR_MESSAGE);
                
            }
            
            else{
                  try {
         
            
        
                String sr = "";
                double ryal = Double.parseDouble(st) * 3.75;
                  sr +=ryal;
                t2.setText(sr);
                
            
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Please do not enter chars","Eror",JOptionPane.ERROR_MESSAGE);
        }
            }
        
      
        
        
        
    }
    
    }
    
    class Clear implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear ? ");
        
        if (n ==0) {
           t1.setText("");
           t2.setText("");
            
        }
        
    }
    
    }
    
    
    public static void main(String[] args) {
        L3_midExersice a = new L3_midExersice("Converter");
    }
}
