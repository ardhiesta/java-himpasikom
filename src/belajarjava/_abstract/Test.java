/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava._abstract;

/**
 *
 * @author linuxluv
 */
public class Test {
    public static void main(String[] args){
        Hewan hewan1 = new Anjing( );
        hewan1.bicara();
        
        Hewan hewan2 = new Kambing();
        hewan2.bicara();

        Hewan hewan3 = new Kucing();
        hewan3.bicara();
    }
}
