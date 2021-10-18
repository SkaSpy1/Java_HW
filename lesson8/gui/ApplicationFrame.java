package lesson8.gui;

import javax.swing.*;
   import java.awt.*;
import java.awt.event.ActionListener;

public class ApplicationFrame extends JFrame {
    public ApplicationFrame() {
        setTitle("Application Frame v1.0");
        setBounds(1200, 1200, 400, 500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setJMenuBar(getjMenuBar());

        setLayout(new BorderLayout());

        JPanel top = createTop();
        add(top, BorderLayout.NORTH);

        JTextField in = (JTextField) top.getComponent(0);

        add(createMainPanel(in), BorderLayout.CENTER);


        setVisible(true);
    }

    private JPanel createTop() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        JTextField in = new JTextField();
        in.setEditable(false);
        top.add(in, BorderLayout.NORTH);

        return top;
    }

    private JMenuBar getjMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = menuBar.add(new JMenu("File"));
      JMenuItem clear =  menu.add(new JMenuItem("Clear"));
      clear.addActionListener(new ClearButton());
        JMenuItem exit = menu.add(new JMenuItem("Exit"));
        exit.addActionListener(new ExitButtonListener());
        JMenuItem root = menu.add(new JMenuItem("√"));
        root.addActionListener(new RootButtonListener());
        JMenuItem minus = menu.add(new JMenuItem("-"));
        minus.addActionListener(new MinusButtonListener());
        JMenuItem plus = menu.add(new JMenuItem("+"));
        plus.addActionListener(new PlusButtonListener());
        JMenuItem calc = menu.add(new JMenuItem("="));
        calc.addActionListener(new CalcButtonListener());
        JMenuItem multiplication = menu.add(new JMenuItem("·"));
        multiplication.addActionListener(new MultiplicationButtonListener());
        JMenuItem divide = menu.add(new JMenuItem("/"));
        divide.addActionListener(new DivideButtonListener());

        return menuBar;
    }

    private JPanel createMainPanel(JTextField in) {
        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());
        JPanel digitsPanel = new JPanel();
        digitsPanel.setLayout(new GridLayout(4, 3));

        ActionListener buttonListener = new ButtonListener(in);

        for (int i = 1; i <= 9; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }
        JButton btn = new JButton("0");
        btn.addActionListener(buttonListener);
        digitsPanel.add(btn);

        bottom.add(digitsPanel, BorderLayout.CENTER);


        JPanel advPanel = new JPanel();
        advPanel.setLayout(new GridLayout(7, 1));

        JButton minus = new JButton("-");
        minus.addActionListener(buttonListener);
        advPanel.add(minus);

        JButton plus = new JButton("+");
        plus.addActionListener(buttonListener);
        advPanel.add(plus);

        JButton calc = new JButton("=");
        advPanel.add(calc);

        JButton clear = new JButton("C");
        advPanel.add(clear);

       JButton root = new JButton("√");
        root.addActionListener(buttonListener);
        advPanel.add(root);

        JButton multiplication= new JButton("·");
        multiplication.addActionListener(buttonListener);
        advPanel.add(multiplication);

        JButton divide = new JButton("/");
        divide.addActionListener(buttonListener);
        advPanel.add(divide);

        bottom.add(advPanel, BorderLayout.WEST);


        return bottom;
    }

}
