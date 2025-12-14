package ch2.Events;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
                        
                   



public class L3_MouseAction extends JFrame {
    
JLabel j1 , j2;   
JPanel p1, mainp;
int counter = 0;

    
    
    public L3_MouseAction(String title){
    super(title);
    j1 = new JLabel("This is a counter click any where : ");
    j2 = new JLabel("0");
    
    mainp = (JPanel)this.getContentPane();
    mainp.setLayout(new FlowLayout(FlowLayout.LEFT));
    mainp.add(j1);
    mainp.add(j2);
    
    
    
    
        this.addMouseListener(new mouseClickCounter());
 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
    this.setLocation(1000,500);
    
    
    }
    
    class mouseClickCounter implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            String s = "";
            s += ++counter;
            j2.setText(s);
            
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseExited(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    
    
        
    }
    
    
    
    public static void main(String[] args) {
        L3_MouseAction f = new L3_MouseAction("with Ineer classes");
    }
    
    
}
