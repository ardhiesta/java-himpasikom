/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava.percabangan;

/**
 *
 * @author linuxluv
 */
public class SwitchCase {
    public static void main(String[] args){
        int hari = 5;
        switch(hari){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hari ke-5");
                break;
            case 6:
                System.out.println("Bukan Hari Libur");
                break;
            case 7:
                System.out.println("Hari Libur");
                break;
            default:
                System.out.println("Hari Tidak Diketahui");
                break;
        }
    }
}
