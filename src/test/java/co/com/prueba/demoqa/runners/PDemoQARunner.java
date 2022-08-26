package co.com.prueba.demoqa.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/pdemoqa.feature",
        glue = "co/com/prueba/demoqa/stepdefinitions"
)
public class PDemoQARunner {
}
