package lesson8.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(1);
    }
}