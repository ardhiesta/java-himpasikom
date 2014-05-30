/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author linuxluv
 */
public class ContohIf2 {
    public static void main(String[] args){
        int bilangan = 150;
        if(bilangan > 200){
            System.out.println(bilangan + " lebih dari 200");
        } else if(bilangan < 180) {
            if(bilangan % 2 == 0){
                System.out.println(bilangan + " adalah bilangan genap");
            } else {
                System.out.println(bilangan + " adalah bilangan ganjil");
            }
        }
    }
}
