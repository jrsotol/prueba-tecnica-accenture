package co.com.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CrearUsuarioPage extends PageObject {

    public static final Target CAMPO_NOMBRE = Target.the("Campo donde se ingresa el nombre del usuario").located(By.xpath("//input[@id='firstName']"));
    public static final Target CAMPO_APELLIDOS = Target.the("Campo para apellidos").located(By.xpath("//input[@id='lastName']"));
    public static final Target CAMPO_EMAIL = Target.the("Campo para correo eletronico").located(By.xpath("//input[@id='email']"));
    public static final Target LISTA_MES = Target.the("Lista de los meses").located(By.xpath("//select[@id='birthMonth']//option[@value='number:10']"));
    public static final Target LISTA_DIA = Target.the("Lista de los dias").located(By.xpath("//select[@id='birthDay']//option[@value='number:25']"));
    public static final Target LISTA_AÑO = Target.the("Lista de los años").located(By.xpath("//select[@id='birthYear']//option[@value='number:1980']"));
    public static final Target CAMPO_LENGUAJE = Target.the("Campo para elegir el lenguaje").located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target BOTON_SIGUIENTE = Target.the("Boton siguiente").located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target BOTON_SIGUIENTED = Target.the("Btn para seguir con el proceso").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target LISTA_MOVILES = Target.the("lista para elegir la clase de movil").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target ELEGIR_MOVIL = Target.the("Elegir movil").located(By.xpath("//*[@id=\"ui-select-choices-row-6-1\"]/span"));
    public static final Target BOTON_SIGUIENTET = Target.the("Btn para seguir con el proceso").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target CAMPO_CONTRASEÑA = Target.the("Campo para crear contraseña").located(By.xpath("//input[@id='password']"));
    public static final Target CAMPO_CONFIRMA_CONTRASEÑA = Target.the("Campo para confirmar la contraseña").located(By.xpath("//input[@id='confirmPassword']"));
    public static final Target ACEPTA_TERMINOS_UTEST = Target.the("aceptar terminos de utest").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ACEPTA_TERMINOS_PRIVACIDAD = Target.the("aceptar terminos de privacidad").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_COMPLETADO = Target.the("boton para completar el registro").located(By.xpath("//a[@id='laddaBtn']"));
    public static final Target MENSAJE_VERIFICACION = Target.the("verificacion de la prueba").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
