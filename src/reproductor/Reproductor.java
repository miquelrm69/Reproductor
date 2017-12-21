/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductor;

import reproductor.types.*;
import java.util.Scanner;

/**
 *
 * @author miquel
 */
public class Reproductor {
    
    static Scanner input = new Scanner(System.in);
    
    private static int speakers, currentVolume = 10;
    private static enum modeType {CD, RADIO, EXT, USB};
    private static modeType currentMode;
    
    public Reproductor() {
        speakers = 2;
        System.out.println("Vol." + currentVolume);
    }
    
    public static void mainMenu() {
        System.out.println("** Menu **");
        System.out.println("    1- " + modeType.CD);
        System.out.println("    2- " + modeType.RADIO);
        System.out.println("    3- " + modeType.EXT);
        System.out.println("    4- " + modeType.USB);
        System.out.print("Opt.: ");
        int optMod = input.nextInt();
        setMode(optMod);
    }
    
    private static void setMode(int mode) {
        switch (mode) {
            case 1:
                CD.menuCD();
                break;
            case 2:
                RADIO.menuRadio();
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
    
    public static int getVolume() {
        return currentVolume;
    }
    
    public static void chVolume(int v) {
        currentVolume = v;
    }
}
