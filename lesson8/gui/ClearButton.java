package lesson8.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButton implements ActionListener {
    private JTextField in;
    @Override
    public void actionPerformed(ActionEvent e) {
       System.setOut(System.out);
    }
}
