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
    private String nim_mahasiswa;
    private int id_rencanaStudi;
    private int id_pembayaran;
    private int jumlah;
    private String tanggal;
    
    public Keuangan(){
        
    }
    
    public Keuangan(String nim_mahasiswa, int id_rencanaStudi, int id_pembayaran, int jumlah, String tanggal){
        this.nim_mahasiswa = nim_mahasiswa;
        this.id_rencanaStudi = id_rencanaStudi;
        this.id_pembayaran = id_pembayaran;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
    }
    
    public void setNim_Mahasiswa(String nim_mahasiswa){
        this.nim_mahasiswa = nim_mahasiswa;
    }
    
    public void setId_RencanaStudi(int id_rencanaStudi){
        this.id_rencanaStudi = id_rencanaStudi;
    }
    
    public void setId_Pembayaran(int id_pembayaran){
        this.id_pembayaran = id_pembayaran;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }

    public String getNim_Mahasiswa(){
        return this.nim_mahasiswa;
    }
    
    public int getId_RencanaStudi(){
        return this.id_rencanaStudi;
    }
    
    public int getId_Pembayaran(){
        return this.id_pembayaran;
    }
    
    public int getJumlah(){
        return this.jumlah;
    }
    
    public String getTanggal(){
        return this.tanggal;
    }
}
