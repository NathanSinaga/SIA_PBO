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
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static Controller.Controller.*;
import Model.MataKuliah;
/**
 *
 * @author TUF GAMING
 */
public class Form_InputPembayaranRSmahasiswa {

    JFrame frame;
    JLabel header, labelUang, ltotal;
    JTextField inputUang;
    JButton konfirmasi;

    public Form_InputPembayaranRSmahasiswa(Mahasiswa mhs) {
        frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        header = new JLabel("Form Keuangan");
        header.setBounds(290, 50, 400, 50);
        header.setFont(new Font("Dialog", 1, 24));
        frame.add(header);

        int total = 0;
        ArrayList<MataKuliah> listMatkul = getAllMatkul();
        for (int i = 0; i < listMatkul.size(); i++) {
            total += listMatkul.get(i).getSks_MataKuliah();
        }
        
//        ltotal = new JLabel("Total yang harus dibayarkan : "+total);
//        ltotal.setBounds(190, 135, 1000, 80);
//        ltotal.setFont(new Font("Dialog", 1, 17));
//        frame.add(ltotal);
        
        
        labelUang = new JLabel("Jumlah Pembayaran : ");
        labelUang.setBounds(190, 250, 200, 80);
        labelUang.setFont(new Font("Dialog", 1, 16));
        frame.add(labelUang);

        inputUang = new JTextField();
        inputUang.setBounds(400, 275, 200, 40);
        frame.add(inputUang);

        konfirmasi = new JButton("Confirm");
        konfirmasi.setBounds(400, 335, 200, 40);
        frame.add(konfirmasi);
        konfirmasi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "lakukan fungsi pembayaran");
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }

}
