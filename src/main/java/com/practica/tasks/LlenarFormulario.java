package com.practica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static com.practica.ui.CrearUsuario.*;

public class LlenarFormulario implements Task {
    private String nombre;
    private String apellido;
    private String correo;
    private String numero_telefono;
    private String materia;
    private String direccion;

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

    public LlenarFormulario conElTelefono(String numero_telefono){
        this.numero_telefono=numero_telefono;
        return this;
    }

    public LlenarFormulario conLaMateria(String materia){
        this.materia=materia;
        return this;
    }

    public LlenarFormulario conLaDireccion(String direccion){
        this.direccion=direccion;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Enter.theValue(apellido).into(CAMPO_APELLIDO),
                Enter.theValue(correo).into(CAMPO_CORREO),
                Click.on(RADIO_GENERO),
                Enter.theValue(numero_telefono).into(CAMPO_NUMERO_TELEFONO),
                Click.on(CALENDARIO),
                Click.on(CALENDARIO_MES),
                Click.on(CALENDARIO_FEBRERO),
                Click.on(ANIO),
                Click.on(ANIO_DOSMIL),
                Click.on(DIA),
                Enter.theValue(materia).into(CAMPO_MATERIA).thenHit(Keys.ENTER),
                Scroll.to(CHECK_PASATIEMPO),
                Click.on(CHECK_PASATIEMPO2),
                Enter.theValue(direccion).into(CAMPO_DIRECCION)
        );
    }
    public static LlenarFormulario llenarFormulario(){
        return new LlenarFormulario();
    }
}
