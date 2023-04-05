package co.com.konex.cetificacion.login.backoffice.tasks;

import co.com.konex.cetificacion.login.backoffice.model.TablaUsuarios;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetos;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Ingresar implements Task {

    private TablaUsuarios tablaUsuarios;

    public Ingresar(TablaUsuarios tablaUsuarios) {
        this.tablaUsuarios = tablaUsuarios;
    }

    public static Ingresar credenciales(TablaUsuarios tablaUsuarios) {
        return Tasks.instrumented(Ingresar.class,tablaUsuarios);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(tablaUsuarios.getUsuario()).into(ContenedorDeObjetos.USER),
                Enter.theValue(tablaUsuarios.getContrasenna()).into(ContenedorDeObjetos.PASSWORD),
                Click.on(ContenedorDeObjetos.BTN_SING_IN),
                Click.on(ContenedorDeObjetos.OPTION_EMPRESA),
                Click.on(ContenedorDeObjetos.BTN_ACEPT));
    }
}
