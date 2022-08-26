package co.com.prueba.demoqa.tasks;

import co.com.prueba.demoqa.interactions.ClickButtonDynamic;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static co.com.prueba.demoqa.userinterfaces.ButtonHome.BTN_DYNAMIC;
import static co.com.prueba.demoqa.userinterfaces.ButtonHome.BTN_ELEMENT;
import static net.serenitybdd.screenplay.Tasks.instrumented;


@AllArgsConstructor
public class SelectButton implements Task {


    private final Map<String,String> mapSelectButton;

    public static SelectButton inThePage(Map<String,String> mapSelectButton){
        return instrumented(SelectButton.class,mapSelectButton );
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickButtonDynamic.inThePage(mapSelectButton));
    }
}
