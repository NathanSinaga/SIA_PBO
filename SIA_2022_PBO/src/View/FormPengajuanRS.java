package View;

import javax.swing.*;

public class FormPengajuanRS extends BaseForm
{
    public JTextField mkBox = new JTextField();

    public FormPengajuanRS()
    {
        super();
        this.setTitle("Pengajuan Rencana Studi Form");
        this.addItem("Mata Kuliah", mkBox);
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
