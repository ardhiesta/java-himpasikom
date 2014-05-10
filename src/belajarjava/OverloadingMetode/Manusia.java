/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.OverloadingMetode;

/**
 *
 * @author linuxluv
 */
public class Manusia {
    private String nama;
    private String alamat;
    
    public Manusia() {
        // tanpa parameter
    }
    
    public Manusia(String nama) {
        this.nama = nama;
    }
    
    public void ubah(String nama) {
        this.nama = nama;
    }
    
    public void ubah(String nama, String alamat){
        this.nama = nama;   
        this.alamat = alamat;
    }
}
