/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Dosen;
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
    
    
}
