/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductor.types;

import java.util.Arrays;
import java.util.Scanner;
import reproductor.*;

/**
 *
 * @author miquel
 */
public class RADIO {

    static Scanner input = new Scanner(System.in);
    private static double FreqTune = 000.00;
    static boolean repeat = true;
    private static double[] numSaveFreq = new double[4];
    private static String[] nameSaveFreq = new String[numSaveFreq.length];

    public static void menuRadio() {
        repeat = true;
        while (repeat) {
            System.out.println("1-  Change Frequence");
            System.out.println("2- Change Volume");
            System.out.println("3- Save Frequence");
            System.out.println("4- Exit");
            int opt = input.nextInt();
            switch (opt) {
                case 1:
                    menuChFreq();
                    break;
                case 2:
                    menuChVol();
                    break;
                case 3:
                    menuSaveFreq();
                    break;
                default:
                    repeat = false;
                    break;
            }
        }
    }

    private static void menuChVol() {
        System.out.println("Actual volume: " + Reproductor.getVolume());
        System.out.print("New volume: ");
        int newVolume = input.nextInt();
        Reproductor.chVolume(newVolume);
    }

    private static void menuChFreq() {
        System.out.println("*** RADIO ***");
        System.out.println("Actual Frequence" + FreqTune);
        System.out.print("New frequence: ");
        double optRad = input.nextDouble();
        chFreq(optRad);
    }

    private static void menuSaveFreq() {
        System.out.print("Nom: ");
        String nameFreq = input.next();
        System.out.print("Select position (1 - 5): ");
        int posFreq = input.nextInt();
        saveFreq(nameFreq, posFreq);
    }

    private static void saveFreq(String nameFreq, int posFreq) {
        numSaveFreq[posFreq - 1] = FreqTune;
        nameSaveFreq[posFreq - 1] = nameFreq;
        displaySavedFreq();
    }

    private static void chFreq(double freq) {
        FreqTune = freq;
    }

    public static void displaySavedFreq() {
        for (int i = 0; i < numSaveFreq.length; i++) {
            System.out.println(nameSaveFreq[i]);
        }
    }
}
