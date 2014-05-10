/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.visibilitas;

import belajarjava.pewarisan.Orang;

/**
 *
 * @author linuxluv
 */
public class Pegawai extends Orang {
    private String nip;
    
    public void ubahNip(String nip) {
        this.nip = nip;
    }
    
    public String ambilNip() {
        return nip;
    }
    
    public void contoh(){
        String ambilnama = nama;
    }
}