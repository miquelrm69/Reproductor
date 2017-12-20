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
    
    static Scanner input = new Scanner(System.in);
    
    public Panel() {
        super();
    }
    
    static void modes() {
        System.out.println("** Menu **");
        System.out.println("    1- " + modeTypes.CD);
        System.out.println("    2- " + modeTypes.RADIO);
        System.out.println("    3- " + modeTypes.EXT);
        System.out.println("    4- " + modeTypes.USB);
        System.out.println("Opt.: ");
        int optMod = input.nextInt();
        setMode(optMod);
    }
    
    static void cdMode() {
        System.out.println(getTune() + " FM");
        System.out.println("Options: ");
        System.out.println("    1- Change frequence");
        System.out.println("    2- Change volume");
        System.out.println("    3- Save frequence (not implemented)");
        System.out.println("    4-   Exit");
        System.out.println("Opt.:");
        int optCd = input.nextInt();
        
    }
    
    static void chFreq () {
        System.out.println("Insert the new frequence: ");
        double newFreq = input.nextDouble();
        setTune(newFreq);
    }
    
    static void chVolume() {
        System.out.println("Insert new volume: (min 0 / max 100) ");
        int newVolume = input.nextInt();
        if (newVolume >= 0 && newVolume <= 100) {
            setVolume(newVolume);
        } else {
            System.out.println("Min 0 and Max 100!");
        }
    }
}
