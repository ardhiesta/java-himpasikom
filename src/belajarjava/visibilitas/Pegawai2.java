/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.visibilitas;

/**
 *
 * @author linuxluv
 */
public class Pegawai2 extends OrangProtected {
    private String nip;
    
    public void ubahNip(String nip) {
        this.nip = nip;
    }
    
    public String ambilNip() {
        return nip;
    }
    
    public void contoh(){
        // berhasil
        String ambilnama = nama;
        String ambilalamat = alamat;
    }
}
