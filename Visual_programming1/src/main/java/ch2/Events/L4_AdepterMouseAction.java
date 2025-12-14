

package ch2.Events;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
                        
                   



public class L4_AdepterMouseAction extends JFrame {
    
JLabel j1 , j2;   
JPanel p1, mainp;
int counter = 0;

    
    
    public L4_AdepterMouseAction(String title){
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
    
    class mouseClickCounter extends MouseAdapter{

        public void mouseClicked(MouseEvent e) {
            String s = "";
            s += ++counter;
            j2.setText(s);
            
            
        }

    
    
        
    }
    
    
    
    public static void main(String[] args) {
        L4_AdepterMouseAction f = new L4_AdepterMouseAction("with Ineer classes");
    }
    
    
}
