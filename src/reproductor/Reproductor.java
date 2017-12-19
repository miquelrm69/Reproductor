/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductor;

/**
 *
 * @author miquel
 */
public class Reproductor {
    
    private static int speakers, currentVolume = 10;
    public static enum modeTypes {CD, RADIO, EXT, USB};
    private static modeTypes currentMode;
    
    public Reproductor() {
        speakers = 2;
        currentMode = modeTypes.RADIO;
    }
    
    void display() {
        System.out.println("Mode: " + currentMode + " / Vol: " + currentVolume);
    }
    
    void setMode(int m) {
        switch (m) {
            case 1:
                currentMode = modeTypes.CD;
                display();
                break;
            case 2:
                currentMode = modeTypes.RADIO;
                display();
                break;
            case 3:
                currentMode = modeTypes.EXT;
                display();
                break;
            case 4:
                currentMode = modeTypes.USB;
                display();
                break;
            default:
                System.out.println("Out of possible modes!");
                break;
        }
    }
    
    static void setVolume (int v) {
        if (v > 100) {
            System.out.println("Max Volume is 100!");
        } else {
            currentVolume = v;
        }
    }
    
    int getVolume() {
        return currentVolume;
    }
    
    modeTypes getMode() {
        return currentMode;
    }
}
