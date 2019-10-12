package co.com.test.tasks;

import co.com.test.userinterface.GoogleTraductorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class Abrir implements Task{

    private GoogleTraductorPage googleTraductorPage;


    public static Abrir LaPaginaDeGoogle() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(googleTraductorPage));

    }
}
