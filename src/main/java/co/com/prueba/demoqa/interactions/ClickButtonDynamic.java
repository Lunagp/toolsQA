package co.com.prueba.demoqa.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Map;

import static co.com.prueba.demoqa.userinterfaces.ButtonHome.BTN_COLOR;
import static co.com.prueba.demoqa.userinterfaces.ButtonHome.BTN_VISIBILITY;
import static net.serenitybdd.screenplay.Tasks.instrumented;


@AllArgsConstructor
public class ClickButtonDynamic implements Interaction {

    private final Map<String,String> mapSelectButton;

    public static ClickButtonDynamic inThePage(Map<String,String> mapSelectButton){
        return instrumented(ClickButtonDynamic.class, mapSelectButton);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (mapSelectButton.get("button_option").contains("color")){
            actor.attemptsTo(Click.on(BTN_COLOR));
        }
        if (mapSelectButton.get("button_option").contains("visible")){
            actor.attemptsTo(Click.on(BTN_VISIBILITY));
            System.out.println("botón visible clickeado");
        }

    }
}
