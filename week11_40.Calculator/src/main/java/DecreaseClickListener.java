import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecreaseClickListener implements ActionListener
{
    private JTextField inputField;
    private JTextField outputField;

    public DecreaseClickListener(JTextField inputField, JTextField outputField)
    {
        this.inputField = inputField;
        this.outputField = outputField;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        int inputValue = 0;

        try
        {
            int outputValue = Integer.parseInt(this.outputField.getText());
            inputValue = Integer.parseInt(this.inputField.getText());
            outputValue -= inputValue;
            this.outputField.setText(Integer.toString(outputValue));
        }
        catch (NumberFormatException ex)
        {
            this.inputField.setText("");
        }

        this.inputField.setText("");
    }
}