package co.com.konex.cetificacion.login.backoffice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContenedordeObjetosLoteria {

    public static final Target BTN_LOTERIAS = Target.the("Submodulo loterias").located(By.xpath("//a[@href='#/autenticado/escrutinio/loterias']"));
    public static final Target BTN_CREAR_LOTERIA = Target.the("boton para crear loteria").located(By.xpath("//button[@class='button-global button-add-red']"));
    public static final Target CODIGO = Target.the("campo codigo").located(By.id("codigoL"));
    public static final Target NOMBRE_LARGO = Target.the("campo nombre largo").located(By.id("largo"));
    public static final Target NOMBRE_CORTO = Target.the("campo nombre corto").located(By.id("corto"));
    public static final Target TELEFONO = Target.the("campo telefono loteria").located(By.id("telefono"));
    public static final Target CHECK_PRODUCTO = Target.the("check producto chance").locatedBy("//label[contains(text(),'SUPER ASTRO')]");
    public static final Target IMAG_LOTERIA = Target.the("Imagen de la loteria").located(By.xpath("(//div[@class='row ng-star-inserted'])[13]"));

    public static final Target ESTADO_LOTERIA = Target.the("estado de la loteria").located(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
    public static final Target BTN_GUARDAR_LOTERIA = Target.the("boton guardar loteria").located(By.id("btn-guardar-o-editar-escrutinio-loteria"));
}
