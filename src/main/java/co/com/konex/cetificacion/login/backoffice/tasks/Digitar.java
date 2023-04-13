package co.com.konex.cetificacion.login.backoffice.tasks;

import co.com.konex.cetificacion.login.backoffice.model.TablaUsuarios;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Digitar implements Task {
    private TablaUsuarios tablaUsuarios;

    public Digitar(TablaUsuarios tablaUsuarios) {
        this.tablaUsuarios = tablaUsuarios;
    }

    public static Digitar credencialesIncorrectas(TablaUsuarios tablaUsuarios) {
        return Tasks.instrumented(Digitar.class, tablaUsuarios);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(tablaUsuarios.getUsuario()).into(ContenedorDeObjetosLogin.USER),
                Enter.theValue(tablaUsuarios.getContrasenna()).into(ContenedorDeObjetosLogin.PASSWORD),
                Click.on(ContenedorDeObjetosLogin.BTN_SING_IN));

    }
}
