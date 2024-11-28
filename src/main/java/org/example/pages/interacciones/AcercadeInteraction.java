package org.example.pages.interacciones;

import net.thucydides.core.pages.PageObject;
import org.example.pages.mapeos.AcercaDe;
import org.example.steps.AcercadeSteps;
import org.fluentlenium.core.annotation.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AcercadeInteraction extends PageObject {

    @Page
    private AcercaDe acercaDe; //instancia el elemento Acercade y se lo asigna a la variable

    public String getTitleAcercade() {
        return acercaDe.titleInformacion.waitUntilVisible().getText();
    }

}