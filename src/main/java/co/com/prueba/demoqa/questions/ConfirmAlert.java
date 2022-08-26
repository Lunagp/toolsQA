package co.com.prueba.demoqa.questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Map;

import static co.com.prueba.demoqa.userinterfaces.AlertsHome.*;

@AllArgsConstructor
public class ConfirmAlert implements Question<Boolean> {

    private final Map<String, String> mapConfirm;

    public static ConfirmAlert confirm(Map<String, String> mapConfirm){
        return new ConfirmAlert(mapConfirm);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_ALERT3.resolveFor(actor).getText().contains(mapConfirm.get("confirm"));
    }
}
