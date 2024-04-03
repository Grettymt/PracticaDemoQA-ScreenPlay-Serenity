package com.practica.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class EnviarCreacion extends PageObject {
    public static final Target MENSAJE_CONFIRMACION = Target.the("Mensaje confirmacion")
            .located(By.id("example-modal-sizes-title-lg"));
}
