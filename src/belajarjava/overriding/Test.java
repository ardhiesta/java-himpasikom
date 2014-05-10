/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.overriding;

/**
 *
 * @author linuxluv
 */
public class Test {
    public static void main(String[] args) {
        Dewasa dewasa = new Dewasa();
        dewasa.lari();
        
        Dewasa2 dewasa2 = new Dewasa2();
        dewasa2.lari();
    }
}