package co.com.test.tasks;

import co.com.test.userinterface.GoogleTraductorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Traducir implements Task{
    private String palabra;

    public Traducir(String palabra) {
        super();
        this.palabra = palabra;
    }

    public static Traducir DeEspañolAInglesLa(String palabra) {
        return Tasks.instrumented(Traducir.class, palabra);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

         actor.attemptsTo(Click.on(GoogleTraductorPage.OPCION_ESPAÑOL));
         actor.attemptsTo(Click.on(GoogleTraductorPage.OPCION_INGLES));
         actor.attemptsTo(Enter.theValue(palabra).into(GoogleTraductorPage.AREA_DE_TRADUCCION));
         actor.attemptsTo(Click.on(GoogleTraductorPage.AREA_DE_TRADUCCION));
         actor.attemptsTo(Click.on(GoogleTraductorPage.AREA_TRADUCIDA));

    }}


