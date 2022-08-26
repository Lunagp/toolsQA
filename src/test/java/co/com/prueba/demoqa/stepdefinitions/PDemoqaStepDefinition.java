package co.com.prueba.demoqa.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class PDemoqaStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setIni(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Andres");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that 'Andres' open de browser and enter the page$")
    public void that_Andres_open_de_browser_and_enter_the_page() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/"));
    }

    @When("^he select to the element option and the category dynamic properties$")
    public void he_select_to_the_element_option_and_the_category_dynamic_properties() {

    }

    @Then("^He should see on the screen the selected button$")
    public void he_should_see_on_the_screen_the_selected_button() {

    }
}
