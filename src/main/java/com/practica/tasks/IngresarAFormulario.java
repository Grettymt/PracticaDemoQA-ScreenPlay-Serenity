package com.practica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.practica.ui.PaginaInicial.OPCION_FORMULARIO;
import static com.practica.ui.PaginaInicial.OPCION_PRACTICE_FORM;

public class IngresarAFormulario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_FORMULARIO),
                Click.on(OPCION_PRACTICE_FORM)
        );
    }
    public static IngresarAFormulario ingresarAFormulario(){return new IngresarAFormulario();}
}
