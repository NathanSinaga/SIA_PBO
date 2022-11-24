package View;

import Controller.MahasiswaController;
import Model.Mahasiswa;

import javax.swing.*;

public class FormAbsensi extends BaseForm
{
    Mahasiswa mahasiswa = null;
    JSpinner tahunBox = new JSpinner();
    JComboBox<String> semesterBox = new JComboBox<>();
    public FormAbsensi(Mahasiswa mahasiswa)
    {
        super();
        semesterBox.addItem("Ganjil");
        semesterBox.addItem("Genap");
        semesterBox.addItem("Pendek");
        this.setTitle("Absensi");
        this.addItem("Tahun", tahunBox);
        this.addItem("Semester", semesterBox);
        this.createForm();
        this.addButtonActions();
        this.mahasiswa = mahasiswa;
    }

    public boolean accept()
    {
        var rs = MahasiswaController.absensiMahasiswa((int)tahunBox.getValue(), semesterBox.getSelectedIndex(), this.mahasiswa.getNim_Mahasiswa());
        StringBuilder absensi = new StringBuilder();
        for (var entry : rs.entrySet())
        {
            String key = entry.getKey();
            int value = entry.getValue();
            absensi.append(key).append(" -> ").append(String.valueOf(value)).append('\n');
        }
        JOptionPane.showMessageDialog(null, absensi.toString());
        return true;
    }

    @Override
    public void addButtonActions()
    {
        this.okButton.addActionListener(e -> { this.accept(); });
        this.cancelButton.addActionListener(e -> this.dispose());
    }
}
