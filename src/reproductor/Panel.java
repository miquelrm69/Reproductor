/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductor;

import java.util.Scanner;

/**
 *
 * @author miquel
 */
public class Panel extends Reproductor {
    
    Scanner input = new Scanner(System.in);
    
    public Panel() {
        super();
    }
    
    static void modes() {
        System.out.println("** Menú Reproductor **");
        System.out.println("1- " + modeTypes.CD);
        System.out.println("2- " + modeTypes.RADIO);
        System.out.println("3- " + modeTypes.EXT);
        System.out.println("4- " + modeTypes.USB);
    }
}
