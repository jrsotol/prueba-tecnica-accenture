package co.com.test.userinterface;

import co.com.test.tasks.Traducir;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://translate.google.com/?hl=es")

public class GoogleTraductorPage extends PageObject{

    public static final Target OPCION_INGLES = Target.the("boton del idioma origen")
            .located(By.id("sugg-item-es"));

    public static final Target OPCION_ESPAÑOL = Target.the("El segundo Idioma")
            .located(By.id("sugg-item-en"));

    public static final Target AREA_DE_TRADUCCION = Target.the(" El lugar donde se escribe la palabra a traducir")
            .located(By.id("source"));
    public static final Target AREA_TRADUCIDA = Target.the("El area donde se presenta la palabra traducida").located(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]"));
}
