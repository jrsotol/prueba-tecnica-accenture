package co.com.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/")

public class UtestHomePage extends PageObject {

    public static final Target BOTON_AGREGAR_USUARIO = Target.the("Boton para ingresar a crear un usuario").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));


}