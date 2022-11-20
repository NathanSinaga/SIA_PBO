/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nathan Sinaga
 */
public class Detail_RencanaStudi {
    private int id_rencanaStudi;
    private String kode_mataKuliah;
    private int id_detailRencanaStudi;
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;
    private int uts;
    private int uas;
    
    public Detail_RencanaStudi(){
        
    }
    
    public Detail_RencanaStudi(int id_rencanaStudi, String kode_mataKuliah, int id_detailRencanaStudi, int n1, int n2, int n3, int n4, int n5, int uts, int uas){
        this.id_rencanaStudi = id_rencanaStudi;
        this.kode_mataKuliah = kode_mataKuliah;
        this.id_detailRencanaStudi = id_detailRencanaStudi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.uts = uts;
        this.uas = uas;
    }
    
    public void setId_RencanaStudi(int id_rencanaStudi){
        this.id_rencanaStudi = id_rencanaStudi;
    }
    
    public void setKode_MataKuliah(String kode_mataKuliah){
        this.kode_mataKuliah = kode_mataKuliah;
    }
    
    public void setId_DetailRencanaStudi(int id_detailRencanaStudi){
        this.id_detailRencanaStudi = id_detailRencanaStudi;        
    }
    
    public void setN1(int n1){
        this.n1 = n1;
    }
    
    public void setN2(int n2){
        this.n2 = n2;
    }
    
    public void setN3(int n3){
        this.n3 = n3;
    }
    
    public void setN4(int n4){
        this.n4 = n4;
    }
    
    public void setN5(int n5){
        this.n5 = n5;
    }
    
    public void setUts(int uts){
        this.uts = uts;
    }
    
    public void setUas(int uas){
        this.uas = uas;
    }
    
    public int getId_RencanaStudi(int id_rencanaStudi){
        return this.id_rencanaStudi;
    }
    
    public String getKode_MataKuliah(String kode_mataKuliah){
        return this.kode_mataKuliah;
    }
    
    public int getId_DetailRencanaStudi(int id_detailRencanaStudi){
        return this.id_detailRencanaStudi;        
    }
    
    public int getN1(){
        return this.n1;
    }
    
    public int getN2(){
        return this.n2 = n2;
    }
    
    public int getN3(){
        return this.n3;
    }
    
    public int getN4(){
        return this.n4;
    }
    
    public int getN5(){
        return this.n5;
    }
    
    public int getUts(){
        return this.uts;
    }
    
    public int getUas(){
        return this.uas;
    }
}
