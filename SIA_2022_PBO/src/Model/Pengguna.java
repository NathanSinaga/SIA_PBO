/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * @author Nathan Sinaga
 */
public abstract class Pengguna
{

    // Ditambahkan oleh Dominikus Yudistira
    private String nama;
    private String password;
    //private KehadiranInterface kehadiran;

    public Pengguna(String nama, String password)
    {
        this.nama = nama;
        this.password = password;
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

}