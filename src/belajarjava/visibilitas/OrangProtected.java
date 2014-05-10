/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.visibilitas;

/**
 *
 * @author linuxluv
 */
public class OrangProtected {
    protected String nama;
    protected String alamat;
    
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