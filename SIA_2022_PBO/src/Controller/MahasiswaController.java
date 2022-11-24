/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.DosenController.conn;
import Model.Mahasiswa;
import Model.Pengguna;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 *
 * @author yudis
 */
public class MahasiswaController {    
    static DatabaseHandler conn = new DatabaseHandler();
    static Mahasiswa mahasiswa;
    
    public MahasiswaController(Pengguna newPengguna){
        this.mahasiswa = getMahasiswa(newPengguna.getEmail());
    }
    
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
    // SELECT WHERE
    public static Mahasiswa getMahasiswa(String email) { // email && password
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

    static public HashMap<String, Integer> absensiMahasiswa(int tahun, int semester, String nim)
    {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        String query = String.format("SELECT detail_rencanastudi.kode_matakuliah, COUNT(absensi.id_absensi) AS 'jumlah_absensi' FROM rencanastudi INNER JOIN detail_rencanastudi ON detail_rencanastudi.id_rencanastudi = rencanastudi.id_rencanastudi INNER JOIN absensi ON absensi.id_detailrencanastudi = detail_rencanastudi.id_detailrencanastudi WHERE rencanastudi.nim_mahasiswa = '%s' AND rencanastudi.tahun = '%d' AND rencanastudi.semester = '%d' GROUP BY detail_rencanastudi.id_detailrencanastudi", nim, tahun, semester);
        conn.connect();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                result.put(rs.getString("kode_matakuliah"), rs.getInt("jumlah_absensi"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return result;
        }
        return result;
    }

    static public int[] nilaiMahasiswa(int tahun, int semester, String nim, String kodemk)
    {
        int[] result = new int[7];
        String query = String.format("SELECT * FROM rencanastudi INNER JOIN detail_rencanastudi ON detail_rencanastudi.id_rencanastudi = rencanastudi.id_rencanastudi WHERE rencanastudi.nim_mahasiswa = '%s' AND detail_rencanastudi.kode_matakuliah = '%s' AND rencanastudi.tahun = '%d' AND rencanastudi.semester = '%d';", nim, kodemk, tahun, semester);
        conn.connect();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                result[0] = rs.getInt("n1");
                result[1] = rs.getInt("n2");
                result[2] = rs.getInt("n3");
                result[3] = rs.getInt("n4");
                result[4] = rs.getInt("n5");
                result[5] = rs.getInt("uts");
                result[6] = rs.getInt("uas");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return result;
        }
        return result;
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
