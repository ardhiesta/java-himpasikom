/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.perulangan;

/**
 *
 * @author linuxluv
 */
public class TestBreak {
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
            if(i == 50){
                break;
            }
        }
    }
}
