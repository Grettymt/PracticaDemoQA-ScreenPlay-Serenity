package com.practica.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CrearUsuario extends PageObject {

    public static final Target CAMPO_NOMBRE = Target.the("Campo nombre")
            .located(By.id("firstName"));

    public static final Target CAMPO_APELLIDO = Target.the("Campo apellido")
            .located(By.id("lastName"));

    public static final Target CAMPO_CORREO = Target.the("Campo correo")
            .located(By.id("userEmail"));

    public static final Target RADIO_GENERO = Target.the("Radio genero")
            .located(By.cssSelector("label[for='gender-radio-1']"));
}