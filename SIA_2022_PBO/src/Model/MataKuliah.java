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
    private String nik_dosen;
    private String kode_mataKuliah;
    private String nama_mataKuliah;
    private int sks_mataKuliah;
    
    public MataKuliah(){
        
    }
    
    public MataKuliah(String nik_dosen, String kode_mataKuliah, String nama_mataKuliah, int sks_mataKuliah){
        this.nik_dosen = nik_dosen;
        this.kode_mataKuliah = kode_mataKuliah;
        this.nama_mataKuliah = nama_mataKuliah;
        this.sks_mataKuliah = sks_mataKuliah;
    }
    
    public void setNik_Dosen(String nik_dosen){
        this.nik_dosen = nik_dosen;
    }
    
    public void setKode_MataKuliah(String kode_mataKuliah){
        this.kode_mataKuliah = kode_mataKuliah;
    }
    
    public void setNama_MataKuliah(String nama_mataKuliah){
        this.nama_mataKuliah = nama_mataKuliah;
    }
    
    public void setSks_MataKuliah(int sks_mataKuliah){
        this.sks_mataKuliah = sks_mataKuliah;
    }
    
    public String getNik_Dosen(){
        return this.nik_dosen;
    }
    
    public String getKode_MataKuliah(){
        return this.kode_mataKuliah;
    }
    
    public String getNama_MataKuliah(){
        return this.nama_mataKuliah;
    }
    
    public int getSks_MataKuliah(){
        return this.sks_mataKuliah;
    }
}
