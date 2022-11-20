/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * @author yudis
 */
public class Daak extends Pengguna
{
    private String nik_daak;
    private String nama_daak;
    private int gaji_daak;

    public Daak(String email, String password, String tipe_pengguna, String nik_daak, String nama_daak, int gaji_daak)
    {
        super(email, password, tipe_pengguna);        
        this.nik_daak = nik_daak;
        this.nama_daak = nama_daak;
        this.gaji_daak = gaji_daak;
    }

    public void setNik_Daak(String nik_daak){
        this.nik_daak = nik_daak;
    }
    
    public void setNama_Daak(String nama_daak){
        this.nama_daak = nama_daak;
    }
    
    public void setGaji_Daak(int gaji_daak){
        this.gaji_daak = gaji_daak;
    }
    
    public String getNik_Daak(){
        return this.nik_daak;
    }
    
    public String getNama_Daak(){
        return this.nama_daak;
    }
    
    public int getGaji_Daak(){
        return this.gaji_daak;
    }
}