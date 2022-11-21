/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pengguna;
import Model.Pengumuman;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Nathan Sinaga
 */
public class Controller {
    static DatabaseHandler conn = new DatabaseHandler();

    // Semua dari tabel pengguna
    public static ArrayList<Pengguna> getAllUsers() {
        ArrayList<Pengguna> users = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM pengguna";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Pengguna user = new Pengguna();
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setTipe_Pengguna(rs.getString("tipe_pengguna"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (users);
    }
    
    //get all pengumuman
    public static ArrayList<Pengumuman> getAllPengumuman() {
        ArrayList<Pengumuman> listPengumuman = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM pengumuman";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Pengumuman pengumuman = new Pengumuman();
                pengumuman.setJudul(rs.getString("judul"));
                pengumuman.setDeskripsi(rs.getString("deskripsi"));
                //
                listPengumuman.add(pengumuman);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (listPengumuman);
    }
}
