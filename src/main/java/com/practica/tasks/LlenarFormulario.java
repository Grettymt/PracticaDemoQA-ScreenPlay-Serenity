package com.practica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.practica.ui.CrearUsuario.*;

public class LlenarFormulario implements Task {
    private String nombre;
    private String apellido;
    private String correo;
    private String genero;

    public LlenarFormulario conElNombre(String nombre){
        this.nombre=nombre;
        return this;
    }

    public LlenarFormulario conElApellido(String apellido){
        this.apellido=apellido;
        return this;
    }

    public LlenarFormulario conElCorreo(String correo){
        this.correo=correo;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Enter.theValue(apellido).into(CAMPO_APELLIDO),
                Enter.theValue(correo).into(CAMPO_CORREO),
                Click.on(RADIO_GENERO)
        );
    }
    public static LlenarFormulario llenarFormulario(){
        return new LlenarFormulario();
    }
}
