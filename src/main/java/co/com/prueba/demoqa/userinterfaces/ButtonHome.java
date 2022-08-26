package co.com.prueba.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ButtonHome {

    public static final Target BTN_ELEMENT = Target.the("botón opción elementos").located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
    public static final Target BTN_DYNAMIC = Target.the("botón opción dynamic properties").located(By.id("item-8"));
    public static final Target BTN_COLOR = Target.the("botón opción color").located(By.xpath("//*[@id=\"colorChange\"]"));


}
