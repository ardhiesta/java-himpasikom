/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.OverloadingKonstruktor;

/**
 *
 * @author linuxluv
 */
public class Manusia {
    private String nama;
    String alamat;

    public Manusia() {
        // tanpa parameter
    }
    
    public Manusia(String nama) {
        this.nama = nama;
    }
    
    public String ambilNama() {
        return nama;
    }
    
    void ubahData(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    void ubahNama(String nama) {
        this.nama = nama;
    }
}
