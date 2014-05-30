/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.array;

/**
 *
 * @author linuxluv
 */
public class ManipulasiDataArray {
    public static void main(String[] args){
        int a[] = new int[5];
        a[0] = 234;
        a[1] = 6867;
        a[2] = 4234;
        a[3] = 564;
        a[4] = 2423;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        
        a[0] = 123;
        System.out.println(a[0]);
        
        System.out.println("panjang array: " + a.length);
        
    }
}
