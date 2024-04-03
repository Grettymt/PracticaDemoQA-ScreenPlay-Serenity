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

    public static final Target CAMPO_NUMERO_TELEFONO = Target.the("Campo telefono")
            .located(By.id("userNumber"));

    public static final Target CALENDARIO = Target.the("Seleccionar fecha")
            .located(By.id("dateOfBirthInput"));

    public static final Target CALENDARIO_MES = Target.the("Seleccionar mes")
            .located(By.cssSelector(".react-datepicker__month-select"));

    public static final Target CALENDARIO_FEBRERO = Target.the("Seleccionar febrero")
            .located(By.cssSelector("div>select>option[value='1']"));

    public static final Target ANIO = Target.the("Seleccionar anio")
            .located(By.cssSelector(".react-datepicker__year-select"));

    public static final Target ANIO_DOSMIL = Target.the("Seleccionar anio 2000")
            .located(By.cssSelector("select>option[value='2000']"));

    public static final Target DIA = Target.the("Seleccionar dia")
            .located(By.cssSelector("div>div[class='react-datepicker__day react-datepicker__day--012 react-datepicker__day--weekend']"));

    public static final Target CAMPO_MATERIA = Target.the("Seleccionar materia")
            .located(By.id("subjectsInput"));

    public static final Target CHECK_PASATIEMPO = Target.the("Check pasatiempo")
            .located(By.cssSelector("div>input.custom-control-input[value='3']"));

    public static final Target CHECK_PASATIEMPO2 = Target.the("Check pasatiempo")
            .located(By.cssSelector("label[for='hobbies-checkbox-3']"));

    public static final Target CAMPO_DIRECCION = Target.the("Campo direccion")
            .located(By.id("currentAddress"));

    public static final Target SELECCIONAR_ESTADO = Target.the("Seleccionar estado")
            .located(By.id("react-select-3-input"));

    public static final Target SELECCIONAR_CIUDAD = Target.the("Seleccionar ciudad")
            .located(By.id("react-select-4-input"));

    public static final Target BOTON_REGISTRO = Target.the("Boton registro")
            .located(By.id("submit"));
}