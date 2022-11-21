/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static Controller.DaakController.getAllDaak;
import Model.Daak;
import Model.Pengumuman;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static Controller.DosenController.*;
import Model.PengajuanPengumuman;
/**
 *
 * @author TUF GAMING
 */
public class Form_PengajuanPengumuman {

    JFrame frame;
    JLabel header, labelJudul, labelDeskripsi, lnik;
    JTextField inputJudul;
    JTextArea inputDeskripsi;
    JComboBox listNik;
    JButton ajukan;

    public Form_PengajuanPengumuman(){
        frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        header = new JLabel("Form Pengajuan Pengumuman");
        header.setBounds(235, 40, 400, 50);
        header.setFont(new Font("Arial", 1, 24));
        frame.add(header);

        lnik = new JLabel("Nik DAAK    :");
        lnik.setBounds(245, 125, 100, 40);
        lnik.setFont(new Font("Arial", 1, 15));
        frame.add(lnik);
        //
        ArrayList<Daak> listDaak = getAllDaak();
        String[] listNikDaak = new String[listDaak.size()];
        for (int i = 0; i < listDaak.size(); i++) {
            listNikDaak[i] = listDaak.get(i).getNik_Daak();
        }
        listNik = new JComboBox(listNikDaak);
        listNik.setBounds(335, 125, 250, 40);
        frame.add(listNik);

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

        ajukan = new JButton("Ajukan");
        ajukan.setBounds(335, 355, 250, 40);
        frame.add(ajukan);
        ajukan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (listDaak.get(listNik.getSelectedIndex()).getNik_Daak().isEmpty() || inputJudul.getText().isEmpty() || inputDeskripsi.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Isi semua field terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
                } else {
                    long millis = System.currentTimeMillis();
                    java.sql.Date date = new java.sql.Date(millis);
                    boolean cek = insertPengajuanPengumuman("33xxyy", new PengajuanPengumuman(listDaak.get(listNik.getSelectedIndex()).getNik_Daak(), inputJudul.getText(), inputDeskripsi.getText(), date));
                    if (cek) {
                        JOptionPane.showMessageDialog(null, "Pengumuman berhasil diajukan");
                    }
                }
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
