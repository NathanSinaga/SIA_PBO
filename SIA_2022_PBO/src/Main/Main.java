/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import View.*;

/**
 *
 * @author Nathan Sinaga
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1
        new FormLogin().setVisible(true);
        // 2
        new FormPengajuanRS().setVisible(true);
        // 3
        new FormBayarRS().setVisible(true);
        // 4
        new FormRosterMataKuliah().setVisible(true);
        // 5
        new FormNilai().setVisible(true);
        // 6
        new FormAbsensi().setVisible(true);
        // 7
        FormFeedBack formFeedBack = new FormFeedBack();
        // 8
        new FormUpdateDataMahasiswa();
        // skip dulu tunggu fungsi
        // 9
        // message box
        // 10
        new FormRosterMataKuliah().setVisible(true);
        // 11
        new FormMasukNilai().setVisible(true);
        // 12
        new Form_PengajuanPengumuman();
        //new FormMengajukanPengumuman().setVisible(true);
        // 13
        // jadwal jadwal apa?
        // 14
        new Form_BuatPengumuman();
        //new FormMasukPengumuman().setVisible(true);
        // 15
        new FormJadwalKuliah().setVisible(true);
        // 16
        new Lihat_Pengumuman();
        // message box
    }
    
}
