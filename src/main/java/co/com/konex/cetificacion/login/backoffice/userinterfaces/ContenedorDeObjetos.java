package co.com.konex.cetificacion.login.backoffice.userinterfaces;

import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class ContenedorDeObjetos {
    public static final Target USER = Target.the("Datos para campo de usuario").located(By.id("username"));
    public static final Target PASSWORD = Target.the("Datos para campo contrasenna").located(By.id("clave"));
    public static final Target BTN_VER_CONTRASENNA = Target.the("Verificar contrasenna").located(By.xpath("//em[@class='fa fa-eye font-size-16 aico-eye']"));
    public static final Target BTN_SING_IN = Target.the("Boton iniciar sesion").located(By.xpath("//span[contains(text(),'INICIAR SESIÓN')]"));
    public static final Target OPTION_EMPRESA = Target.the("Opcion empresa").located(By.xpath("//tr[@class='ng-star-inserted']"));
    public static final Target BTN_ACEPT = Target.the("Boton Aceptar").located(By.xpath("//button[@class = 'w-120-px btn-aceptar2']"));
    public static final Target HOME_VALIDATION = Target.the("Verificar ingreso").located(By.xpath("//span[contains(text(),'Inicio')]"));
    public static final Target MENSAJE_ERROR = Target.the("Mensaje error credenciales").located(By.xpath("//p[contains(text(),'Credenciales incorrectas. Inténtalo de nuevo.')]"));
}
