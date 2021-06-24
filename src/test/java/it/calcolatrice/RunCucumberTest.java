package it.calcolatrice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        //tags = {"@Math"},
        glue = "it.calcolatrice.cucumber",
        plugin = {"html:testreportdir","json:testreportdir/testreport.json"}
)
public class RunCucumberTest { }
