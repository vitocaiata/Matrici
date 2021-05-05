import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        boolean continua = true;
        Piramidi piramidi = null;
        Matrici matrici = null;

        while(continua) {
            int scelta = this.schermoMenu();
            if(scelta == 0) {
                continua = false;
            }
            if(scelta == 1) {
                System.out.println("--- Esercizio Matrici ---");
            }
            if(scelta == 2) {
                System.out.println("--- Esercizio Piramidi ---");
            }
        }
        System.out.println("Arrivederci...");
    }

    private int schermoMenu() {
        System.out.println("------------------------");
        System.out.println("-   ESERCIZIO    -");
        System.out.println("------------------------");
        System.out.println("1) esercizio matrice : ");
        System.out.println("2) Esercizio piramidi");
        System.out.println("------------------------");
        System.out.println("0) Esci");
        System.out.println("------------------------");
        System.out.println("Effettua una scelta -> ");
        Scanner scelta = new ;
        while (scelta < 0 || scelta > 2) {
            System.out.println("Scelta non corretta. Ripeti la scelta -> ");
            scelta = Console.leggiIntero();
        }
        return scelta;
    }
}