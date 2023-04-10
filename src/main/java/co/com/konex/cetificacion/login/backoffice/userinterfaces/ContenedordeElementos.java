package co.com.konex.cetificacion.login.backoffice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContenedordeElementos {
    public static final Target USER = Target.the("Datos para campo de usuario").located(By.id("username"));
    public static final Target PASSWORD = Target.the("Datos para campo contrasenna").located(By.id("clave"));
    public static final Target BTN_SING_IN =Target.the("Boton iniciar sesion").located(By.xpath("//span[contains(text(),'INICIAR SESIÓN')]"));
    public static final Target MENSAJE_ERROR = Target.the("Mensaje error credenciales").located(By.xpath("//p[contains(text(),'Credenciales incorrectas. Inténtalo de nuevo.')]"));
}
