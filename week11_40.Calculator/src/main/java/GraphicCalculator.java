import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable
{
    private JFrame frame;

    @Override
    public void run()
    {
        this.frame = new JFrame("Calculator");
        this.frame.setPreferredSize(new Dimension(300, 150));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void createComponents(Container container)
    {
        container.setLayout(new GridLayout(3, 1));
        
        JTextField outputField = new JTextField("0");
        JTextField inputField = new JTextField("0");
        JButton increaseButton = new JButton("+");
        JButton decreaseButton = new JButton("-");
        JButton resetButton = new JButton("Z");
        JPanel panel = new JPanel(new GridLayout(1, 3));
        IncreaseClickListener increaseListener = new IncreaseClickListener(inputField, outputField);
        DecreaseClickListener decreaseListener = new DecreaseClickListener(inputField, outputField);
        ResetClickListener resetListener = new ResetClickListener(inputField, outputField);
        OutputFieldListener outputFieldListener = new OutputFieldListener(resetButton, outputField);

        outputField.setEnabled(false);
        outputField.getDocument().addDocumentListener(outputFieldListener);
        increaseButton.addActionListener(increaseListener);
        decreaseButton.addActionListener(decreaseListener);
        resetButton.addActionListener(resetListener);
        resetButton.setEnabled(false);
        panel.add(increaseButton);
        panel.add(decreaseButton);
        panel.add(resetButton);
        container.add(outputField);
        container.add(inputField);
        container.add(panel);
    }

    public JFrame getFrame()
    {
        return frame;
    }
}