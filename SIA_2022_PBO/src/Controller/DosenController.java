/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.MahasiswaController.conn;
import Model.Dosen;
import Model.Mahasiswa;
import Model.PengajuanPengumuman;
import Model.Pengumuman;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author yudis
 */
public class DosenController {
    static DatabaseHandler conn = new DatabaseHandler();
    static Dosen dosen;
    
    public DosenController(String email){
        this.dosen = getDosen(email);
    }
    
    // Dosen Mengajukan Pengumuman ke bagian DAAK
    public void DosenMengajukanPengumuman (){
        
    }
    
    // Dosen Memasukkan Nilai
    
    public void MemasukkanNilai (){
        
    }
    public static ArrayList<Dosen> getAllNikDosen() {
        ArrayList<Dosen> dosen = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM dosen";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Dosen dosenNik = new Dosen();
                dosenNik.setNik_Dosen(rs.getString("nik_dosen"));
                dosenNik.setGaji_Dosen(rs.getInt("gaji_dosen"));
                dosen.add(dosenNik);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (dosen);
    }
    
     //Insert pengajuan pengumuman
    public static boolean insertPengajuanPengumuman(String nik_dosen, PengajuanPengumuman pengajuanPengumuman) {
        conn.connect();
        String query = "INSERT INTO pengajuan_pengumuman(nik_dosen, nik_daak, judul, deksripsi, tanggal) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            System.out.println(pengajuanPengumuman.getNik_daak());
            stmt.setString(1, nik_dosen);
            stmt.setString(2, pengajuanPengumuman.getNik_daak());
            stmt.setString(3, pengajuanPengumuman.getJudul());
            stmt.setString(4, pengajuanPengumuman.getDeskripsi());
            stmt.setDate(5, (Date) pengajuanPengumuman.getTanggal());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    // SELECT WHERE dosen
    public static Dosen getDosen(String email) { // email && password
        conn.connect();
        String query = "SELECT * FROM dosen WHERE email='" + email + "'";
        Dosen dosen = new Dosen();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                dosen.setEmail(rs.getString("email"));
                dosen.setId_Jurusan(rs.getInt("id_jurusan"));
                dosen.setNik_Dosen(rs.getString("nik_dosen"));
                dosen.setNama_Dosen(rs.getString("nama_dosen"));
                dosen.setGaji_Dosen(rs.getInt("gaji_dosen"));
                dosen.setTipe_Dosen(rs.getString("tipe_dosen"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (dosen);
    }
}
