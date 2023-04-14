package co.com.konex.cetificacion.login.backoffice.questions;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedordeObjetosSorteo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Revisar implements Question {

    public static Revisar mensajeExitoso() {
        return new Revisar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedordeObjetosSorteo.MENSAJE_EXITO).answeredBy(actor);
    }
}
