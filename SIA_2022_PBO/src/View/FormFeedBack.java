/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Michel P
 */
import Controller.DosenController;
import Controller.ControllerFeedBack;
import Model.Dosen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FormFeedBack extends JFrame implements ActionListener {

    private Container contraniner;
    private JLabel lNik;
    ArrayList<Dosen> Listdosen = DosenController.getAllNikDosen();
    private JLabel lNim;
    private JComboBox nik;
    private JComboBox nim;
    private JLabel lSaran;
    private JTextArea tSaran;
    private JButton sub;

    public FormFeedBack() {
        String apa[] = new String[Listdosen.size()];
        for (int i = 0; i < Listdosen.size(); i++) {
            apa[i] = String.valueOf(Listdosen.get(i).getNik_Dosen());
        }
        contraniner = getContentPane();
        contraniner.setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lNik = new JLabel("Nik Dosen : ");
        lNik.setFont(new Font("Arial", Font.PLAIN, 15));
        lNik.setSize(100, 20);
        lNik.setLocation(100, 80);
        contraniner.add(lNik);

        nik = new JComboBox(apa);
        nik.setFont(new Font("Arial", Font.PLAIN, 15));
        nik.setSize(150, 20);
        nik.setLocation(200, 80);
        contraniner.add(nik);

        lSaran = new JLabel("Saran : ");
        lSaran.setFont(new Font("Arial", Font.PLAIN, 15));
        lSaran.setSize(100, 20);
        lSaran.setLocation(100, 110);
        contraniner.add(lSaran);

        tSaran = new JTextArea();
        tSaran.setFont(new Font("Arial", Font.PLAIN, 15));
        tSaran.setSize(210, 220);
        tSaran.setLocation(200, 110);
        contraniner.add(tSaran);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(200, 350);
        sub.addActionListener(this);
        contraniner.add(sub);
        setTitle("Feed Back");
        setBounds(300, 90, 600, 600);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String data = (String) nik.getSelectedItem();
        String data1 = "1xyyxx";
        String data2 = tSaran.getText();
        if (e.getSource() == sub) {
            boolean cek = ControllerFeedBack.insertNewFeedback(data1, data, data2);
            if (cek) {
                System.out.println("masuk");
            }
        }

    }
}
