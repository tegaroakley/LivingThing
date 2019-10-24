/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan62.livingthing;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human human = new Human();
        human.setNama("Tegar Lucky Oakley");
        System.out.print(human.getNama());
        human.walk(null);
        System.out.print(human.getNama());
        human.breath(null);
        System.out.print(human.getNama());
        human.eat(null);
    }
    
}
