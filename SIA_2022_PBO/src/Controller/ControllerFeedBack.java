/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author rapmonz
 */
public class ControllerFeedBack {
    static DatabaseHandler conn = new DatabaseHandler();
    public static boolean insertNewFeedback(String nik, String nim, String Saran) {
        conn.connect();
        String query = "INSERT INTO feedback(nik_dosen,nim_mahasiswa, saran) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, nik);
            stmt.setString(2, nim);
            stmt.setString(3, Saran);
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
