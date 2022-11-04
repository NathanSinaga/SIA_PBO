/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * @author yudis
 */
public class RencanaStudi
{
    private int nim;
    private int idMataKuliah;
    private int prasyarat;

    public RencanaStudi(int nim, int idMataKuliah, int prasyarat)
    {
        this.nim = nim;
        this.idMataKuliah = idMataKuliah;
        this.prasyarat = prasyarat;
    }

    public int getNim()
    {
        return nim;
    }

    public void setNim(int nim)
    {
        this.nim = nim;
    }

    public int getIdMataKuliah()
    {
        return idMataKuliah;
    }

    public void setIdMataKuliah(int idMataKuliah)
    {
        this.idMataKuliah = idMataKuliah;
    }

    public int getPrasyarat()
    {
        return prasyarat;
    }

    public void setPrasyarat(int prasyarat)
    {
        this.prasyarat = prasyarat;
    }

}
