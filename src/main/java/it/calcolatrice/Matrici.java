package it.calcolatrice;

import java.util.Random;

public class Matrici {
    private static int[][] matrix = new int [5][5];
    private static int bound = 10;


    public Matrici (int[][] matrix){
        this.matrix = matrix;
    }

    public static void orizzontale(int bound){
        caricaMatrice(matrix);
        stampaOrizzontale(matrix);
    }

    public static void verticale(int bound){
        caricaMatrice(matrix);
        stampaVerticale(matrix);
    }

    public static void caricaMatrice(int[][] matrix){
        Random random = new Random();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextInt(bound);
            }
        }
    }

    /*public int[][] caricaMatrice(){
        Random random = new Random();
        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < this.matrix[i].length; j++){
                this.matrix[i][j] = random.nextInt(20);
            }
        }
    }*/

    public static void stampaOrizzontale(int[][] matriz){
        System.out.println(" STAMPA ORIZZONTALE :");
        for (int row = 0; row < matrix.length; row++) {
            System.out.println();
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(" |" + matrix[row][col] + "| ");
            }
        }
    }


    public static void stampaVerticale(int[][] matrix){
        System.out.println();
        System.out.println("\n " + "STAMPA VERTICALE : ");
        for (int row = 0; row < matrix.length; row++) {
            System.out.println();
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println(" [ " + row + " ] [ " + col + " ] -> " + matrix[row][col]);
            }
        }
    }


}
