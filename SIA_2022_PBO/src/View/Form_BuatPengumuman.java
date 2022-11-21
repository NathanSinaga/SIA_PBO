/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pengumuman;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static Controller.DaakController.*;
import javax.swing.JTextArea;
/**
 *
 * @author TUF GAMING
 */
public class Form_BuatPengumuman {
    //no.14 input pengumuman DAAK

    JFrame frame;
    JLabel header, labelTujuan, labelJudul, labelDeskripsi, labelTanggal;
    JTextField inputJudul, tanggal;
    JCheckBox cekMahasiswa, cekDosen;
    JButton agree;
    JTextArea inputDeskripsi;
    public Form_BuatPengumuman(){
        frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        header = new JLabel("Form Pengumuman");
        header.setBounds(280, 50, 400, 50);
        header.setFont(new Font("Dialog", 1, 25));
        frame.add(header);

        //Judul
        labelJudul = new JLabel("Judul           : ");
        labelJudul.setFont(new Font("Arial", 1, 15));
        labelJudul.setBounds(245, 175, 100, 40);
        frame.add(labelJudul);

        inputJudul = new JTextField();
        inputJudul.setBounds(335, 175, 250, 40);
        frame.add(inputJudul);

        //Deskripsi
        labelDeskripsi = new JLabel("Deskripsi   : ");
        labelDeskripsi.setFont(new Font("Arial", 1, 15));
        labelDeskripsi.setBounds(245, 225, 100, 40);
        frame.add(labelDeskripsi);

        inputDeskripsi = new JTextArea();
        inputDeskripsi.setBounds(335, 225, 250, 100);
        frame.add(inputDeskripsi);

        agree = new JButton("Agree");
        agree.setBounds(335, 355, 250, 40);
        frame.add(agree);
        agree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                long millis = System.currentTimeMillis();
                java.sql.Date date = new java.sql.Date(millis);
                if (inputJudul.getText().isEmpty() || inputDeskripsi.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Input Semua field terlebih dahulu");
                } else {
                    frame.dispose();
                    boolean cek = insertPengumuman("xxxxyy", new Pengumuman(inputJudul.getText(), inputDeskripsi.getText(), date));
                    if (cek) {
                        JOptionPane.showMessageDialog(null, "Pengumuman berhasil dibagikan");
                    }
                }
            }

        });

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
