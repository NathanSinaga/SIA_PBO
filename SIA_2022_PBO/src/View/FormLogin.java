package View;

import Model.Daak;
import Model.Dosen;
import Model.Mahasiswa;
import Model.Pengguna;

import javax.swing.*;

import static Controller.Controller.getUser;

public class FormLogin extends BaseForm
{
    public JPasswordField passwordBox = new JPasswordField();
    public JTextField userNameBox = new JTextField();

    public FormLogin()
    {
        super();
        this.setTitle("Login Form");
        this.addItem("Email", userNameBox);
        this.addItem("Password", passwordBox);
        this.createForm();
        this.addButtonActions();
    }

    public boolean login()
    {
        if (this.userNameBox.getText().isEmpty() || this.passwordBox.getPassword().length == 0)
        {
            JOptionPane.showMessageDialog(null, "Isi Semua Field!", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Pengguna pengguna = getUser(this.userNameBox.getText(), new String(this.passwordBox.getPassword()));
            if (pengguna.getEmail() == null)
            {
                JOptionPane.showMessageDialog(null, "Pengguna tidak ditemukan", "Error", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                //point to user menu
                if (pengguna.getTipe_Pengguna().equals(Model.Tipe_Pengguna.MAHASISWA.toString()))
                {
                    Mahasiswa mahasiswa = Controller.MahasiswaController.getMahasiswa(pengguna.getEmail());
                    JOptionPane.showMessageDialog(null, "Welcome " + mahasiswa.getNama_Mahasiswa(), "Login Berhasil", JOptionPane.INFORMATION_MESSAGE);
                    new MenuMahasiswa(mahasiswa);
                    this.dispose();
                }
                else if (pengguna.getTipe_Pengguna().equals(Model.Tipe_Pengguna.DOSEN.toString()))
                {
                    Dosen dosen = Controller.DosenController.getDosen(pengguna.getEmail());
                    JOptionPane.showMessageDialog(null, "Welcome " + dosen.getNama_Dosen(), "Login Berhasil", JOptionPane.INFORMATION_MESSAGE);
                    new MenuDosen(dosen);
                    this.dispose();
                }
                else if (pengguna.getTipe_Pengguna().equals(Model.Tipe_Pengguna.DAAK.toString()))
                {
                    Daak daak = Controller.DaakController.getDaak(pengguna.getEmail());
                    JOptionPane.showMessageDialog(null, "Welcome " + daak.getNama_Daak(), "Login Berhasil", JOptionPane.INFORMATION_MESSAGE);
                    new MenuDAAK(daak);
                    this.dispose();
                }
            }
        }
        return true;
    }

    @Override
    public void addButtonActions()
    {
        this.okButton.addActionListener(e -> { this.login(); });
        this.cancelButton.addActionListener(e -> this.dispose());
    }
}
