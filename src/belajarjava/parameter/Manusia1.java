/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.parameter;

/**
 *
 * @author linuxluv
 */
public class Manusia1 {
    String nama;
    // metode dengan parameter
    void ubahNama(String namaBaru){
        nama = namaBaru;
    }
    
    String ambilNama() {
        return nama;
    }
    
    void hapusNama() {
        nama = "";
    }
}
