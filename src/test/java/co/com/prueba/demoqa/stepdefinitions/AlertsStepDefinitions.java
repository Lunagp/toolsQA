package co.com.prueba.demoqa.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.aspectj.apache.bcel.classfile.Module;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class AlertsStepDefinitions {

    @Given("^go to the website \"string\"$")
    public void go_to_the_website(String url) {
        setTheStage(new OnlineCast());
        Actor luna = Actor.named("luna");
        theActorCalled(String.valueOf(luna)).wasAbleTo(Open.url(url));
    }

    @When("^click to see how each alert works$")
    public void click_to_see_how_each_alert_works() {

    }

    @Then("^verification message$")
    public void verification_message() {

    }

}
