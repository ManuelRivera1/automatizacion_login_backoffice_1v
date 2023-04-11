package co.com.konex.cetificacion.login.backoffice.questions;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question {
    public static Verificar home() {
        return new Verificar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetos.HOME_VALIDATION).answeredBy(actor);
    }
}
