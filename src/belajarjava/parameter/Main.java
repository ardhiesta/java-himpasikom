/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.parameter;

/**
 *
 * @author linuxluv
 */
public class Main {
    public static void main(String[] args){
        Manusia1 manusia = new Manusia1();
        manusia.ubahNama("Eko Kurniawan Khannedy");
        String nama = manusia.ambilNama();
        
        //print nama
        System.out.println(nama);
        
        Manusia2 manusia2 = new Manusia2();
        manusia2.ubahData("Eko", "Subang");
        
        //print nama
        System.out.println(manusia2.ambilNama());
        //print alamat
        System.out.println(manusia2.alamat);
    }
}
