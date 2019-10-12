package co.com.test.stepdefinitions;

import co.com.test.questions.LaRespuesta;
import co.com.test.tasks.Abrir;
import co.com.test.tasks.Traducir;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

/**
 * Created by Candado on 01/10/2019.
 */
public class TraductorGoogleStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor romel = Actor.named("Romel");


    @Before
    public void configuracionInicial(){
    romel.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^that Romel want to use Google Translate$")
    public void thatRomelWantToUseGoogleTranslate()  {
        romel.wasAbleTo(Abrir.LaPaginaDeGoogle());

    }


    @When("^he translate the word (.*) from Espanish to English$")
    public void heTranslateTheWordMesaFromEspanishToEnglish(String palabra)  {
        romel.attemptsTo(Traducir.DeEspañolAInglesLa(palabra));
   }

    @Then("^he should see the word (.*) on the screen$")
    public void heShouldSeeTheWordTableOnTheScreen(String palabraEsperada)  {
        romel.should(GivenWhenThen.seeThat(LaRespuesta.es(), Matchers.equalTo(palabraEsperada)));

    }

}
