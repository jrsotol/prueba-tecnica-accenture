package co.com.test.questions;

import co.com.test.userinterface.GoogleTraductorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Created by Candado on 02/10/2019.
 */
public class LaRespuesta implements Question<String>{

    public static LaRespuesta es() {
        return new LaRespuesta();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(GoogleTraductorPage.AREA_TRADUCIDA).viewedBy(actor).asString();
    }
}
