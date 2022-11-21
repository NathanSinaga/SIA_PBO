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
    private String email;
    private String password;
    private String tipe_pengguna;
    //private KehadiranInterface kehadiran;

    public Pengguna(){
        
    }
    
    public Pengguna(String email, String password, String tipe_pengguna)
    {
        this.email = email;
        this.password = password;
        this.tipe_pengguna = tipe_pengguna;
    }

    public Pengguna(String email){
        this.email = email;
    }
   public void setEmail(String email){
       this.email = email;
   }
   
   public void setPassword(String password){
       this.password = password;
   }
   
   public void setTipe_Pengguna(String tipe_pengguna){
       this.tipe_pengguna = tipe_pengguna;
   }
   
   public String getEmail(){
       return this.email;
   }
   
   public String getPassword(){
       return this.password;
   }
   
   public String getTipe_Pengguna(){
       return this.tipe_pengguna;
   }



}