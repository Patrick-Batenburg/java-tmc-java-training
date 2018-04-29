import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetClickListener implements ActionListener
{
    private JTextField inputField;
    private JTextField outputField;

    public ResetClickListener(JTextField inputField, JTextField outputField)
    {
        this.outputField = outputField;
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        this.outputField.setText("0");
        this.inputField.setText("");
    }
}