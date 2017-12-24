/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductor.types;

import java.util.Scanner;
import reproductor.Reproductor;

/**
 *
 * @author miquel
 */
public class EXT {
    private static Scanner input = new Scanner(System.in);
    private static String nameDevice = "Dev.1";
    private static boolean conn = false;
    private static String currentSong = "Unknown";
    private static double songDuration;
    
    public static void menuExt() {
        System.out.print("Vol." + Reproductor.getVolume() + " ");
        if (conn == true) {
            System.out.println(nameDevice + " connected");
        } else {
            System.out.println("No device connected");
        }
        System.out.println("1-  Change volume");
        System.out.println("2-  Connect a device");
        System.out.println("3-  Eject a device");
        System.out.println("4-  Exit");
        int optExt = input.nextInt();
        setModeExt(optExt);
    }
    
    private static void connDevice() {
        conn = true;
        nameDevice = "Device 1";
        menuExt();
    }
    
    private static void ejectDevice() {
        conn = false;
        nameDevice = "";
        menuExt();
    }
    
    private static void setModeExt(int opt) {
        switch (opt) {
            case 1:
                Reproductor.menuChVol();
                break;
            case 2:
                connDevice();
                break;
            case 3:
                ejectDevice();
                break;
            default:
                Reproductor.mainMenu();
                break;
        }
        menuExt();
    }
}
