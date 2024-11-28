package org.example.definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.example.steps.AcercadeSteps;

public class IngresarPersonasDefinition {

    @Steps
    private AcercadeSteps acercadeSteps;

    @Dado("que el usuario navega a la pagina de inicio de banitsmo")
    public void navegarInicioBanitsmo() {
        acercadeSteps.openLoginPage();
    }

    @Cuando("ingresa da clic al boton acerca de nosotros")
    public void ingresarAcercade() {
        acercadeSteps.clicAcercade();
    }

    @Entonces("debería ingresar a la pagina acerca de")
    public void verPaginaAcercade(){
        acercadeSteps.validationAcercade();
    }
}
