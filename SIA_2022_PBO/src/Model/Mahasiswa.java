/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author yudis
 */
public class Mahasiswa extends Pengguna{
         private int nim;
    private String [] jurusan;

    public Mahasiswa(int nim, String[] jurusan, String nama, String password) {
        super(nama, password);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String[] getJurusan() {
        return jurusan;
    }

    public void setJurusan(String[] jurusan) {
        this.jurusan = jurusan;
    }
    
}
