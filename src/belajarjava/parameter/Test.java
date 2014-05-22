/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.parameter;

/**
 *
 * @author linuxluv
 */
public class Test {
    public static void main(String[] args){
        Manusia1 manusia = new Manusia1();
        manusia.ubahNama("Setiawan Jullev");
        String nama = manusia.ambilNama();
        
        //print nama
        System.out.println(nama);
        
        Manusia2 manusia2 = new Manusia2();
        manusia2.ubahData("Setiawan Jullev", "Condong Catur");
        
        //print nama
        System.out.println(manusia2.ambilNama());
        //print alamat
        System.out.println(manusia2.alamat);
    }
}
