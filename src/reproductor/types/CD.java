/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductor.types;
import java.util.Scanner;
import reproductor.*;

/**
 *
 * @author miquel
 */
public class CD {
    static Scanner input = new Scanner(System.in);
    
    private static int currentDisc;
    private static String nameDisc;
    private static int totalDiscs;
    private static int totalTracks;
    private static int currentTrack;
    private static boolean playing = false;
    
    public static void menuCD() {
        System.out.println("Vol." + Reproductor.getVolume() + " Current CD: " + (currentDisc == 0 ? "Empty" : currentDisc));
        System.out.println("1- Insert a CD");
        System.out.println("2- Play CD");
        System.out.println("3- Change current CD");
        System.out.println("4- Change volume");
        System.out.println("5- Change track"); //Implementar poder canviar les pistes amb uns botons diferents
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
                playCD();
                break;
            case 3:
                //Change CD
                break;
            case 4:
                //Change volume
                break;
            case 5:
                //Change track
                break;
            default:
                Reproductor.mainMenu();
                break;
        }
    }
    
    private static void insertCD() {
        System.out.println("Insert your CD... Press '0' if you're ready!");
        int rdy = input.nextInt();
        switch (rdy) {
            case 0:
                totalDiscs++;
                currentDisc = totalDiscs;
                nameDisc = "" + currentDisc + "";
                System.out.println("CD Inserted correctly");
                menuCD();
                break;
            default:
                System.err.println("Bad value. Please try again.");
        }
    }
    
    private static void playCD() {
        System.out.println("Play " + nameDisc + " ?     (yes/no)");
        String playIt = input.next();
        switch (playIt) {
            case "n":
            case "no":
                menuCD();
                break;
            case "y":
            case "yes":
                playing = true;
                
        }
    }
    
}
