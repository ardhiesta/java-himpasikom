/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava._final;

/**
 *
 * @author linuxluv
 */
public class Contoh {
    private final String data = "Data";
    
    public void ubahData(String data){
        // error
        this.data = data;
    }
}
