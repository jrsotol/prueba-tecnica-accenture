package co.com.test.tasks;

import co.com.test.userinterface.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    private UtestHomePage utestHomePage;


    public static Abrir pagina() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(utestHomePage));
        actor.attemptsTo(Click.on(UtestHomePage.BOTON_AGREGAR_USUARIO));

    }
}
