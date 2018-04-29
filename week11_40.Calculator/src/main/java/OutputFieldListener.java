import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class OutputFieldListener implements DocumentListener
{
    private JButton resetButton;
    private JTextField outputField;

    public OutputFieldListener(JButton resetButton, JTextField outputField)
    {
        this.resetButton = resetButton;
        this.outputField = outputField;
    }

    @Override
    public void insertUpdate(DocumentEvent e)
    {
        changedUpdate(e);
    }

    @Override
    public void removeUpdate(DocumentEvent e)
    {
        changedUpdate(e);
    }

    @Override
    public void changedUpdate(DocumentEvent e)
    {
        if (this.outputField.getText().equals("0"))
        {
            this.resetButton.setEnabled(false);
        }
        else
        {
            this.resetButton.setEnabled(true);
        }
    }
}