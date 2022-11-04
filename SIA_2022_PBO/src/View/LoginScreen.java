/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Nathan Sinaga
 */
public class LoginScreen {
    public static void main(String[] args) {

        // Ditambahkan Dominikus Yudistira
        JFrame f = new JFrame("Login");
        JTextField textinputanid, textinputanpassword;
        JLabel labelinputanid, labelinputanpassword;

        // JText
        textinputanid = new JTextField("");
        textinputanid.setBounds(200, 100, 200, 30);
        textinputanpassword = new JTextField("");
        textinputanpassword.setBounds(200, 150, 200, 30);

        // Jlabel 
        labelinputanid = new JLabel("ID:");
        labelinputanpassword = new JLabel("Password:");
        labelinputanid.setBounds(10, 100, 200, 30);
        labelinputanpassword.setBounds(10, 150, 200, 30);

        // JButton
        JButton login = new JButton("Login");
        login.setBounds(250, 200, 95, 30);

        // Print 
        f.add(textinputanid);
        f.add(textinputanpassword);
        f.add(labelinputanid);
        f.add(labelinputanpassword);
        f.add(login);

        // Settings Layout
        f.setSize(500, 300);
        f.setLayout(null);
        f.setVisible(true);

    }
    
}
