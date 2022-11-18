package View;

import javax.swing.*;

public class FormRosterMataKuliah extends BaseForm
{
    public FormRosterMataKuliah()
    {
        super();
        this.setTitle("Roster Mata Kuliah");
        this.addItem("Tanggal", new JTextField()); // temp
        this.addItem("Mata Kuliah 1", "PBO");
        this.addItem("Mata Kuliah 2", "Algo");
        this.addItem("Mata Kuliah 3", "Web Design");
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
