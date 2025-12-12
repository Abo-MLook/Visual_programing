/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch2;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author dell
 */
public class Lab2Ex2 extends JFrame{
    private JLabel llname, lfname, lbirth, ladress, lgender, llang, lcateg, lsport;
    private JTextField tlname, tfname, tbirth;
    private JTextArea tadress;
    private JRadioButton bf, bm;
    private JCheckBox ca, cf, ce , ci;
    private JComboBox combCat;
    private String categories[] = {"Young", "Rtired", "Professional"};
    private JList listSport;
    String sports[] = {"Tennis", "VolleyBall", "BasketBall", "HandBall", "FootBall"};
    private JButton b1,b2,b3,b4;
    public Lab2Ex2(String title)
    {
        super(title);
        this.setLocation(200,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = (JPanel)this.getContentPane();
        
        llname= new JLabel("Last name:");
        tlname = new JTextField(20);
        JPanel plname = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        plname.add(llname);
        plname.add(tlname);
        
        lfname= new JLabel("First name:");
        tfname = new JTextField(20);
        JPanel pfname = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        pfname.add(lfname);
        pfname.add(tfname);
        
        lbirth= new JLabel("Birthday:");
        tbirth = new JTextField(20);
        JPanel pbirth = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        pbirth.add(lbirth);
        pbirth.add(tbirth);
        
        ladress= new JLabel("Adress:");
        tadress = new JTextArea(2,20);
        JPanel padress = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        padress.add(ladress);
        padress.add(tadress);
        
        lgender= new JLabel("Gender:");
        bm= new JRadioButton("Male");
        bf= new JRadioButton("Female");
        JPanel pgender = new JPanel();
        pgender.add(lgender);
        pgender.add(bm);
        pgender.add(bf);
        
        ButtonGroup gb = new ButtonGroup();
        gb.add(bm);
        gb.add(bf);
        
        JPanel pweast = new JPanel(new GridLayout(5,1));
        pweast.add(plname);
        pweast.add(pfname);
        pweast.add(pbirth);
        pweast.add(padress);
        pweast.add(pgender);
        
        ca = new JCheckBox("Arabic");
        cf = new JCheckBox("Frensh");
        ce = new JCheckBox("English");
        ci = new JCheckBox("Italian");
        
        JPanel pcb = new JPanel(new GridLayout(4,1));
        pcb.add(ca);
        pcb.add(cf);
        pcb.add(ce);
        pcb.add(ci);
        
        llang = new JLabel("Languages");
        JPanel plang = new JPanel(new FlowLayout(FlowLayout.LEFT));
        plang.add(llang);
        plang.add(pcb);
        
        lcateg = new JLabel("Categories: ");
        combCat = new JComboBox(categories);
        JPanel pcategory = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pcategory.add(lcateg);
        pcategory.add(combCat);
        
        lsport = new JLabel("Sport: ");
        listSport = new JList(sports);
        JPanel psport = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        psport.add(lsport);
        psport.add(listSport);
        
        JPanel peast = new JPanel(new GridLayout(3,1));
        peast.add(plang);
        peast.add(pcategory);
        peast.add(psport);
        
        b1 = new JButton("<<Precedent");
        b2 = new JButton("Next>>");
        b3 = new JButton("Confirm");
        b4 = new JButton("Cancel");
        JPanel psouth = new JPanel();
        psouth.add(b1);
        psouth.add(b2);
        psouth.add(b3);
        psouth.add(b4);
        
        p.add(pweast,BorderLayout.WEST);
        p.add(peast,BorderLayout.EAST);
        p.add(psouth,BorderLayout.SOUTH);
        
        this.pack();
        this.setVisible(true);
        
        
        
    }

    public static void main(String[] args) {
        Lab2Ex2 f = new Lab2Ex2("Sports club members");
    }
}

