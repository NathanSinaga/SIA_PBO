/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author michael 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class FormLihatDaftarTransaksi extends JFrame implements ActionListener{
    private Container contraniner;
    private JLabel lDaftarTransaksi;
    private JLabel lSaran;
    private JTextArea tSaran;
    private JButton bDaftarTransaksi;
    public FormLihatDaftarTransaksi (){
        contraniner = getContentPane();
        contraniner.setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        bDaftarTransaksi = new JButton("Lihat Daftar Transaksi");
        bDaftarTransaksi.setFont(new Font("Arial", Font.PLAIN, 15));
        bDaftarTransaksi.setSize(180, 80);
        bDaftarTransaksi.setLocation(200, 80);
        bDaftarTransaksi.addActionListener(this);
        contraniner.add(bDaftarTransaksi);
        setTitle("Feed Back");
        setBounds(300, 90, 600, 600);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bDaftarTransaksi) {
            JOptionPane.showMessageDialog(null, "berhasil");
        }
    }
    
}
