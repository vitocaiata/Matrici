import java.util.Random;

public class Matrici {
    private int[][] matrix;
    private int bound = 10;


    public Matrici (int[][] matrix){
        this.matrix = matrix;
    }

    public int[][] caricaMatrice(){
        Random random = new Random();
        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < this.matrix[i].length; j++){
                this.matrix[i][j] = random.nextInt(this.bound);
            }
        }
        return this.matrix;
    }

    /*public int[][] caricaMatrice(){
        Random random = new Random();
        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < this.matrix[i].length; j++){
                this.matrix[i][j] = random.nextInt(20);
            }
        }
    }*/

    public int[][] stampaOrizzontale(){
        System.out.println(" STAMPA ORIZZONTALE :");
        for (int row = 0; row < this.matrix.length; row++) {
            System.out.println();
            for (int col = 0; col < this.matrix[row].length; col++) {
                System.out.print(" |" + this.matrix[row][col] + "| ");
            }
        }
        return this.matrix;
    }

    public int[][] stampaVerticale(){
        System.out.println();
        System.out.println("\n " + "STAMPA VERTICALE : ");
        for (int row = 0; row < this.matrix.length; row++) {
            System.out.println();
            for (int col = 0; col < this.matrix[row].length; col++) {
                System.out.println(" [ " + row + " ] [ " + col + " ] -> " + this.matrix[row][col]);
            }
        }
        return this.matrix;
    }


}
