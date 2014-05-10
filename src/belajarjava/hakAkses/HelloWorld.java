/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.hakAkses;

/**
 *
 * @author linuxluv
 */
public class HelloWorld {
    public static void main( String[] args) {
        Manusia1 manusia1 = new Manusia1();
        manusia1.ubahData("Eko", "Subang");
        System.out.println( manusia1.nama );
        System.out.println(manusia1.alamat);
        
        Manusia2 manusia2 = new Manusia2();
        manusia2.ubahData("Eko", "Subang");
        System.out.println( manusia2.ambilNama() );
        System.out.println(manusia2.alamat);
    }
}
