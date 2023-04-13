package co.com.konex.cetificacion.login.backoffice.tasks;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedordeObjetosSorteo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Clickear implements Task {
    public static Clickear escrutinioSorteo() {
        return Tasks.instrumented(Clickear.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedordeObjetosSorteo.MDL_ESCRUTINIO),
                Click.on(ContenedordeObjetosSorteo.SML_SORTEO),
                Click.on(ContenedordeObjetosSorteo.BTN_CREAR_SORTEO));
    }
}
