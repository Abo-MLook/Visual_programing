

package ch2.lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex1 extends JFrame  {
    
   JTextField t1,t2;
   JLabel l1 , l2;
   JPanel p1,p2,main;
   JButton b1 , b2;
   
   
   public ex1(String title){
       super(title);
   
      main = (JPanel)this.getContentPane();
      p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

     t1 = new JTextField(10);
     t2 = new JTextField(10);
     
     l1 = new JLabel("US dollar   =   ");
          l2 = new JLabel("SAR");
          
          b1 = new JButton("Convert");
          b2 = new JButton("Clear");
          
         t2.setEditable(false);
          
          b1.addActionListener(new Convert());
          b2.addActionListener(new Clear());
          p1.add(t1);
          p1.add(l1);
          p1.add(t2);
          p1.add(l2);
          
          p2.add(b1);
          p2.add(b2);
          t2.setCaretColor(Color.red);
          main.add(p1,BorderLayout.NORTH);
          main.add(p2,BorderLayout.SOUTH);

       
       
       
   
       
   this.setLocation(1000,100);
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.pack();
   this.setVisible(true);
   }
 class Convert implements ActionListener{
     
     public void actionPerformed(ActionEvent e){
         
        String text = t1.getText();
        
         if (text.equals("")) {
             JOptionPane.showMessageDialog(null, "Please Enter a number , you did not enter anything","Empty input ",JOptionPane.ERROR_MESSAGE);
         }
        
         else{
         try{
         
           double sar = Double.parseDouble(text) * 3.75;
           t2.setText(""+sar);
         
         
         } catch(NumberFormatException ex){
             JOptionPane.showMessageDialog(null, "please enter a number nut char","",JOptionPane.ERROR_MESSAGE);
         }
         
         
         }
     }
     
 }
 
  class Clear implements ActionListener{
     
     public void actionPerformed(ActionEvent e){
         
         int check = JOptionPane.showConfirmDialog(null, "are you sure you want to clear","Confirm",JOptionPane.YES_NO_OPTION);
         
         if (check ==0) {
             t1.setText("");
             t2.setText("");
         }
         
         
     }
     
 }
 
  
    public static void main(String[] args) {
        ex1 d = new ex1("convertedr");
    }
 
    
}
