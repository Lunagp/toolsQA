package co.com.prueba.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AlertsHome {

    public static final Target BTN_ALERT1 = Target.the("Click Button to see alert").located(By.xpath("//*[@id=\"alertButton\"]"));
    public static final Target BTN_ALERT2 = Target.the("On button click, alert will appear after 5 seconds").located(By.xpath("//*[@id=\"timerAlertButton\"]"));
    public static final Target BTN_ALERT3 = Target.the("On button click, confirm box will appear").located(By.xpath("//*[@id=\"confirmButton\"]"));
    public static final Target BTN_ALERT4 = Target.the("On button click, prompt box will appear").located(By.xpath("//*[@id=\"promtButton\"]"));
    public static final Target TXT_ALERT4 = Target.the("On button click, prompt box will appear RESULT").located(By.xpath("//*[@id=\"promptResult\"]"));
    public static final Target TXT_ALERT3 = Target.the("On button click, confirm box will appear RESULT").located(By.xpath("//*[@id=\"confirmResult\"]"));

}
