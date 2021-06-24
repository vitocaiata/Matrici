package it.calcolatrice;

public class Piramidi {
    public static void stampaPiramide(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (i*2-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
