package org.example.definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.example.steps.SostenibilidadSteps;

public class SostenibilidadDefinition {

    @Steps
    private SostenibilidadSteps sostenibilidadSteps;

    @Dado("que el usuario navega a la pagina de acerca de")
    public void navegarAcerde() {
        sostenibilidadSteps.clicCorporativa();
    }

    @Cuando("ingresa da clic al boton información corporativa")
    public void clickSostenibilidad() {
        sostenibilidadSteps.clicSostenibilidad();
    }

    @Entonces("debería ingresar a la de sostenibilidad")
    public void validacionSostenibilidad(){
        sostenibilidadSteps.validationSostenibilidad();}
}
