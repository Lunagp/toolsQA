package co.com.prueba.demoqa.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

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
        actor.attemptsTo(Scroll.to(BTN_ELEMENT));
        actor.attemptsTo(Click.on(BTN_ELEMENT));
        actor.attemptsTo(Scroll.to(BTN_DYNAMIC));
        actor.attemptsTo(Click.on(BTN_DYNAMIC));
    }
}
