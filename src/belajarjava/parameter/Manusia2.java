/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.parameter;

/**
 *
 * @author linuxluv
 */
public class Manusia2 {
    String nama;
    String alamat;
    
    // metode dengan lebih dari satu parameter
    void ubahData(String namaBaru, String alamatBaru){
        nama = namaBaru;
        alamat = alamatBaru;
    }
    
    // metode dengan satu parameter
    void ubahNama(String namaBaru){
        nama = namaBaru;
    }
    
    String ambilNama() {
        return nama;
    }
    
//    String ambilAlamat(){
//        return alamat;
//    }
    
    void hapusNama() {
        nama = "";
    }
}