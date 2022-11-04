/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * @author yudis
 */
public class Daak extends Pengguna
{
    private int nikDaak;
    private int gajiDaak;

    public Daak(int nikDaak, int gajiDaak, String nama, String password)
    {
        super(nama, password);
        this.nikDaak = nikDaak;
        this.gajiDaak = gajiDaak;
    }

    public int getNikDaak()
    {
        return nikDaak;
    }

    public void setNikDaak(int nikDaak)
    {
        this.nikDaak = nikDaak;
    }

    public int getGajiDaak()
    {
        return gajiDaak;
    }

    public void setGajiDaak(int gajiDaak)
    {
        this.gajiDaak = gajiDaak;
    }
}