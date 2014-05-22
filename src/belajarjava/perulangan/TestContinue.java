/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.perulangan;

/**
 *
 * @author linuxluv
 */
public class TestContinue {
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
