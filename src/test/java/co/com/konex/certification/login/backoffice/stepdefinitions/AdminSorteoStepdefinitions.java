package co.com.konex.certification.login.backoffice.stepdefinitions;

import co.com.konex.cetificacion.login.backoffice.model.TablaCrearSorteo;
import co.com.konex.cetificacion.login.backoffice.model.TablaUsuarios;
import co.com.konex.cetificacion.login.backoffice.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

public class AdminSorteoStepdefinitions {

    @DataTableType
    public TablaCrearSorteo tablaCrearSorteoEntry (Map<String, String> entry) {
        return new TablaCrearSorteo(entry.get("numerosorteo"),entry.get("numeroincrementaldelsorteo"),entry.get("horasorteo"));
    }
    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    //Caso5
    @Given("que el administrador se encuentre en el backoffice")
    public void queElAdministradorSeEncuentreEnElBackoffice() {
        OnStage.theActorCalled("Usuario").wasAbleTo(Abrir.laPagina());
    }

    @When("se loguea con usuario y contrasenna")
    public void seLogueaConUsuarioYContrasenna(List<TablaUsuarios> tablaUsuarios) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales(tablaUsuarios.get(0)));
    }

    @And("ingrese al modulo Escrutinio y submodulo sorteo")
    public void ingreseAlModuloEscrutinioYSubmoduloSorteo() {
        OnStage.theActorInTheSpotlight().attemptsTo(Clickear.escrutinioSorteo());
    }

    @And("cree un sorteo")
    public void creeUnSorteo(List<TablaCrearSorteo> tablaCrearSorteos) {
        OnStage.theActorInTheSpotlight().attemptsTo(Crear.sorteo(tablaCrearSorteos.get(0)));
    }

    @Then("validara que el sorteo se haya creado")
    public void validaraQueElSorteoSeHayaCreado() {
    }


}
