/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.perulangan;

/**
 *
 * @author linuxluv
 */
public class PerulanganFor {
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                continue;
            }
            
            System.out.println(i);
            
            if(i == 11){
                break;
            }
        }
    }
}
