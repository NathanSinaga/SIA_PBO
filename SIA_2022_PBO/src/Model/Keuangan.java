/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * @author yudis
 */
public class Keuangan
{
    private int idBiaya;
    private int idPengumuman;
    private int nim;
    private int jumlahBiaya;
    private String deksripsi;

    public Keuangan(int idBiaya, int idPengumuman, int nim, int jumlahBiaya, String deksripsi)
    {
        this.idBiaya = idBiaya;
        this.idPengumuman = idPengumuman;
        this.nim = nim;
        this.jumlahBiaya = jumlahBiaya;
        this.deksripsi = deksripsi;
    }

    public int getIdBiaya()
    {
        return idBiaya;
    }

    public void setIdBiaya(int idBiaya)
    {
        this.idBiaya = idBiaya;
    }

    public int getIdPengumuman()
    {
        return idPengumuman;
    }

    public void setIdPengumuman(int idPengumuman)
    {
        this.idPengumuman = idPengumuman;
    }

    public int getNim()
    {
        return nim;
    }

    public void setNim(int nim)
    {
        this.nim = nim;
    }

    public int getJumlahBiaya()
    {
        return jumlahBiaya;
    }

    public void setJumlahBiaya(int jumlahBiaya)
    {
        this.jumlahBiaya = jumlahBiaya;
    }

    public String getDeksripsi()
    {
        return deksripsi;
    }

    public void setDeksripsi(String deksripsi)
    {
        this.deksripsi = deksripsi;
    }


}
