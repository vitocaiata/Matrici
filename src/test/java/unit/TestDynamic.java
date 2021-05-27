package unit;
import calcolatrice.Operazioni;
import matrici.Matrici;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import piramide.Piramidi;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class TestDynamic{

    private final Operazioni operazioni = new Operazioni();

    @TestFactory
    Collection<DynamicTest> dynamicTestOperazioni() {
        BigInteger num = BigInteger.valueOf(120);
        return Arrays.asList(
                dynamicTest("1 somma", () -> assertEquals(4, operazioni.Somma(1,3))),
                dynamicTest("2 sottrazione", () -> assertEquals(4, operazioni.Sottrazione(10,6))),
                dynamicTest("3 moltiplicazione", () -> assertEquals(25, operazioni.Moltiplicazione(5,5))),
                dynamicTest("4 divisione", () -> assertEquals(4, operazioni.Divisione(24,6))),
                dynamicTest("5 fattoriale", () -> assertEquals(num,Operazioni.fattoriale(5)))
        );
    }

    @TestFactory
    Collection<DynamicTest> dynamicTestMatricePiramide() {
        return Arrays.asList(
                dynamicTest("1 stampa orizzontale", ()-> Matrici.orizzontale(5)),
                dynamicTest("2 stampa verticale", ()-> Matrici.verticale(5)),
                dynamicTest("3 stampa piramide", ()-> Piramidi.stampaPiramide(5))
        );
    }
}
