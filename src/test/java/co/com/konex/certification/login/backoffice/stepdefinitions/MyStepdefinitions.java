package co.com.konex.certification.login.backoffice.stepdefinitions;

import co.com.konex.cetificacion.login.backoffice.models.TablaUsuarios;
import co.com.konex.cetificacion.login.backoffice.questions.Validar;
import co.com.konex.cetificacion.login.backoffice.questions.Verificar;
import co.com.konex.cetificacion.login.backoffice.tasks.AbrirPag;
import co.com.konex.cetificacion.login.backoffice.tasks.IngresarBack;
import co.com.konex.cetificacion.login.backoffice.tasks.Seleccionarem;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class MyStepdefinitions {

    @DataTableType
    public TablaUsuarios tablaUsuariosEntry(Map<String, String> entry) {
        return new TablaUsuarios(entry.get("usuario"), entry.get("contrasenna"), entry.get("empresa"));
    }

    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    //Caso 1
    @Dado("que el usuario ingresa al Backoffice")
    public void queElUsuarioIngresaAlBackoffice() {
        OnStage.theActorCalled("Usuario").wasAbleTo(AbrirPag.laPagina());
    }

    @Cuando("digita usuario y contrasenna del usuario")
    public void digitaUsuarioYContrasennaDelUsuario(List<TablaUsuarios> tablaUsuarios) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarBack.credenciales(tablaUsuarios.get(0)));
    }

    @Y("selecciona empresa")
    public void seleccionaEmpresa(List<TablaUsuarios> tablaUsuarios) {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionarem.empresa(tablaUsuarios.get(0)));
    }

    @Entonces("^verifica que ingreso correctamente$")
    public void verificaQueIngresoCorrectamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.home(), Matchers.equalTo("Inicio")));

    }

    //Caso2

    @Entonces("^verifica el mensaje de error$")
    public void verificaElMensajeDeError(List<String> msjError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.mensajeError(), Matchers.equalTo(msjError.get(1))));
    }
}
