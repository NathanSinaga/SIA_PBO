package View;

import javax.swing.*;

public class FormJadwalKuliah extends BaseForm
{
    public JTextField mkBox = new JTextField();

    public FormJadwalKuliah()
    {
        super();
        this.setTitle("Jadwal Kuliah");
        this.addItem("Mata Kuliah", mkBox);
        this.addItem("Tanggal", new JTextField()); // temp
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
