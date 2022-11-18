package View;

import javax.swing.*;

public class FormMasukPengumuman extends BaseForm
{
    public JTextField titleBox = new JTextField();
    public JTextField descriptionBox = new JTextField();

    public FormMasukPengumuman()
    {
        super();
        this.setTitle("Masukkan Pengumuman");
        this.addItem("Judul", titleBox);
        this.addItem("Deskripsi", descriptionBox);
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
