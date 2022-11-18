/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Nathan Sinaga
 */
public class LoginScreen { //FR- 001
    JFrame frame;
    JLabel header, LabelEmail, LabelPassword;
    JTextField inputEmail, inputPassword;
    JButton loginButton;
    public LoginScreen (){
        frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        
        header = new JLabel("Sistem Informasi Akademik ITHB");
        header.setBounds(210, 40, 400, 50);
        header.setFont(new Font( "Dialog", 1, 25));
        frame.add(header);
        
        LabelEmail = new JLabel("Email               :");
        LabelEmail.setBounds(260, 200, 90, 40);
        frame.add(LabelEmail);
        
        inputEmail = new JTextField();
        inputEmail.setBounds(360, 200, 140, 35);
        frame.add(inputEmail);
        
        LabelPassword = new JLabel("Password      :");
        LabelPassword.setBounds(260, 240, 80, 40);
        frame.add(LabelPassword);
        
        inputPassword = new JTextField();
        inputPassword.setBounds(360, 240, 140, 35);
        frame.add(inputPassword);
        
        loginButton = new JButton("Login");
        loginButton.setBounds(360, 280, 140, 35);
        frame.add(loginButton);
        
        frame.setLayout(null);
        frame.setVisible(true);
        
        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                //manggil fungsi controller
            }           
        });
    }
    
}
