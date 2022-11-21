/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nathan Sinaga
 */
public class JadwalKuliah {
    private String nik_daak;
    private String kode_matakuliah;
    private int id_jadwalKuliah;
    private String dateTime_jadwalKuliah;
    private String ruangan;
    
    public JadwalKuliah(){
        
    }
    
    public JadwalKuliah(String nik_daak, String kode_matakuliah, int id_jadwalKuliah, String dateTime_jadwalKuliah, String ruangan){
        this.nik_daak = nik_daak;
        this.id_jadwalKuliah = id_jadwalKuliah;
        this.kode_matakuliah = kode_matakuliah;
        this.dateTime_jadwalKuliah = dateTime_jadwalKuliah;
        this.ruangan = ruangan;
    }
    
    public void setNik_Daak(String nik_daak){
        this.nik_daak = nik_daak;
    }
    
    public void setKode_MataKuliah(String kode_matakuliah){
        this.kode_matakuliah = kode_matakuliah;
    }
    
    public void setId_JadwalKuliah(int id_jadwalKuliah){
        this.id_jadwalKuliah = id_jadwalKuliah;
    }
    
    public void setDateTime_JadwalKuliah(String dateTime_jadwalKuliah){
        this.dateTime_jadwalKuliah = dateTime_jadwalKuliah;
    }
    
    public void setRuangan(String ruangan){
        this.ruangan = ruangan;
    }
    
    public String getNik_Daak(){
        return this.nik_daak;
    }
    
    public String getKode_MataKuliah(){
        return this.kode_matakuliah;
    }
    
    public int getId_JadwalKuliah(){
        return this.id_jadwalKuliah;
    }
    
    public String getDateTime_JadwalKuliah(){
        return this.dateTime_jadwalKuliah;
    }
    
    public String getRuangan(){
        return this.ruangan;
    }
    

    
    
    
}
