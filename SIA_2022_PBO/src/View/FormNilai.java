package View;

import javax.swing.*;

public class FormNilai extends BaseForm
{
    JSpinner tahunBox = new JSpinner();
    JComboBox<String> semesterBox = new JComboBox<>();
    public FormNilai()
    {
        super();
        semesterBox.addItem("Ganjil");
        semesterBox.addItem("Genap");
        semesterBox.addItem("Pendek");
        this.setTitle("Nilai");
        this.addItem("Tahun", tahunBox);
        this.addItem("Semester", semesterBox);
        this.createForm();
        this.addButtonActions();
    }

    public boolean accept()
    {
        JOptionPane.showMessageDialog(null, "Nilai = x");
        return true;
    }

    @Override
    public void addButtonActions()
    {
        this.okButton.addActionListener(e -> { this.accept(); });
        this.cancelButton.addActionListener(e -> this.dispose());
    }
}
