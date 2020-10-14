package co.com.test.tasks;

import co.com.test.userinterface.CrearUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.net.CacheRequest;
import java.util.List;

public class Crear implements Task {

    private CrearUsuarioPage crearUsuarioPage;
    private List<String> data;

    public Crear(List<String> data){
        this.data= data;
    }

    public static Crear Usuario(List<String> data) {
        return Tasks.instrumented(Crear.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(data.get(0)).into(CrearUsuarioPage.CAMPO_NOMBRE));
        actor.attemptsTo(Enter.theValue(data.get(1)).into(CrearUsuarioPage.CAMPO_APELLIDOS));
        actor.attemptsTo(Enter.theValue(data.get(2)).into(CrearUsuarioPage.CAMPO_EMAIL));
        actor.attemptsTo(Click.on(CrearUsuarioPage.LISTA_MES));
        actor.attemptsTo(Click.on(CrearUsuarioPage.LISTA_DIA));
        actor.attemptsTo(Click.on(CrearUsuarioPage.LISTA_AÑO));
        actor.attemptsTo(Enter.theValue(data.get(3)).into(CrearUsuarioPage.CAMPO_LENGUAJE));
        actor.attemptsTo(Click.on(CrearUsuarioPage.BOTON_SIGUIENTE));
        actor.attemptsTo(Click.on(CrearUsuarioPage.BOTON_SIGUIENTED));
        actor.attemptsTo(Click.on(CrearUsuarioPage.LISTA_MOVILES));
        actor.attemptsTo(Click.on(CrearUsuarioPage.ELEGIR_MOVIL));
        actor.attemptsTo(Click.on(CrearUsuarioPage.BOTON_SIGUIENTET));
        actor.attemptsTo(Enter.theValue(data.get(4)).into(CrearUsuarioPage.CAMPO_CONTRASEÑA));
        actor.attemptsTo(Enter.theValue(data.get(5)).into(CrearUsuarioPage.CAMPO_CONFIRMA_CONTRASEÑA));
        actor.attemptsTo(Click.on(CrearUsuarioPage.ACEPTA_TERMINOS_UTEST));
        actor.attemptsTo(Click.on(CrearUsuarioPage.ACEPTA_TERMINOS_PRIVACIDAD));
        actor.attemptsTo(Click.on(CrearUsuarioPage.BOTON_COMPLETADO));
    }
}
