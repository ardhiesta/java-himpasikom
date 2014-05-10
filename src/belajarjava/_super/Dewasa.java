/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava._super;

import belajarjava.overriding.Bayi;

/**
 *
 * @author linuxluv
 */
public class Dewasa extends Bayi {
    public void lariBayi() {
        // mengakses metode lari milik Bayi
        super.lari();
    }
    
    public void lari() {
        System.out.println("Lari!!!!");
    }
}
