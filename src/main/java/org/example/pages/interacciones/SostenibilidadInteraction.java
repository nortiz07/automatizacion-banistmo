package org.example.pages.interacciones;

import net.thucydides.core.pages.PageObject;
import org.example.pages.mapeos.Sostenibilidad;
import org.fluentlenium.core.annotation.Page;

public class SostenibilidadInteraction extends PageObject {

    @Page
    private Sostenibilidad sostenibilidad; //instancia el elemento Acercade y se lo asigna a la variable

    public String getTitleSostenibilidad() {
        return sostenibilidad.titleSostenibilidad.waitUntilVisible().getText();
    }

}
