/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author yudis
 */
public class TranskripNilai {
    private int nim;
    private String nama;
    private int tahunAkademik;
    private int semester;
    private int idMatakuliah;
    private double nilai;

    public TranskripNilai(int nim, String nama, int tahunAkademik, int semester, int idMatakuliah, double nilai) {
        this.nim = nim;
        this.nama = nama;
        this.tahunAkademik = tahunAkademik;
        this.semester = semester;
        this.idMatakuliah = idMatakuliah;
        this.nilai = nilai;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTahunAkademik() {
        return tahunAkademik;
    }

    public void setTahunAkademik(int tahunAkademik) {
        this.tahunAkademik = tahunAkademik;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getIdMatakuliah() {
        return idMatakuliah;
    }

    public void setIdMatakuliah(int idMatakuliah) {
        this.idMatakuliah = idMatakuliah;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
    
    
}
