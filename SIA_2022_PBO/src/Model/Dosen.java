/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author yudis
 */
public class Dosen extends Pengguna{
    private int nikDosen;
    private DosenKategori dosenKategori;
    private int gajiDosen;

    public Dosen(int nikDosen, DosenKategori dosenKategori, int gajiDosen, String nama, String password) {
        super(nama, password);
        this.nikDosen = nikDosen;
        this.dosenKategori = dosenKategori;
        this.gajiDosen = gajiDosen;
    }

    public int getNikDosen() {
        return nikDosen;
    }

    public void setNikDosen(int nikDosen) {
        this.nikDosen = nikDosen;
    }

    public DosenKategori getDosenKategori() {
        return dosenKategori;
    }

    public void setDosenKategori(DosenKategori dosenKategori) {
        this.dosenKategori = dosenKategori;
    }

    public int getGajiDosen() {
        return gajiDosen;
    }

    public void setGajiDosen(int gajiDosen) {
        this.gajiDosen = gajiDosen;
    } 
}
