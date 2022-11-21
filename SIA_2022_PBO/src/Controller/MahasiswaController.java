/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.DosenController.conn;
import Model.Mahasiswa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author yudis
 */
public class MahasiswaController {
    
    
    // SELECT WHERE
    public static Mahasiswa getUser(String email) { // email && password
        conn.connect();
        String query = "SELECT * FROM mahasiswa WHERE email='" + email + "'";
        Mahasiswa mahasiswa = new Mahasiswa();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                mahasiswa.setEmail(rs.getString("email"));
                mahasiswa.setId_Jurusan(rs.getInt("id_jurusan"));
                mahasiswa.setNim_Mahasiswa(rs.getString("nim_mahasiswa"));
                mahasiswa.setNama_Mahasiswa(rs.getString("nama_mahasiswa"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (mahasiswa);
    }
    
    // UPDATE
    public static boolean updateMahasiswa(String cariEmail, Mahasiswa mhs) {
        conn.connect();
        String query = "UPDATE mahasiswa SET email='" + mhs.getEmail() + "', "
                + "id_jurusan='" + mhs.getId_Jurusan() + "', "
                + "nim_mahasiswa='" + mhs.getNim_Mahasiswa() + "', "
                + "nama_mahasiswa='" + mhs.getNama_Mahasiswa() + "' "
                + "WHERE email='" + cariEmail + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    
    
    public void MemasukanRencanaStudi (){
        
    }
    
    // Merubah Rencana Studi 
    
    public void MerubahRencanaStudi () {
        
    }
    
    // Memberikan FeedBack Kepada Dosen 
    
    public void MemberikanFeedbackDosen (){
        
    }
    
    // Memberikan FeedBack Kepada Daak
    
    public void MemberikanFeedbackDaak (){
        
    }
    
    // Melihat Keuangan () 
    
    public void MelihatKeuangan () {
        
    }
    
    // Data Dummy 
    
    public void DummyMahasiswa () {
       //  Mahasiswa datamahasiswa1 = new Mahasiswa(111807," ","Dominikus Yudistira","1234");
        
     
        
    }
    
}
