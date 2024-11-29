package org.example.steps;

import net.thucydides.core.annotations.Step;
import org.example.pages.interacciones.AcercadeInteraction;
import org.example.pages.mapeos.AcercaDe;
import org.fluentlenium.core.annotation.Page;
import org.junit.AfterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class AcercadeSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(AcercadeSteps.class);

    @Page
    private AcercaDe acercaDe;

    @Page
    private AcercadeInteraction acercadeInteraction;

    @Step("usuario abre la web")
    public void openLoginPage(){
        acercaDe.open();
        acercaDe.botonAceptar.waitUntilVisible().click();
        LOGGER.info("usuario abre la web");
    }

    @Step("da clic en acerca de")
    public void clicAcercade(){
        acercaDe.textAcercade.waitUntilVisible().click();
    }

    @Step("validacion pagina acerca de")
    public void validationAcercade(){
        final String mensajeError = "Pagina errada";
        assertThat(mensajeError, acercadeInteraction.getTitleAcercade(), is(equalTo("Información Corporativa")));
        LOGGER.info(acercadeInteraction.getTitleAcercade());
    }


}
