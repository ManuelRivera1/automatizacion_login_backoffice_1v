package co.com.konex.cetificacion.login.backoffice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContenedordeObjetosSorteo {

    public static final Target MDL_ESCRUTINIO = Target.the("Modulo de escrutinio").located(By.xpath("//div[contains(text(),'Escrutinio')]"));
    public static final Target SML_SORTEO = Target.the("Submodulo sorteo").located(By.xpath("//a[@href='#/autenticado/escrutinio/calendario-sorteos']"));
    public static final Target BTN_CREAR_SORTEO = Target.the("Boton crear sorteo+").located(By.xpath("//button[@class='button-global button-add-red']"));
    public static final Target FECHA_INICIAL = Target.the("campo fecha inicial sorteo").located(By.id("fcinit"));

    public static final Target MES_INICIO = Target.the("mes inicial del sorteo").located(By.xpath("//option[contains(text(),'Julio')]"));
    public static final Target ANNO_INICIO = Target.the("Anno inicial del sorteo").located(By.xpath("//option[contains(text(),'2023')]"));

    public static final Target DIA_INICIO = Target.the("dia inicio del sorteo").located(By.xpath("//a[contains(text(),'10')]"));
    public static final Target FECHA_FINAL = Target.the("campo fecha final sorteo").located(By.id("fcfinal"));
    public static final Target MES_FINAL = Target.the("mes final sorteo").located(By.xpath("//option[contains(text(),'Agosto')]"));

    public static final Target ANNO_FINAL = Target.the("anno final sorteo").located(By.xpath("//option[contains(text(),'2023')]"));
    public static final Target DIA_FINAL = Target.the("dia inicio del sorteo").located(By.xpath("//a[contains(text(),'10')]"));
    public static final Target LOTERIA = Target.the("campo loteria").located(By.xpath("//label[contains(text(),'Seleccione una Opción')]"));
    public static final Target SELECCIONAR_LOTERIA = Target.the("Seleccionar loteria").located(By.xpath("//span[contains(text(),'SANTANDER')]"));
    public static final Target NUM_SORTEO = Target.the("campo numero sorteo").located(By.xpath("//input[@inputid='isorteo']"));
    public static final Target NUM_INCRE_SORTEO = Target.the("campo numero incremental sorteo").located(By.xpath("//input[@inputid='incremental']"));
    public static final Target BTN_SGTE = Target.the("botón siguiente").located(By.xpath("//label[contains(text(),'Siguiente ')]"));
    public static final Target CHECK_APLICAR_TODOS = Target.the("check aplicar a todos los días").located(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]"));
    public static final Target HORA_SORTEO = Target.the("hora sorteo").located(By.xpath("//input[@class='input-app-sm ml-2']"));
    public static final Target BTN_SGTE_STEP_DOS = Target.the("boton siguiente step dos de crear sorteo").locatedBy("(//label[contains(text(),'Siguiente')])[2]");
    public static final Target BTN_ENV_SOLICITUD = Target.the("Boton enviar solicitud").locatedBy("//label[contains(text(),'Enviar Solicitud')]");
}
