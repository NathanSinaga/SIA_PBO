/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mahasiswa;
import Model.MataKuliah;
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

    public Controller(){
        String email = "juan@gmail.com";
        String password = "juanpassword";
        Pengguna newPengguna = getUser(email, password);
        
        switch (newPengguna.getTipe_Pengguna())
        {
            case "MAHASISWA":
                MahasiswaController mahasiswaController = new MahasiswaController(newPengguna);
                break;
            case "DOSEN":
                DosenController dosenController = new DosenController(newPengguna);
                break;
            case "DAAK":
                DaakController daakController = new DaakController(newPengguna);
                break;
        }
    }
    

    
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

    public static MataKuliah getMataKuliahByKode(String kode_mataKuliah) {
        MataKuliah mk = new MataKuliah();
        conn.connect();
        String query = "SELECT * FROM matakuliah WHERE matakuliah.kode_matakuliah='" + kode_mataKuliah + "';";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            mk.setNik_Dosen(rs.getString("nik_dosen"));
            mk.setKode_MataKuliah(rs.getString("kode_matakuliah"));
            mk.setNama_MataKuliah(rs.getString("nama_matakuliah"));
            mk.setSks_MataKuliah(rs.getInt("sks_matakuliah"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (mk);
    }

    // SELECT WHERE
    public static Pengguna getUser(String email, String pass) {
        conn.connect();
        String query = "SELECT * FROM pengguna WHERE email='" + email + "' AND password='" + pass +"';";
        Pengguna pengguna = new Pengguna();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                pengguna.setEmail(rs.getString("email"));
                pengguna.setPassword(rs.getString("password"));
                pengguna.setTipe_Pengguna(rs.getString("tipe_pengguna"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (pengguna);
    }
    
    //get all pengumuman
    public static ArrayList<MataKuliah> getAllMatkul() {
        ArrayList<MataKuliah> listMatkul = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM matakuliah";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
               MataKuliah matkul = new MataKuliah();
               matkul.setKode_MataKuliah(rs.getString("kode_matakuliah"));
               matkul.setNama_MataKuliah(rs.getString("nama_matakuliah"));
               matkul.setSks_MataKuliah(rs.getInt("sks_matakuliah"));
                //
                listMatkul.add(matkul);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (listMatkul);
    }
}
