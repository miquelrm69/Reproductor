/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductor.types;
import java.util.ArrayList;
import java.util.Scanner;
import reproductor.*;

/**
 *
 * @author miquel
 */
public class CD {
    static Scanner input = new Scanner(System.in);
    
    private static String currentDisc;
    private static String nameDisc;
    private static ArrayList listDisc = new ArrayList();
    //private static int totalDiscs;
    private static int totalTracks;
    private static int currentTrack;
    private static boolean playing = false;
    
    public static void menuCD() {
        System.out.println("Vol." + Reproductor.getVolume() + " Current CD: " + currentDisc);
        System.out.println("1- Insert a CD");
        System.out.println("2- Play CD");
        System.out.println("3- Change current CD");
        System.out.println("4- Change volume");
        System.out.println("5- Eject CD");
        System.out.println("6- Exit");
        int optCD = input.nextInt();
        setModeCD(optCD);
    }
    
    private static void setModeCD(int mode) {
        switch (mode) {
            case 1:
                insertCD();
                break;
            case 2:
                menuPlayCD();
                break;
            case 3:
                changeCD();
                break;
            case 4:
                Reproductor.menuChVol();
                break;
            case 5:
                ejectCD();
                break;
            default:
                Reproductor.mainMenu();
                break;
        }
        menuCD();
    }
    
    private static void insertCD() {
        System.out.println("Insert your CD... ");
        System.out.print("Name of CD: ");
        String nameCD = input.next();
        listDisc.add(nameCD);
        menuCD();
    }
    
    private static void menuPlayCD() { //ERROR?
        System.out.println("Play " + listDisc + " ?     (Choose one with name of disc)");
        String playIt = input.next();
        if (listDisc.indexOf(playIt) != -1) {
            System.out.println("You choosed " + playIt);
            currentDisc = playIt;
            menuCD();
        } else {
            System.err.println("Error, disc not found!");
        }
        
    }
    
    private static void changeCD() {
        System.out.println("Wich CD you want? ( 1 to 5)");
        int wantCD = input.nextInt();        
        if (wantCD >= 1 && wantCD <= 5) {
            currentDisc = listDisc.get(wantCD - 1).toString();
        } else {
            System.err.println("Empty position!");
        }
        menuCD();
    }
    
    private static void ejectCD() {
        System.out.println("Select the CD to eject: " + listDisc);
        String ejCD = input.next();
        listDisc.remove(ejCD);
        System.out.println(ejCD + " removed successfully!");
        currentDisc = null;
        menuCD();
    }
    
}
