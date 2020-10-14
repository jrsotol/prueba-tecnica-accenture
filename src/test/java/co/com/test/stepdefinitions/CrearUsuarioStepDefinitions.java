package co.com.test.stepdefinitions;

import co.com.test.questions.ElMensaje;
import co.com.test.tasks.Abrir;
import co.com.test.tasks.Crear;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CrearUsuarioStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor jorge = Actor.named(" Jorge");

    @Before
    public void configuracionInicial(){
        jorge.can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("^que jorge desea ingresar a la pagina de utest\\.com$")
    public void queJorgeDeseaIngresarALaPaginaDeUtestCom()  {

        jorge.wasAbleTo(Abrir.pagina());

    }


    @Cuando("^el ingrese a la pagina debe crear un usuario con los datos solicitados$")
    public void elIngreseALaPaginaDebeCrearUnUsuarioConLosDatosSolicitados(List<String> data)  {

        jorge.attemptsTo(Crear.Usuario(data));

    }

    @Entonces("^el deberia ver en pantalla el (.*) de usuario creado$")
    public void elDeberiaVerEnPantallaElMensajeDeUsuarioCreado(String mensaje)  {

        jorge.should(GivenWhenThen.seeThat(ElMensaje.es(), Matchers.equalTo(mensaje)));



    }
}
