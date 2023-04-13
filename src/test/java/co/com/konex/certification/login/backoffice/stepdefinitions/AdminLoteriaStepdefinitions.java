package co.com.konex.certification.login.backoffice.stepdefinitions;

import co.com.konex.cetificacion.login.backoffice.model.TablaLoterias;
import co.com.konex.cetificacion.login.backoffice.model.TablaUsuarios;
import co.com.konex.cetificacion.login.backoffice.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class AdminLoteriaStepdefinitions {

    @DataTableType
    public TablaLoterias tablaLoteriasEntry(Map<String, String> entry){
        return new TablaLoterias(entry.get("codigo"), entry.get("nombrelargo"),entry.get("nombrecorto"),entry.get("telefono"));
    }
    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @And("ingrese al modulo Escrutinio y submodulo loteria")
    public void ingreseAlModuloEscrutinioYSubmoduloLoteria() {
        OnStage.theActorInTheSpotlight().attemptsTo(Presionar.escrutinioLoteria());
    }

    @And("cree una loteria")
    public void creeUnaLoteria(List<TablaLoterias> tablaLoterias)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Llenar.formularioLoteria(tablaLoterias.get(0)));
    }

    @Then("validara que la loteria se haya creado")
    public void validaraQueLaLoteriaSeHayaCreado() {
        OnStage.theActorInTheSpotlight();

    }
}
