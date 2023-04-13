package co.com.konex.cetificacion.login.backoffice.tasks;

import co.com.konex.cetificacion.login.backoffice.model.TablaLoterias;
import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedordeObjetosLoteria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Checkbox;
import net.serenitybdd.screenplay.ui.PageElement;

public class Llenar implements Task {
    private TablaLoterias tablaLoterias;

    public Llenar(TablaLoterias tablaLoterias){
        this.tablaLoterias = tablaLoterias;
    }

    public static Llenar formularioLoteria(TablaLoterias tablaLoterias) {
        return Tasks.instrumented(Llenar.class, tablaLoterias);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(tablaLoterias.getCodigo()).into(ContenedordeObjetosLoteria.CODIGO),
                Enter.theValue(tablaLoterias.getNombrelargo()).into(ContenedordeObjetosLoteria.NOMBRE_LARGO),
                Enter.theValue(tablaLoterias.getNombrecorto()).into(ContenedordeObjetosLoteria.NOMBRE_CORTO),
                Enter.theValue(tablaLoterias.getTelefono()).into(ContenedordeObjetosLoteria.TELEFONO),
                Click.on(ContenedordeObjetosLoteria.CHECK_PRODUCTO),
                Scroll.to(ContenedordeObjetosLoteria.IMAG_LOTERIA),
                Click.on(ContenedordeObjetosLoteria.IMAG_LOTERIA),
                Click.on(ContenedordeObjetosLoteria.ESTADO_LOTERIA),
                Click.on(ContenedordeObjetosLoteria.BTN_GUARDAR_LOTERIA));

    }
}
