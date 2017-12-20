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
public class Panel {
    
    static Scanner input = new Scanner(System.in);
    
    static void modes() {
        System.out.println("** Menu **");
        System.out.println("    1- " + Reproductor.modeTypes.CD);
        System.out.println("    2- " + Reproductor.modeTypes.RADIO);
        System.out.println("    3- " + Reproductor.modeTypes.EXT);
        System.out.println("    4- " + Reproductor.modeTypes.USB);
        System.out.println("Opt.: ");
        int optMod = input.nextInt();
        Reproductor.setMode(optMod);
    }
    
    static void cdMode() {
        System.out.println(Reproductor.getTune() + " FM");
        System.out.println("Options: ");
        System.out.println("    1- Change frequence");
        System.out.println("    2- Change volume");
        System.out.println("    3- Save frequence (not implemented)");
        System.out.println("    4-   Exit");
        System.out.println("Opt.:");
        int optCd = input.nextInt();
        Reproductor.setCdMode(optCd);
    }
    
    static void chFreq () {
        System.out.println("Insert the new frequence: ");
        double newFreq = input.nextDouble();
        Reproductor.setTune(newFreq);
    }
    
    static void chVolume() {
        System.out.println("Insert new volume: (min 0 / max 100) ");
        int newVolume = input.nextInt();
        if (newVolume >= 0 && newVolume <= 100) {
            Reproductor.setVolume(newVolume);
        } else {
            System.out.println("Min 0 and Max 100!");
        }
    }
}
