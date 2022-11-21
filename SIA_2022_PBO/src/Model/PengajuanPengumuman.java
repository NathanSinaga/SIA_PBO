/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author TUF GAMING
 */
public class PengajuanPengumuman {
    private String nik_dosen;
    private String nik_daak;
    private int id_pengajuanPengumuman;
    private String judul;
    private String deskripsi;
    Date tanggal;

    public PengajuanPengumuman() {
    }

    public PengajuanPengumuman(String nik_dosen, String nik_daak, int id_pengajuanPengumuman, String judul, String deskripsi, Date tanggal) {
        this.nik_dosen = nik_dosen;
        this.nik_daak = nik_daak;
        this.id_pengajuanPengumuman = id_pengajuanPengumuman;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.tanggal = tanggal;
    }

    public PengajuanPengumuman(String nik_daak, String judul, String deskripsi, Date tanggal){
        this.nik_daak = nik_daak;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.tanggal = tanggal;
    }
    public String getNik_dosen() {
        return nik_dosen;
    }

    public void setNik_dosen(String nik_dosen) {
        this.nik_dosen = nik_dosen;
    }

    public String getNik_daak() {
        return nik_daak;
    }

    public void setNik_daak(String nik_daak) {
        this.nik_daak = nik_daak;
    }

    public int getId_pengajuanPengumuman() {
        return id_pengajuanPengumuman;
    }

    public void setId_pengajuanPengumuman(int id_pengajuanPengumuman) {
        this.id_pengajuanPengumuman = id_pengajuanPengumuman;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    
    
}
