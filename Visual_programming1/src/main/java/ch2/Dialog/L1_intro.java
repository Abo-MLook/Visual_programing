
package ch2.Dialog;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class L1_intro {

    public static void main(String[] args) {
        // come to exam like this a dialog and you implement it is design 

        // Massage Dialog
        JOptionPane.showMessageDialog(null, "Hello"); // by defualt information mark  and  Massege title
        JOptionPane.showMessageDialog(null, "this is error from you", "Screen error x", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Warining you idiot", "Screen Warning !!", JOptionPane.WARNING_MESSAGE);

        // Input Dialog
        JOptionPane.showInputDialog(null, "enter you ID"); // by defualt question mark  and  input title
        JOptionPane.showInputDialog(null, "enter you ID", "ID check", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showInputDialog(null, "enter you ID", "ID check", JOptionPane.INFORMATION_MESSAGE);
        
        String [] colors = {"Red","Blue","Green"};
        JOptionPane.showInputDialog(null,"Select a collor","box color selection",JOptionPane.INFORMATION_MESSAGE,
                null,colors,colors[0]);  // last three  null , array , element by default ## 
        
        // Input Dialog
        JOptionPane.showConfirmDialog(null, "You sure you want to complate"); // by defualt question mark  and  select an option title
        JOptionPane.showConfirmDialog(null, "You sure you want to complate", " check", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showConfirmDialog(null, "You sure you want to complate", " check", JOptionPane.INFORMATION_MESSAGE);

    }

}
