/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author michael
 */
public class Absensi {

    private String nik_dosen;
    private int id_detailRencanaStudi;
    private int id_absensi;
    private int kehadiran;
    private Date tanggalAbsensi;

    public Absensi() {

    }

    public Absensi(String nik_dosen, int id_detailRencanaStudi, int id_absensi, int kehadiran, Date tanggalAbsensi) {
        this.nik_dosen = nik_dosen;
        this.id_detailRencanaStudi = id_detailRencanaStudi;
        this.id_absensi = id_absensi;
        this.kehadiran = kehadiran;
        this.tanggalAbsensi = tanggalAbsensi;
    }

    public String getNik_dosen() {
        return nik_dosen;
    }

    public void setNik_dosen(String nik_dosen) {
        this.nik_dosen = nik_dosen;
    }

    public int getId_detailRencanaStudi() {
        return id_detailRencanaStudi;
    }

    public void setId_detailRencanaStudi(int id_detailRencanaStudi) {
        this.id_detailRencanaStudi = id_detailRencanaStudi;
    }

    public int getId_absensi() {
        return id_absensi;
    }

    public void setId_absensi(int id_absensi) {
        this.id_absensi = id_absensi;
    }

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public Date getTanggalAbsensi() {
        return tanggalAbsensi;
    }

    public void setTanggalAbsensi(Date tanggalAbsensi) {
        this.tanggalAbsensi = tanggalAbsensi;
    }

}
