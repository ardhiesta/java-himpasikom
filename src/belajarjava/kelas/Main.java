/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.kelas;

/**
 *
 * @author linuxluv
 */
public class Main {
    public static void main(String[] args){
        // membuat objek manusia
        Manusia manusia = new Manusia();
        // mengubah nama objek manusia
        manusia.nama = "Eko Kurniawan Khannedy";
        
        //print nama
        System.out.println(manusia.nama);
    }
}
