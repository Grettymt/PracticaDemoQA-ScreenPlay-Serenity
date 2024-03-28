package com.practica.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicial extends PageObject {
    public static final Target OPCION_FORMULARIO = Target.the("Opción formulario")
            .located(By.xpath("(//div[@class='card mt-4 top-card'])[2]"));

    public static final Target OPCION_PRACTICE_FORM = Target.the("Opción practice form")
            .located(By.xpath("//span[normalize-space()='Practice Form']"));
}