package org.example.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas")
public class AcercaDe extends PageObject {

    @FindBy(xpath = "//a[text()='Acerca de nosotros']")
    public WebElementFacade textAcercade;

    @FindBy(id = "btn-aceptar-cookies")
    public WebElementFacade botonAceptar;

    @FindBy(xpath = "//a[text()='Información Corporativa']")
    public WebElementFacade titleInformacion;

}
