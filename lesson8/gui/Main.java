package lesson8.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        new ApplicationFrame();
    }

    public static class ExitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
    //        System.out.println(e);
            System.exit(1);
        }
    }
}
