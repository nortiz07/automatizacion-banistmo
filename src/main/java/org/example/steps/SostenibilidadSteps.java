package org.example.steps;

import net.thucydides.core.annotations.Step;
import org.example.pages.interacciones.AcercadeInteraction;
import org.example.pages.interacciones.SostenibilidadInteraction;
import org.example.pages.mapeos.AcercaDe;
import org.example.pages.mapeos.Sostenibilidad;
import org.fluentlenium.core.annotation.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class SostenibilidadSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(AcercadeSteps.class);

    @Page
    private Sostenibilidad sostenibilidad;

    @Page
    private SostenibilidadInteraction sostenibilidadInteraction;

    @Step("el usuario da clic en corporativa")
    public void clicCorporativa(){
        sostenibilidad.open();
        sostenibilidad.botonAceptar.waitUntilVisible().click();
        sostenibilidad.titleInformacion.waitUntilVisible().click();
        LOGGER.info("ABRE SOSTENIBILIDAD");
    }

    @Step("da clic en sostenibilidad")
    public void clicSostenibilidad(){
        sostenibilidad.btnSostenibilidad.waitUntilVisible().click();
    }

    @Step("validacion sostenibilidad")
    public void validationSostenibilidad(){
        final String mensajeError = "Pagina errada";
        assertThat(mensajeError, sostenibilidadInteraction.getTitleSostenibilidad(), is(equalTo("Sostenibilidad")));
        LOGGER.info(sostenibilidadInteraction.getTitleSostenibilidad());
    }

}
