/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * @author yudis
 */
public class Dosen extends Pengguna
{
    private int id_jurusan;
    private String nik_dosen;
    private String nama_dosen;
    private int gaji_dosen;
    private String tipe_dosen;
    
    public Dosen(){
        
    }
    
    public Dosen(String email, String password, String tipe_pengguna, int id_jurusan, String nik_dosen, String nama_dosen, int gaji_dosen, String tipe_dosen ){
        super(email, password, tipe_pengguna);
        this.id_jurusan = id_jurusan;
        this.nik_dosen = nik_dosen;
        this.nama_dosen = nama_dosen;
        this.gaji_dosen = gaji_dosen;
        this.tipe_dosen = tipe_dosen;
    }
    
    public void setId_Jurusan(int id_jurusan){
        this.id_jurusan = id_jurusan;
    }
    
    public void setNik_Dosen(String nik_dosen){
        this.nik_dosen = nik_dosen;
    }
    
    public void setNama_Dosen(String nama_dosen){
        this.nama_dosen = nama_dosen;
    }
    
    public void setGaji_Dosen(int gaji_dosen){
        this.gaji_dosen = gaji_dosen;
    }
    
    public void setTipe_Dosen(String tipe_dosen){
        this.tipe_dosen = tipe_dosen;
    }
    
    public int  getId_Jurusan(){
        return this.id_jurusan;
    }
    
    public String getNik_Dosen(){
        return this.nik_dosen;
    }
    
    public String getNama_Dosen(){
        return this.nama_dosen;
    }
    
    public int getGaji_Dosen(){
        return this.gaji_dosen;
    }
    
    public String getTipe_Dosen(){
        return this.tipe_dosen;
    }

}
