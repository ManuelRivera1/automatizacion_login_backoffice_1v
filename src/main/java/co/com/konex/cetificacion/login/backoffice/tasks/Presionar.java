package co.com.konex.cetificacion.login.backoffice.tasks;


import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedordeObjetosLoteria;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedordeObjetosSorteo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Presionar implements Task {

    public static Presionar escrutinioLoteria() {
        return Tasks.instrumented(Presionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedordeObjetosSorteo.MDL_ESCRUTINIO),
                Click.on(ContenedordeObjetosLoteria.BTN_LOTERIAS),
                Click.on(ContenedordeObjetosLoteria.BTN_CREAR_LOTERIA));
    }
}
