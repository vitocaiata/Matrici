package it.calcolatrice.calcolatrice;

import java.math.BigInteger;
import java.util.Scanner;

public class Operazioni {

    public static int Somma(int a, int b){
        return a+b;
    }

    public static int Sottrazione(int a, int b){
        return a-b;
    }

    public static int Divisione(int a, int b){
        return a/b;
    }

    public static int Moltiplicazione(int a, int b){
        return a*b;
    }

    public static boolean primo(int n) {
        for (int i=2; i<n; i++) {
            if (n%i==0) {
                return false;
            }
        }
        if (n<2) {
            return false;
        }
        return true;
    }

    public static void numeroPrimo() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci numero: ");
        int w = scan.nextInt();
        if (primo(w))
            System.out.println("Il numero è primo!");
        else
            System.out.println("Il numero non è primo!");
        }

    public static void numeroFattoriale(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci numero: ");
        int numero = scan.nextInt();
        System.out.println("Risultato è : " + fattoriale(numero));
    }

    public static BigInteger fattoriale(int numero){
        BigInteger fattoriale = BigInteger.ONE;
        for(int i = 1;i<=numero;i++){
            fattoriale = fattoriale.multiply(BigInteger.valueOf(i));
        }
        return fattoriale;
    }

}





