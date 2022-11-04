/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * @author yudis
 */
public class Pengumuman
{
    private int idPengumuman;
    private String judul;
    private String Deskripsi;
    private int tanggalPosting;
    private String catatan;

    public Pengumuman(int idPengumuman, String judul, String Deskripsi, int tanggalPosting, String catatan)
    {
        this.idPengumuman = idPengumuman;
        this.judul = judul;
        this.Deskripsi = Deskripsi;
        this.tanggalPosting = tanggalPosting;
        this.catatan = catatan;
    }

    public int getIdPengumuman()
    {
        return idPengumuman;
    }

    public void setIdPengumuman(int idPengumuman)
    {
        this.idPengumuman = idPengumuman;
    }

    public String getJudul()
    {
        return judul;
    }

    public void setJudul(String judul)
    {
        this.judul = judul;
    }

    public String getDeskripsi()
    {
        return Deskripsi;
    }

    public void setDeskripsi(String Deskripsi)
    {
        this.Deskripsi = Deskripsi;
    }

    public int getTanggalPosting()
    {
        return tanggalPosting;
    }

    public void setTanggalPosting(int tanggalPosting)
    {
        this.tanggalPosting = tanggalPosting;
    }

    public String getCatatan()
    {
        return catatan;
    }

    public void setCatatan(String catatan)
    {
        this.catatan = catatan;
    }

}
