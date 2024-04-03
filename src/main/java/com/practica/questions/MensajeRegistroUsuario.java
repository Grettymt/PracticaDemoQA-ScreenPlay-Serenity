package com.practica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.practica.ui.EnviarCreacion.MENSAJE_CONFIRMACION;

public class MensajeRegistroUsuario implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_CONFIRMACION.resolveFor(actor).getText();
    }

    public static MensajeRegistroUsuario mensajeRegistroUsuario() {
        return new MensajeRegistroUsuario();
    }
}
