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
