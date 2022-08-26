package co.com.prueba.demoqa.stepdefinitions;


import co.com.prueba.demoqa.questions.ConfirmAlert;
import co.com.prueba.demoqa.tasks.ClickAlerts;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AlertsStepDefinitions {

    @Before
    public void initialize(){
        setTheStage(new OnlineCast());
    }
    @Given("go to the website {string}")
    public void go_to_the_website(String url) {
        Actor luna = Actor.named("luna");
        theActorCalled(String.valueOf(luna)).wasAbleTo(Open.url(url));
    }

    @When("click to see how each alert works")
    public void click_to_see_how_each_alert_works() {
        theActorInTheSpotlight().attemptsTo(ClickAlerts.alerts());
    }
    @Then("verification message")
    public void verification_message(Map<String, String> mapConfirm) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ConfirmAlert.confirm(mapConfirm),
                Matchers.equalTo(Boolean.TRUE)));
    }

}
