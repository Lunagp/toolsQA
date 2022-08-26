package co.com.prueba.demoqa.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static co.com.prueba.demoqa.userinterfaces.AlertsHome.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ClickAlerts implements Task {

    WebDriver hisBrowser;

    public static ClickAlerts alerts(){
        return instrumented(ClickAlerts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BTN_ALERT3));
        //hisBrowser.switchTo().alert().sendKeys("hola");
        hisBrowser.switchTo().alert().accept();


    }
}
