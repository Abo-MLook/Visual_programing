package ch3.p1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Homewoork extends JFrame implements ActionListener {

    private JMenuItem menI1, menI2, menI3, menI4;
    private JMenuBar meB;
    private JTextArea textAr;
    private JFileChooser fileC;
    private JMenu men;

    public Homewoork(String title) {
        super(title);

        JPanel pan = (JPanel) this.getContentPane();
        pan.setLayout(new BorderLayout());

        meB = new JMenuBar();
        men = new JMenu("File>");

        menI1 = new JMenuItem("New");
        menI2 = new JMenuItem("Open");
        menI3 = new JMenuItem("Save");
        menI4 = new JMenuItem("Exit");

        men.add(menI1);
        men.add(menI2);
        men.add(menI3);
        men.add(menI4);

        meB.add(men);
        this.setJMenuBar(meB);

        menI1.addActionListener(this);
        menI2.addActionListener(this);
        menI3.addActionListener(this);
        menI4.addActionListener(this);

        textAr = new JTextArea(30, 50);
        JScrollPane scrPan = new JScrollPane(textAr);
        pan.add(scrPan, BorderLayout.CENTER);

        this.setLocation(350, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        fileC = new JFileChooser();
        String ac = ev.getActionCommand();

        if (ac.equals("New")) {
            textAr.setText("");
        } else if (ac.equals("Open")) {
            int choice = fileC.showOpenDialog(null); // return open to 0 
            if (choice == JFileChooser.APPROVE_OPTION) {  // aprove =0 ,  0 ==0
                
                File sel = fileC.getSelectedFile();
                try {
                    BufferedReader read1 = new BufferedReader(new FileReader(sel));
                    String lin;
                    while ((lin = read1.readLine()) != null) {
                        textAr.append(lin + "\n");
                    }
                    read1.close();
                } catch (IOException ioError) {
                    JOptionPane.showMessageDialog(this, ioError.getMessage());
                }
            }
        } else if (ac.equals("Save")) {

            JFileChooser saveCh = new JFileChooser("f");
            int xret = saveCh.showSaveDialog(null);

            if (xret == JFileChooser.APPROVE_OPTION) {
                File fsave = new File(saveCh.getSelectedFile().getAbsolutePath());
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fsave, false))) {
                    writer.write(textAr.getText());
                    writer.flush();
                } catch (IOException ex) {

                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            } else {

                JOptionPane.showMessageDialog(this, "Operation cancelled!");

            }
        } else if (ac.equals("Exit")) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Homewoork("Simple Text Editor by Mrwan"));
    }
}
