package com.practica.stepdefinitions;

import com.practica.setup.Configuracion;
import com.practica.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.practica.questions.MensajeRegistroUsuario.mensajeRegistroUsuario;
import static com.practica.tasks.IngresarAFormulario.ingresarAFormulario;
import static com.practica.tasks.LlenarFormulario.llenarFormulario;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegistroStepDefinitions extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(RegistroStepDefinitions.class);

    @Dado("que el usuario esta en la pagina de inicio")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        try{
            configurarNavegador();

            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
        }catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    @Cuando("navega hasta la el formulario de registro")
    public void navegaHastaLaElFormularioDeRegistro() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    ingresarAFormulario()
            );
        }catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    @Cuando("Llena todos los campos")
    public void llenaTodosLosCampos() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    llenarFormulario()
                            .conElNombre("Gretty")
                            .conElApellido("Mosquera")
                            .conElCorreo("gretty@gmail.com")
                            .conElTelefono("3293446578")
                            .conLaMateria("Arts")
                            .conLaDireccion("Cll90 #10")
                            .conElEstado("Haryana")
                            .conLaCiudad("Karnal")
            );
        }catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    @Entonces("el usuario debe ser redireccionado a la pagina principal")
    public void elUsuarioDebeSerRedireccionadoALaPaginaPrincipal() {
        try{
            theActorInTheSpotlight().should(
                   seeThat(mensajeRegistroUsuario(), equalTo("Thanks for submitting the form"))
            );
            quitarDriver();
        }catch (Exception exception) {
            quitarDriver();
            Assertions.fail(exception.getMessage(),exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }
}