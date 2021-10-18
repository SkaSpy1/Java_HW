package lesson8.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private JTextField in;

    public ButtonListener(JTextField in) {
        this.in = in;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();

        in.setText(in.getText() + btn.getText());
    }
}
