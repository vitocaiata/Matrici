package unit;

import matrici.Matrici;
import org.junit.jupiter.api.*;
import calcolatrice.Operazioni;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import piramide.Piramidi;
import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.ArrayList;

public class Test {
    @BeforeAll
    static void beforeAll(){
    }

    @BeforeEach
    void beforeEach(){
        Operazioni operazioni = new Operazioni();
        Piramidi piramide = new Piramidi();
    }


    @ParameterizedTest(name = "bound: {0}")
    @ValueSource(ints = {5,4})
    @DisplayName("Test matrice orizzontale")
    @Order(5)
    @Tag("matrice")
    void matriceOr(int valore){
       Matrici.orizzontale(valore);
    }

    @ParameterizedTest(name = "bound: {0}")
    @ValueSource(ints = {5,4})
    @DisplayName("Test matrice orizzontale")
    @Order(5)
    @Tag("matrice")
    void matriceVer(int valore){
        Matrici.verticale(valore);
    }

    @ParameterizedTest(name = "base: {0}")
    @ValueSource(ints = {5})
    @DisplayName("Test piramidi")
    @Order(7)
    @Tag("piramide")
    void piramide(int valore){
        Piramidi.stampaPiramide(valore);
    }

    @ParameterizedTest(name = "somma: {0}")
    @ValueSource(ints = {5,7,9})
    @DisplayName("somma")
    @Order(1)
    @Tag("calcolatrice")
    public void somma(int a){
        int somma = Operazioni.Somma(a,a);
        System.out.println("Somma = " + somma);
    }

    @ParameterizedTest(name = "somma: {0}")
    @CsvSource({"1,3"})
    @DisplayName("somma con csv")
    @Order(1)
    @Tag("calcolatrice")
    public void sommaCsv(int a, int b){
        int somma = Operazioni.Somma(a,b);
        System.out.println("Somma = " + somma);
        assertEquals(4,somma);
    }

    @ParameterizedTest(name = "moltiplicazione: {0}")
    @ValueSource(ints = {5,7,9})
    @DisplayName("moltiplicazione")
    @Order(2)
    @Tag("calcolatrice")
    public void moltiplicazione(int a){
        int somma = Operazioni.Moltiplicazione(a,a);
        System.out.println("moltiplicazione = " + somma);
    }

    @ParameterizedTest(name = "sottrazione: {0}")
    @ValueSource(ints = {5,7,9})
    @DisplayName("sottrazione")
    @Order(3)
    @Tag("calcolatrice")
    public void sottrazione(int a){
        int somma = Operazioni.Sottrazione(a,a);
        System.out.println("Sottrazione = " + somma);
    }

    @ParameterizedTest(name = "divisione: {0}")
    @ValueSource(ints = {5,7,9})
    @DisplayName("divisione")
    @Order(4)
    @Tag("calcolatrice")
    public void divisione(int a){
        int somma = Operazioni.Divisione(a,a);
        System.out.println("divisione = " + somma);
    }

    @ParameterizedTest(name = "numero primo: {0}")
    @ValueSource(ints = {5,7,9})
    @DisplayName("numero primo")
    @Order(5)
    @Tag("numeroPrimo")
    public void numeroprimo(int a){
        Operazioni.primo(a);
    }

    @ParameterizedTest(name = "numero fattoriale: {0} [{1}]")
    @ValueSource(ints = {5,7,9})
    @DisplayName("numero fattoriale")
    @Order(6)
    @Tag("fattoriale")
    public void numeroFattoriale(int a){
        BigInteger num = Operazioni.fattoriale(a);
        System.out.println(num);
        assertEquals(num,Operazioni.fattoriale(a));
    }

    @ParameterizedTest(name = "numero fattoriale: {0} [{1}]")
    @DisplayName("numero fattoriale con csv")
    @CsvSource({"5,120", "7,5040"})
    @Order(6)
    @Tag("fattoriale")
    public void numeroFatt(int a, int ris){
        BigInteger num = BigInteger.valueOf(ris);
        System.out.println(num);
        assertEquals(num,Operazioni.fattoriale(a));
    }

    @AfterEach
    void afterEach(){}

    @AfterAll
    static void afterAll(){}



}
