package it.calcolatrice.cucumber;

import com.sun.org.apache.xerces.internal.util.PropertyState;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import it.calcolatrice.calcolatrice.Operazioni;

import static org.junit.jupiter.api.Assertions.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CalculatorSteps {

    private Operazioni operazioni = new Operazioni();
    private int a = 0;
    private int b = 0;

    @Given("^two number (.*) and (.*)$")
    public void insertNumber(int a, int b){
        try{
            this.a = Integer.parseInt(String.valueOf(a));
            this.b = Integer.parseInt(String.valueOf(b));
        }catch(NumberFormatException e){
            fail(e.getMessage());
        }
    }

    @Then("^the sum is (.*)$")
    public void checkSum(int result){
        assertThat(result, equalTo(operazioni.Somma(a,b)));
    }

    @Then("^the difference is (.*)")
    public void checkDifference(int result){
        assertThat(result, equalTo(operazioni.Sottrazione(a,b)));
    }

    @Then("^the multiply is (.*)")
    public void checkMultiply(int result){
        assertThat(result, equalTo(operazioni.Moltiplicazione(a,b)));
    }

    @Then("^the division is (.*)")
    public void checkDivide(int result){
        assertThat(result, equalTo(operazioni.Divisione(a,b)));
    }


}
