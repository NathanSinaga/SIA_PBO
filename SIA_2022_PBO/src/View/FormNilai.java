package View;

import Controller.MahasiswaController;
import Model.Mahasiswa;

import javax.swing.*;

public class FormNilai extends BaseForm
{
    Mahasiswa mahasiswa = null;
    JSpinner tahunBox = new JSpinner();
    JComboBox<String> semesterBox = new JComboBox<>();
    JTextField mkBox = new JTextField();
    public FormNilai(Mahasiswa mahasiswa)
    {
        super();
        semesterBox.addItem("Ganjil");
        semesterBox.addItem("Genap");
        semesterBox.addItem("Pendek");
        this.setTitle("Nilai");
        this.addItem("Tahun", tahunBox);
        this.addItem("Semester", semesterBox);
        this.addItem("Mata Kuliah", mkBox);
        this.createForm();
        this.addButtonActions();
        this.mahasiswa = mahasiswa;
    }

    public boolean accept()
    {
        int[] result = MahasiswaController.nilaiMahasiswa((int)this.tahunBox.getValue(), this.semesterBox.getSelectedIndex(), this.mahasiswa.getNim_Mahasiswa(), this.mkBox.getText());
        if (result.length == 7)
        {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < 5; i++)
            {
                s.append("nilai ").append(i + 1).append(" -> ").append(result[i]).append("\n");
            }
            s.append("nilai uts -> ").append(result[5]).append("\n");
            s.append("nilai uas -> ").append(result[6]);
            JOptionPane.showMessageDialog(null, s.toString());
        }
        return true;
    }

    @Override
    public void addButtonActions()
    {
        this.okButton.addActionListener(e -> { this.accept(); });
        this.cancelButton.addActionListener(e -> this.dispose());
    }
}
