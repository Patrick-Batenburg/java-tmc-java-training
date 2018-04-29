package clicker.ui;

import clicker.applicationlogic.Calculator;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable
{
    private Calculator calculator;
    private JFrame frame;

    public UserInterface(Calculator calculator)
    {
        this.calculator = calculator;
    }

    @Override
    public void run()
    {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container)
    {
        JLabel label = new JLabel();
        label.setText("" + calculator.giveValue());
 
        JButton button = new JButton();
        button.setText("Click!");
        button.addActionListener(new ClickListener(calculator, label));
        container.add(label);
        container.add(button, BorderLayout.SOUTH);
    }

    public JFrame getFrame()
    {
        return frame;
    }
}