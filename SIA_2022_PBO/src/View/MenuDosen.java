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
public class MenuDosen extends JFrame implements ActionListener{
    private Container contraniner;
    private JButton bJadwalAjar;
    private JButton bInputNilai;
    private JButton bIsiPengumuman;
    public MenuDosen (){
        contraniner = getContentPane();
        contraniner.setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        bJadwalAjar = new JButton("Jadwal Ajar");
        bJadwalAjar.setFont(new Font("Arial", Font.PLAIN, 15));
        bJadwalAjar.setSize(280, 50);
        bJadwalAjar.setLocation(150, 50);
        bJadwalAjar.addActionListener(this);
        contraniner.add(bJadwalAjar);
        
        bInputNilai = new JButton("Input Nilai");
        bInputNilai.setFont(new Font("Arial", Font.PLAIN, 15));
        bInputNilai.setSize(280, 50);
        bInputNilai.setLocation(150, 130);
        bInputNilai.addActionListener(this);
        contraniner.add(bInputNilai);
        
        bIsiPengumuman = new JButton("Pengajuan Pengumuman");
        bIsiPengumuman.setFont(new Font("Arial", Font.PLAIN, 15));
        bIsiPengumuman.setSize(280, 50);
        bIsiPengumuman.setLocation(150, 200);
        bIsiPengumuman.addActionListener(this);
        contraniner.add(bIsiPengumuman);        
        
        setTitle("Menu Dosen");
        setBounds(300, 90, 600, 400);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bJadwalAjar) {
            
        }else if (e.getSource() == bInputNilai) {
            
        }else if (e.getSource() == bIsiPengumuman) {
            Form_PengajuanPengumuman Form_PengajuanPengumuman = new Form_PengajuanPengumuman();
        }
    }
}