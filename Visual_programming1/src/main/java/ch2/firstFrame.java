
package ch2;

import javax.swing.*;
import java.awt.*;



        


public class firstFrame extends JFrame {
JButton button1;
JLabel label1;
JTextField txt1;
    public firstFrame(String title){
        super(title);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
           button1 = new JButton("Send");
           label1 = new JLabel("MY Name");
           txt1 = new JTextField(15); //SIZE THE TEXT FIELD

          JPanel main_P = (JPanel)this.getContentPane();
          main_P.setLayout(new FlowLayout(FlowLayout.LEFT));
          
          main_P.add(label1);
          main_P.add(txt1);
         
            main_P.add(button1);
                 this.pack();
                 this.setVisible(true);


    }
    
    public static void main(String[] args) {
        firstFrame  f = new firstFrame("my first"); 
    }
    
}
