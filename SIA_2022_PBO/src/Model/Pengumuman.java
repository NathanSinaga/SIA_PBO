/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 * @author yudis
 */
public class Pengumuman {

    private int idPengumuman;
    private String judul;
    private String Deskripsi;
    private Date tanggalPosting;

    public Pengumuman() {

    }

    public Pengumuman(int idPengumuman, String judul, String Deskripsi, Date tanggalPosting) {
        this.idPengumuman = idPengumuman;
        this.judul = judul;
        this.Deskripsi = Deskripsi;
        this.tanggalPosting = tanggalPosting;
    }

    public Pengumuman(String judul, String Deskripsi, Date tanggalPosting) {
        this.judul = judul;
        this.Deskripsi = Deskripsi;
        this.tanggalPosting = tanggalPosting;
    }

    public int getIdPengumuman() {
        return idPengumuman;
    }

    public void setIdPengumuman(int idPengumuman) {
        this.idPengumuman = idPengumuman;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String Deskripsi) {
        this.Deskripsi = Deskripsi;
    }

    public Date getTanggalPosting() {
        return tanggalPosting;
    }

    public void setTanggalPosting(Date tanggalPosting) {
        this.tanggalPosting = tanggalPosting;
    }

}
