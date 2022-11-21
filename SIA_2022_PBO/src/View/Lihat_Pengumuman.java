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
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author TUF GAMING
 */
public class Lihat_Pengumuman {
    JComboBox listPengumuman;
    JFrame frame;
    JButton generate;
    String text;
    JLabel text2, header;
    public ArrayList<Pengumuman> list = new ArrayList();
    
    public Lihat_Pengumuman(){
        frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        
        header = new JLabel("Lihat Pengumuman");
        header.setBounds(280, 30, 300, 40);
        header.setFont(new Font("Dialog", 1, 26));
        frame.add(header);
        //
        list = Controller.Controller.getAllPengumuman();
        String[] judulPengumuman = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            judulPengumuman[i] = list.get(i).getJudul();
        }
        listPengumuman = new JComboBox(judulPengumuman);
        listPengumuman.setBounds(180, 120, 300, 40);
        frame.add(listPengumuman);
        //
        text2 = new JLabel();
        text2.setBounds(180, 145, 300, 100);
        text2.setFont(new Font("Dialog", 1, 24));
        frame.add(text2);

        generate = new JButton("Generate");
        generate.setBounds(490, 120, 120, 40);
        frame.add(generate);
        generate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                text2.setText(list.get(listPengumuman.getSelectedIndex()).getDeskripsi());
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
