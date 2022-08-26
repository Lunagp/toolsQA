package co.com.prueba.demoqa.stepdefinitions;

import co.com.prueba.demoqa.tasks.SelectButton;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class PDemoqaStepDefinition {

    @Managed
    WebDriver hisbrowser;

    @Before
    public void setIni(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Andres");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisbrowser));
    }
    @Given("that Andres open de browser and enter the page {string}")
    public void that_andres_open_de_browser_and_enter_the_page(String url) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }



    @When("he select to the element option and the category dynamic properties")
    public void he_select_to_the_element_option_and_the_category_dynamic_properties(Map<String,String> mapData) {
            OnStage.theActorInTheSpotlight().attemptsTo(SelectButton.inThePage(mapData));
    }
    @Then("He should see on the screen the selected button")
    public void he_should_see_on_the_screen_the_selected_button() {

    }


}
