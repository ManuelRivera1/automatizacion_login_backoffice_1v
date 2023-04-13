package co.com.konex.cetificacion.login.backoffice.tasks;

import co.com.konex.cetificacion.login.backoffice.model.TablaCrearSorteo;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedordeObjetosSorteo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class Crear implements Task {

    private TablaCrearSorteo tablaCrearSorteo;

    public Crear (TablaCrearSorteo tablaCrearSorteo){
        this.tablaCrearSorteo = tablaCrearSorteo;
    }
    public static Crear sorteo(TablaCrearSorteo tablaCrearSorteo)
    {
        return Tasks.instrumented(Crear.class, tablaCrearSorteo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedordeObjetosSorteo.FECHA_INICIAL),
                Click.on(ContenedordeObjetosSorteo.MES_INICIO),
                Click.on(ContenedordeObjetosSorteo.ANNO_INICIO),
                Click.on(ContenedordeObjetosSorteo.DIA_INICIO),
                Click.on(ContenedordeObjetosSorteo.FECHA_FINAL),
                Click.on(ContenedordeObjetosSorteo.MES_FINAL),
                Click.on(ContenedordeObjetosSorteo.ANNO_FINAL),
                Click.on(ContenedordeObjetosSorteo.DIA_FINAL),
                Click.on(ContenedordeObjetosSorteo.LOTERIA),
                Scroll.to(ContenedordeObjetosSorteo.SELECCIONAR_LOTERIA),
                Click.on(ContenedordeObjetosSorteo.SELECCIONAR_LOTERIA),
                Enter.theValue(tablaCrearSorteo.getNumerosorteo()).into(ContenedordeObjetosSorteo.NUM_SORTEO),
                Enter.theValue(tablaCrearSorteo.getNumeroincrementaldelsorteo()).into(ContenedordeObjetosSorteo.NUM_INCRE_SORTEO),
                Click.on(ContenedordeObjetosSorteo.BTN_SGTE),
                Click.on(ContenedordeObjetosSorteo.CHECK_APLICAR_TODOS));
                //Enter.theValue(tablaCrearSorteo.getHorasorteo()).into(ContenedordeObjetosSorteo.HORA_SORTEO));
    }
}
