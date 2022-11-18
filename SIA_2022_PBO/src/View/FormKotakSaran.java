package View;

import javax.swing.*;

public class FormKotakSaran extends BaseForm
{
    public JTextField mkBox = new JTextField();

    public FormKotakSaran()
    {
        super();
        this.setTitle("Kotak Saran");
        this.addItem("Saran", mkBox);
        this.createForm();
        this.addButtonActions();
    }

    public boolean accept()
    {
        System.out.println("success!");
        return true;
    }

    @Override
    public void addButtonActions()
    {
        this.okButton.addActionListener(e -> { this.accept(); });
        this.cancelButton.addActionListener(e -> this.dispose());
    }
}
