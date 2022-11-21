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
 * @author mp
 */
public class MenuMahasiswa extends JFrame implements ActionListener {

    private Container contraniner;
    private JButton bRencanaStudi;
    private JButton bBayarRencanaStudi;
    private JButton bJadwal;
    private JButton bNilai;
    private JButton bAbsen;
    private JButton bFeedBack;
    private JButton bTransaksi;
    private JButton bUpdateData;
    private JButton bLihatPengumuman;
    
    public MenuMahasiswa() {
        contraniner = getContentPane();
        contraniner.setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        bRencanaStudi = new JButton("Pengajuan Rencana Studi");
        bRencanaStudi.setFont(new Font("Arial", Font.PLAIN, 15));
        bRencanaStudi.setSize(280, 50);
        bRencanaStudi.setLocation(150, 60);
        bRencanaStudi.addActionListener(this);
        contraniner.add(bRencanaStudi);

        bBayarRencanaStudi = new JButton("Membayar Rencana Studi");
        bBayarRencanaStudi.setFont(new Font("Arial", Font.PLAIN, 15));
        bBayarRencanaStudi.setSize(280, 50);
        bBayarRencanaStudi.setLocation(150, 120);
        bBayarRencanaStudi.addActionListener(this);
        contraniner.add(bBayarRencanaStudi);

        bJadwal = new JButton("Jadwal Kuliah");
        bJadwal.setFont(new Font("Arial", Font.PLAIN, 15));
        bJadwal.setSize(280, 50);
        bJadwal.setLocation(150, 180);
        bJadwal.addActionListener(this);
        contraniner.add(bJadwal);

        bNilai = new JButton("Nilai");
        bNilai.setFont(new Font("Arial", Font.PLAIN, 15));
        bNilai.setSize(280, 50);
        bNilai.setLocation(150, 240);
        bNilai.addActionListener(this);
        contraniner.add(bNilai);

        bAbsen = new JButton("Absen");
        bAbsen.setFont(new Font("Arial", Font.PLAIN, 15));
        bAbsen.setSize(280, 50);
        bAbsen.setLocation(150, 300);
        bAbsen.addActionListener(this);
        contraniner.add(bAbsen);

        bFeedBack = new JButton("Feed Back");
        bFeedBack.setFont(new Font("Arial", Font.PLAIN, 15));
        bFeedBack.setSize(280, 50);
        bFeedBack.setLocation(150, 360);
        bFeedBack.addActionListener(this);
        contraniner.add(bFeedBack);

        bTransaksi = new JButton("Transaksi");
        bTransaksi.setFont(new Font("Arial", Font.PLAIN, 15));
        bTransaksi.setSize(280, 50);
        bTransaksi.setLocation(150, 420);
        bTransaksi.addActionListener(this);
        contraniner.add(bTransaksi);

        bUpdateData = new JButton("Update Data");
        bUpdateData.setFont(new Font("Arial", Font.PLAIN, 15));
        bUpdateData.setSize(280, 50);
        bUpdateData.setLocation(150, 480);
        bUpdateData.addActionListener(this);
        contraniner.add(bUpdateData);
        
        bLihatPengumuman = new JButton("Pengumuman");
        bLihatPengumuman.setFont(new Font("Arial", Font.PLAIN, 15));
        bLihatPengumuman.setSize(280, 50);
        bLihatPengumuman.setLocation(150, 540);
        bLihatPengumuman.addActionListener(this);
        contraniner.add(bLihatPengumuman);
        
        setTitle("Menu Mahasiswa");
        setBounds(300, 90, 600, 710);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bRencanaStudi) {

        } else if (e.getSource() == bBayarRencanaStudi) {

        } else if (e.getSource() == bJadwal) {

        } else if (e.getSource() == bNilai) {

        } else if (e.getSource() == bAbsen) {

        } else if (e.getSource() == bFeedBack) {

        } else if (e.getSource() == bTransaksi) {

        } else if (e.getSource() == bUpdateData) {

        }

    }
    public static void main(String[] args) {
       MenuMahasiswa menu = new MenuMahasiswa();
    }
}
