package co.com.test.questions;

import co.com.test.userinterface.CrearUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElMensaje implements Question<String> {


    public static Question es() {
        return new ElMensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CrearUsuarioPage.MENSAJE_VERIFICACION).viewedBy(actor).asString();
    }
}
