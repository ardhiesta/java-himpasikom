/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6._interface;

/**
 *
 * @author linuxluv
 */
public class ContohAksi implements Aksi {

    @Override
    public void beraksi() {
        System.out.println("berubah...");
    }

    @Override
    public void tendang() {
        System.out.println("tendang!");
    }

    @Override
    public void pukul() {
        System.out.println("pukul!");
    }
    
}
