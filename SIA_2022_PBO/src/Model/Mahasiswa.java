/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * @author yudis
 */
public class Mahasiswa extends Pengguna
{
    private int id_jurusan;
    private String nim_mahasiswa;
    private String nama_mahasiswa;

    
    public Mahasiswa(){
        
    }
    
    public Mahasiswa(String email, String password, String tipe_pengguna, String nama, int id_jurusan, String nim_mahasiswa, String nama_mahasiswa)
    {
        super(email, password, tipe_pengguna);
        this.id_jurusan = id_jurusan;
        this.nim_mahasiswa = nim_mahasiswa;
        this.nama_mahasiswa = nama_mahasiswa;
    }


    public void setNama_Mahasiswa(String nama_mahasiswa){
        this.nama_mahasiswa = nama_mahasiswa;
    }
    
    public void setId_Jurusan(int id_jurusan){
        this.id_jurusan = id_jurusan;
    }
    
    public void setNim_Mahasiswa(String nim_mahasiswa){
        this.nim_mahasiswa = nim_mahasiswa;
    }

    public String getNama_Mahasiswa(){
        return this.nama_mahasiswa;
    }
    
    public int getId_Jurusan(){
        return this.id_jurusan;
    }
    
    public String getNim_Mahasiswa(){
        return this.nim_mahasiswa;
    }
   

}
