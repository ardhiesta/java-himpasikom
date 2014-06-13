/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author linuxluv
 */
public class Test {
    public static void main(String args[]){
        //polimorfisme dengan abstract class
        Hewan hewan1 = new Kucing();
        hewan1.bicara();
        
        Hewan hewan2 = new Anjing();
        hewan2.bicara();
        
        //implementasi interface
        Kambing hewan3 = new Kambing();
        hewan3.bicara();
        
        Ayam hewan4 = new Ayam();
        hewan4.bicara();
    }
}
