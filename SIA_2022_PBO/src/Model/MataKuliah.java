/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * @author yudis
 */
public class MataKuliah
{
    private int idMataKuliah;
    private String namaMatkul;
    private int sks;
    private String[] jurusan;

    public MataKuliah(int idMataKuliah, String namaMatkul, int sks, String[] jurusan)
    {
        this.idMataKuliah = idMataKuliah;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.jurusan = jurusan;
    }

    public int getIdMataKuliah()
    {
        return idMataKuliah;
    }

    public void setIdMataKuliah(int idMataKuliah)
    {
        this.idMataKuliah = idMataKuliah;
    }

    public String getNamaMatkul()
    {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul)
    {
        this.namaMatkul = namaMatkul;
    }

    public int getSks()
    {
        return sks;
    }

    public void setSks(int sks)
    {
        this.sks = sks;
    }

    public String[] getJurusan()
    {
        return jurusan;
    }

    public void setJurusan(String[] jurusan)
    {
        this.jurusan = jurusan;
    }
}
