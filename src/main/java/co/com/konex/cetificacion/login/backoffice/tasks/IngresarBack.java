package co.com.konex.cetificacion.login.backoffice.tasks;

import co.com.konex.cetificacion.login.backoffice.models.TablaUsuarios;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarBack implements Task {

    private TablaUsuarios tablaUsuarios;

    public IngresarBack(TablaUsuarios tablaUsuarios) {
        this.tablaUsuarios = tablaUsuarios;
    }

    public static IngresarBack credenciales(TablaUsuarios tablaUsuarios) {
        return Tasks.instrumented(IngresarBack.class,tablaUsuarios);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(tablaUsuarios.getUsuario()).into(ContenedorDeObjetosLogin.USER),
                Enter.theValue(tablaUsuarios.getContrasenna()).into(ContenedorDeObjetosLogin.PASSWORD),
                Click.on(ContenedorDeObjetosLogin.BTN_SING_IN));


    }
}
