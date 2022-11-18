package View;

import javax.swing.*;

public class FormMasukNilai extends BaseForm
{
    public JTextField mkBox = new JTextField();
    public JSpinner nimBox = new JSpinner();
    public JSpinner nilaiBox = new JSpinner();

    public FormMasukNilai()
    {
        super();
        this.setTitle("Masuk Nilai");
        this.addItem("Kode MK", mkBox);
        this.addItem("NIM", nimBox);
        this.addItem("Nilai", nilaiBox);
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
