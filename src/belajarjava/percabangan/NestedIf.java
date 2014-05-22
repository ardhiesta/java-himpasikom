/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.percabangan;

/**
 *
 * @author linuxluv
 */
public class NestedIf {
    public static void main(String[] args){
        int nilai = 6;
        char index;
        if(nilai >= 8){
            index = 'A';
        }else if(nilai >= 7){
            index = 'B';
        }else if(nilai >= 6){
            index = 'C';
        }else if(nilai >= 5){
            index = 'D';
        }else{
            index = 'E';
        }
        System.out.println(index);
    }
}
