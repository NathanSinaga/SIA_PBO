/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.DosenController.conn;
import Model.Daak;
import Model.Dosen;
import Model.Mahasiswa;
import Model.Pengumuman;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Nathan Sinaga
 */
public class DaakController {

    //get all Daak
    public static ArrayList<Daak> getAllDaak() {
        ArrayList<Daak> listDaak = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM daak";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Daak daak = new Daak();
                daak.setEmail(rs.getString("email"));
                daak.setNik_Daak(rs.getString("nik_daak"));
                daak.setNama_Daak(rs.getString("nama_daak"));
                daak.setGaji_Daak(rs.getInt("gaji_daak"));
                //
                listDaak.add(daak);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (listDaak);
    }

    //Insert pengumuman
    public static boolean insertPengumuman(String nik_daak, Pengumuman pengumuman) {
        conn.connect();
        String query = "INSERT INTO pengumuman(nik_daak, judul, deskripsi, tanggal) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, nik_daak);
            stmt.setString(2, pengumuman.getJudul());
            stmt.setString(3, pengumuman.getDeskripsi());
            stmt.setDate(4, (Date) pengumuman.getTanggalPosting());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // SELECT WHERE daak
    public static Daak getDaak(String email) { // email && password
        conn.connect();
        String query = "SELECT * FROM daak WHERE email='" + email + "'";
        Daak daak = new Daak();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                daak.setEmail(rs.getString("email"));
                daak.setNik_Daak(rs.getString("nik_daak"));
                daak.setNama_Daak(rs.getString("nama_daak"));
                daak.setGaji_Daak(rs.getInt("gaji_daak"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (daak);
    }

    // Ditambahkan oleh Dominikus Yudistira
    // Daak memasukkan Pengumuman
    public void DaakMemasukkanPengumuman(String judul, String deskripsi) {

    }

    // Daak memasukkan jadwal Mengajar
    public void DaakMemasukkanJadwalMengajarDosen(Dosen dosen) {

    }

    // Daak memasukkan Jadwal Kuliah
    public void DaakMemsukkanJadwalKuliah(Mahasiswa mahasiswa) {

    }

    // Daak Blokir absensi Mahasiswa
    public void DaakBlokirAbsensiMahasiswa(Mahasiswa mahasiswa) {

    }

    // Daak Input Pembayaran Keuangan Mahasiswa
    public void InputPembayaranKeuanganMahasiswa(Mahasiswa mahasiswa) {

    }

}
