package co.com.konex.cetificacion.login.backoffice.questions;

import co.com.konex.cetificacion.login.backoffice.userinterfaces.ContenedorDeObjetosLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validar implements Question {

    public static Validar mensajeError() {
        return new Validar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetosLogin.MENSAJE_ERROR).answeredBy(actor);
    }
}
