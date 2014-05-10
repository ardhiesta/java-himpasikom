/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava._super;

/**
 *
 * @author linuxluv
 */
public class Berumur extends Bernama {
    private int umur;
    
    public Berumur() {
    }
    
    public Berumur(String nama, int umur){
        super(nama);
        this.umur = umur;
    }
    
    public int ambilUmur(){
        return umur;
    }
}