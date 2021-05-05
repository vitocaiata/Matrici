import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[3][4];

        System.out.println(" STAMPA ORIZZONTALE :");
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
                System.out.print(" |" + array[i][j] + "| ");
            }
        }
        System.out.println();
        System.out.println("\n " + "STAMPA VERTICALE : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
                System.out.println(" [ " + i + " ] [ " + j + " ] -> " + array[i][j]);
            }
        }
    }
}