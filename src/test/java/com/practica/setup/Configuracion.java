package com.practica.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.google.common.base.StandardSystemProperty.USER_DIR;
import static com.practica.util.Log4j.LOG4J_PROPERTIES_FILE_PATH;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Configuracion {
    private static final String SWITCHES = "--remote-allow-origins=*";
    private static final String ACTOR = "Gretty";
    private static final Duration DIEZ_SEGUNDOS = Duration.ofSeconds(10);

    @Managed()
    protected WebDriver webDriver;

    private void setupUser( WebDriver webDriver) {
        configurarDriver();
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR).can(BrowseTheWeb.with(webDriver));
        maximizar(webDriver);
    }

    private void configurarDriver() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments(SWITCHES);
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(co);
    }

    private static void maximizar(WebDriver webDriver) {
        webDriver.manage().window().maximize();
    }

    protected void quitarDriver() {
        webDriver.quit();
    }

    protected void configurarNavegador() {
        setupUser(webDriver);
        setUplog4j();
    }

    private void setUplog4j() {
        PropertyConfigurator.configure(USER_DIR.value() + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }

    public static void waitExplicit() {
        WebDriverWait wait = new WebDriverWait(getDriver(), DIEZ_SEGUNDOS);
        wait.until(ExpectedConditions.alertIsPresent());
    }
}