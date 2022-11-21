/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Mahasiswa;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static Controller.MahasiswaController.*;
/**
 *
 * @author TUF GAMING
 */
public class FormUpdateDataMahasiswa {
    JFrame frame;
    JLabel header, lemail, lid_jurusan, lnim, lnama;
    JTextField email, id_jurusan, nim, nama;
    JButton update, back;

    public FormUpdateDataMahasiswa() {
        frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        Mahasiswa mhs = new Mahasiswa();
        mhs = getUser("juan@gmail.com");

        String tempEmail = mhs.getEmail(); // ini ntar gausah lagi kalau udah bsa login

        header = new JLabel("Update Mahasiswa");
        header.setBounds(270, 50, 400, 50);
        header.setFont(new Font("Dialog", 1, 26));
        frame.add(header);
        lemail = new JLabel("Email                 :");
        lemail.setFont(new Font("Dialog", 1, 15));
        lemail.setBounds(220, 150, 150, 50);
        frame.add(lemail);

        email = new JTextField(mhs.getEmail());
        email.setBounds(370, 150, 150, 50);
        email.setText(mhs.getEmail());
        frame.add(email);

        lid_jurusan = new JLabel("ID Jurusan        :");
        lid_jurusan.setFont(new Font("Dialog", 1, 15));
        lid_jurusan.setBounds(220, 220, 150, 50);
        frame.add(lid_jurusan);
        id_jurusan = new JTextField(Integer.toString(mhs.getId_Jurusan()));
        id_jurusan.setBounds(370, 220, 150, 50);
        frame.add(id_jurusan);

        lnim = new JLabel("Nim                   : ");
        lnim.setFont(new Font("Dialog", 1, 15));
        lnim.setBounds(220, 290, 150, 50);
        frame.add(lnim);
        nim = new JTextField(mhs.getNim_Mahasiswa());
        nim.setBounds(370, 290, 150, 50);
        frame.add(nim);

        lnama = new JLabel("Nama                : ");
        lnama.setFont(new Font("Dialog", 1, 15));
        lnama.setBounds(220, 360, 150, 50);
        frame.add(lnama);
        nama = new JTextField(mhs.getNama_Mahasiswa());
        nama.setBounds(370, 360, 150, 50);
        frame.add(nama);

        update = new JButton("Update");
        update.setBounds(550, 290, 150, 50);
        frame.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (email.getText().isEmpty() || id_jurusan.getText().isEmpty() || nim.getText().isEmpty() || nama.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Field tidak boleh kosong", "Error", JOptionPane.WARNING_MESSAGE);
                } else {
                    boolean cek = updateMahasiswa(tempEmail, new Mahasiswa(email.getText(), Integer.parseInt(id_jurusan.getText()), nim.getText(), nama.getText()));
                    if (cek) {
                        JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
                    } else {
                        JOptionPane.showMessageDialog(null, "Data gagal diupdate");
                    }
                }
            }

        });

        back = new JButton("Back");
        back.setBounds(550, 360, 150, 50);
        frame.add(back);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new FormUpdateDataMahasiswa();
    }
}
