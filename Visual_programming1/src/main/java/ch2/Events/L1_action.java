package ch2.Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class L1_action extends JFrame implements ActionListener {

    JButton b1, b2;
    JTextField t1;
    JLabel l1;
    JPanel p1, p2, mainp;
    
    public L1_action(String title) {
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
        p2.add(b1);
        p2.add(b2);
        
        mainp.add(p1, BorderLayout.NORTH);
        mainp.add(p2, BorderLayout.CENTER);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        this.setLocation(1000, 500);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    @Override 
    public void actionPerformed(ActionEvent e)   
    {
        JButton eb = (JButton)e.getSource();
        
        if(eb ==b1){
        t1.setText("has been saved");
        }
        else
            t1.setText("");
    
    }
    public static void main(String[] args) {
        L1_action f = new L1_action("my first");        
    }
    
}
