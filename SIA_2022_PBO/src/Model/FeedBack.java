/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * @author yudis
 */
public class FeedBack
{
    private String nama;
    private String saran;

    public FeedBack(String nama, String saran)
    {
        this.nama = nama;
        this.saran = saran;
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getSaran()
    {
        return saran;
    }

    public void setSaran(String saran)
    {
        this.saran = saran;
    }
}


