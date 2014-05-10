/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.konstruktor;

/**
 *
 * @author linuxluv
 */
public class Manusia2 {
    private String nama;
    String alamat;
    
    public Manusia2(String nama) {
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
