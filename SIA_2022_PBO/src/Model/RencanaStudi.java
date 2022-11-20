/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * @author yudis
 */
public class RencanaStudi
{
    private String nim;
    private int id_rencanaStudi;
    private String tahun;
    private int semester;
    
    public RencanaStudi(){
        
    }
    
    public RencanaStudi(String nim, int id_rencanaStudi, String tahun, int semester){
        this.nim = nim;
        this.id_rencanaStudi = id_rencanaStudi;
        this.tahun = tahun;
        this.semester = semester;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setId_rencanaStudi(int id_rencanaStudi){
        this.id_rencanaStudi = id_rencanaStudi;
    }
    
    public void setTahun(String tahun){
        this.tahun = tahun;
    }
    
    public void setSemester(int semester){
        this.semester = semester;
    }
    
    public String getNim(){
        return this.nim;
    }
    
    public int getId_rencanaStudi(){
        return this.id_rencanaStudi;
    }
    
    public String getTahun(){
        return this.tahun;
    }
    
    public int getSemester(){
        return this.semester;
    }
}
