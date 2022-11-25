/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author michael
 */
public class Jurusan {
    private int idJurusan;
    private String nsmsJurusan;

    public Jurusan(int idJurusan, String nsmsJurusan) {
        this.idJurusan = idJurusan;
        this.nsmsJurusan = nsmsJurusan;
    }

    public int getIdJurusan() {
        return idJurusan;
    }

    public void setIdJurusan(int idJurusan) {
        this.idJurusan = idJurusan;
    }

    public String getNsmsJurusan() {
        return nsmsJurusan;
    }

    public void setNsmsJurusan(String nsmsJurusan) {
        this.nsmsJurusan = nsmsJurusan;
    }
    
}
