/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.pewarisan;

/**
 *
 * @author linuxluv
 */
public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;
    
    public void ubahNip(String nip) {
        this.nip = nip;
    }
    
    public String ambilNip() {
        return nip;
    }
    
    public void ubahNama(String nama) {
        this.nama = nama;
    }
    
    public String ambilNama() {
        return nama;
    }
    
    public void ubahAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String ambilAlamat() {
        return alamat;
    }
}