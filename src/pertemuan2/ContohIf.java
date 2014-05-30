/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import javax.swing.JOptionPane;

/**
 *
 * @author linuxluv
 */
public class ContohIf {
    public static void main(String[] args){
        int bilangan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan : "));
        if(bilangan % 2 == 0){
            //System.out.print(bilangan + " adalah bilangan genap");
            JOptionPane.showMessageDialog(null, bilangan + " adalah bilangan genap");
        } else {
            //System.out.print(bilangan + " adalah bilangan ganjil");
            JOptionPane.showMessageDialog(null, bilangan + " adalah bilangan ganjil");
        }
    }
}
