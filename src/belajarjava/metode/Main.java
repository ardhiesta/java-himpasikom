/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.metode;

/**
 *
 * @author linuxluv
 */
public class Main {
    public static void main(String[] args){
        Manusia manusia = new Manusia();
        manusia.nama = "Eko Kurniawan Khannedy";
        
        // mengambil nilai dari fungsi
        String nama = manusia.ambilNama();
        
        //print nama
        System.out.println(nama);
    }
}
