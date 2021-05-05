import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scelta = new Scanner(System.in);
        boolean continua = true;
        int s, j, stampa, riga, col, op;

        do{
            System.out.println("------------------------");
            System.out.println("-       ESERCIZIO      -");
            System.out.println("------------------------");
            System.out.println("1) Esercizio matrice :  ");
            System.out.println("2) Esercizio piramidi : ");
            System.out.println("3) Calcolatrice : ");
            System.out.println("------------------------");
            System.out.println("0) Esci");
            System.out.println("------------------------");
            System.out.println("Effettua una scelta ->  ");
            s = scelta.nextInt();

            switch(s){
                case 0:
                    System.out.println("----Uscita dal menù----");
                    break;
                case 1:
                    System.out.println("Inserisci righe : ");
                    riga = scelta.nextInt();
                    System.out.println("Inserisci colonne : ");
                    col = scelta.nextInt();
                    int[][] matrice = new int[riga][col];
                    //matrice = Matrici.caricaMatrice(riga, col);
                    System.out.println("\n SCEGLI (0) STAMPA VERTICALE O (1) ORIZZONTALE");
                    stampa = scelta.nextInt();
                    switch(stampa){
                        case 0:
                            Matrici.stampaVerticale(matrice);
                            break;
                        case 1:
                            Matrici.stampaOrizzontale(matrice);
                            break;
                        default :
                            System.out.println("Errore.");
                    }
                    break;
                case 2:
                    System.out.println("Esercizio Piramide : ");
                    System.out.println("Numero righe da stampare :  ");
                    j = scelta.nextInt();
                    Piramidi.stampaPiramide(j);
                    break;
                case 3:
                    System.out.println("INSERISCI LE OPERAZIONI CHE VUOI FARE SULLA CALCOLATRICE : ");
                    System.out.println("1 ADDIZIONE : ");
                    System.out.println("2 SOTTRAZIONE  : ");
                    System.out.println("3 DIVISIONE  : ");
                    System.out.println("4 MOLTIPLICAZIONE  : ");
                    op = scelta.nextInt();
                    System.out.println(" Inserisci il primo valore : ");
                    int a = scelta.nextInt();
                    System.out.println(" Inserisci il secondo valore : ");
                    int b = scelta.nextInt();
                    switch(op){
                        case 1:
                            System.out.println(" " + a + " + " + b + " " + Operazioni.Somma(a,b));break;
                        case 2:
                            System.out.println(" " + a + " - " + b + " " + Operazioni.Sottrazione(a,b));
                            break;
                        case 3:
                            System.out.println(" " + a + " : " + b + " " + Operazioni.Divisione(a,b));
                            break;
                        case 4:
                            System.out.println(" " + a + " * " + b + " " + Operazioni.Moltiplicazione(a,b));
                            break;
                    }
                    break;

                default:
                    System.out.println("Inserire un nuero tra 0 e 3");
            }
        }while(continua);



    }

    private static void esMatrici(){
        int[][] matrix = new int[5][5];
        Matrici.caricaMatrice(matrix);
        Matrici.stampaOrizzontale(matrix);
        Matrici.stampaVerticale(matrix);
    }

}