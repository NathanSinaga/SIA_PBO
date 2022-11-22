/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static Controller.Controller.*;
import Model.Daak;
import Model.Dosen;
import Model.Mahasiswa;
import Model.Pengguna;
/**
 *
 * @author TUF GAMING
 */
public class Form_LoginUser {

    JFrame frame;
    JLabel header, labelEmail, LabelPassword, statusLogin, lform;
    JTextField inputEmail;
    JPasswordField inputPassword;
    JButton loginButton;

    public Form_LoginUser() {

        frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        header = new JLabel("Sistem Informasi Akademik ITHB");
        header.setBounds(180, 20, 600, 50);
        header.setFont(new Font("Dialog", 1, 30));
        frame.add(header);

        lform = new JLabel("--login Form--");
        lform.setBounds(320, 110, 200, 40);
        lform.setFont(new Font("Arial", 1, 28));
        frame.add(lform);
        
        labelEmail = new JLabel("Email               :");
        labelEmail.setBounds(240, 200, 120, 40);
        labelEmail.setFont(new Font("Arial", 1, 15));
        frame.add(labelEmail);

        inputEmail = new JTextField();
        inputEmail.setBounds(380, 200, 140, 35);
        frame.add(inputEmail);

        LabelPassword = new JLabel("Password      :");
        LabelPassword.setBounds(240, 240, 120, 40);
        LabelPassword.setFont(new Font("Arial", 1, 15));
        frame.add(LabelPassword);

        inputPassword = new JPasswordField();
        inputPassword.setBounds(380, 240, 140, 35);
        frame.add(inputPassword);

        loginButton = new JButton("Login");
        loginButton.setBounds(380, 280, 140, 35);
        frame.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (inputEmail.getText().isEmpty() || inputPassword.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Isi Semua Field!", "Error", JOptionPane.WARNING_MESSAGE);
                } else {
                    //manggil fungsi controller
                    Pengguna pengguna = getUser(inputEmail.getText(), inputPassword.getText());
                    //cek null atau tidak
                    if (pengguna.getEmail() == null) {
                         JOptionPane.showMessageDialog(null, "Pengguna tidak ditemukan", "Error", JOptionPane.WARNING_MESSAGE);
                    }else{
                        //point to user menu
                        if (pengguna.getTipe_Pengguna().equals(Model.Tipe_Pengguna.MAHASISWA.toString())) {
                            Mahasiswa mahasiswa = Controller.MahasiswaController.getMahasiswa(pengguna.getEmail());
                            JOptionPane.showMessageDialog(null, "Welcome "+mahasiswa.getNama_Mahasiswa(), "Login Berhasl", JOptionPane.INFORMATION_MESSAGE);
                            new MenuMahasiswa(mahasiswa);
                            frame.dispose();
                        }else if (pengguna.getTipe_Pengguna().equals(Model.Tipe_Pengguna.DOSEN.toString())) {
                            Dosen dosen = Controller.DosenController.getDosen(pengguna.getEmail());
                            JOptionPane.showMessageDialog(null, "Welcome "+dosen.getNama_Dosen(), "Login Berhasl", JOptionPane.INFORMATION_MESSAGE);
                            new MenuDosen(dosen);
                            frame.dispose();
                        }else if (pengguna.getTipe_Pengguna().equals(Model.Tipe_Pengguna.DAAK.toString())) {
                            Daak daak = Controller.DaakController.getDaak(pengguna.getEmail());
                            JOptionPane.showMessageDialog(null, "Welcome "+daak.getNama_Daak(), "Login Berhasil", JOptionPane.INFORMATION_MESSAGE);
                            new MenuDAAK(daak);
                            frame.dispose();
                        }
                    }
                }
            }

        });

        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Form_LoginUser();
    }
}
