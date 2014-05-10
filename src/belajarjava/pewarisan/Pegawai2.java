/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.pewarisan;

/**
 *
 * @author linuxluv
 */
public class Pegawai2 extends Orang {
    private String nip;
    
    public void ubahNip(String nip) {
        this.nip = nip;
    }
    
    public String ambilNip() {
        return nip;
    }
}
