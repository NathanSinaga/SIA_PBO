package View;

import javax.swing.*;

public class FormBayarRS extends BaseForm
{
    public JSpinner jumlahUangBox = new JSpinner();

    public FormBayarRS()
    {
        super();
        this.setTitle("Bayar Rencana Studi Form");
        this.addItem("Jumlah Uang", jumlahUangBox);
        this.createForm();
        this.addButtonActions();
    }

    public boolean accept()
    {
        System.out.println("click");
        return true;
    }

    @Override
    public void addButtonActions()
    {
        this.okButton.addActionListener(e -> { this.accept(); });
        this.cancelButton.addActionListener(e -> this.dispose());
    }
}
