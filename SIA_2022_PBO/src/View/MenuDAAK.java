/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class MenuDAAK extends JFrame implements ActionListener {

    private Container contraniner;
    private JButton bInputJadwal;
    private JButton bLihatPengumuman;
    private JButton bInputPengumuman;

    public MenuDAAK() {
        contraniner = getContentPane();
        contraniner.setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Mahasiswa
        bInputJadwal = new JButton("Jadwal Ajar");
        bInputJadwal.setFont(new Font("Arial", Font.PLAIN, 15));
        bInputJadwal.setSize(280, 50);
        bInputJadwal.setLocation(150, 50);
        bInputJadwal.addActionListener(this);
        contraniner.add(bInputJadwal);

        bInputPengumuman = new JButton("Input Nilai");
        bInputPengumuman.setFont(new Font("Arial", Font.PLAIN, 15));
        bInputPengumuman.setSize(280, 50);
        bInputPengumuman.setLocation(150, 130);
        bInputPengumuman.addActionListener(this);
        contraniner.add(bInputPengumuman);

        bLihatPengumuman = new JButton("Pengajuan Pengumuman");
        bLihatPengumuman.setFont(new Font("Arial", Font.PLAIN, 15));
        bLihatPengumuman.setSize(280, 50);
        bLihatPengumuman.setLocation(150, 200);
        bLihatPengumuman.addActionListener(this);
        contraniner.add(bLihatPengumuman);

        setTitle("Menu Dosen");
        setBounds(300, 90, 600, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bInputJadwal) {
            new FormJadwalKuliah();
        } else if (e.getSource() == bInputPengumuman) {
            new Form_BuatPengumuman();
        } else if (e.getSource() == bLihatPengumuman) {
            new Lihat_Pengumuman();
        }
    }

}
