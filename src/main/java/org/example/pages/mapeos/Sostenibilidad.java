package org.example.pages.mapeos;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/acerca-de") //Cuando inicie deberia estar en esa url
public class Sostenibilidad extends PageObject {

    @FindBy(xpath = "//a[text()='Información Corporativa']")
    public WebElementFacade titleInformacion;

    @FindBy(id = "btn-aceptar-cookies")
    public WebElementFacade botonAceptar;

    @FindBy(xpath = "//a[text()='Sostenibilidad']")
    public WebElementFacade btnSostenibilidad;

    @FindBy(xpath = "//h1")
    public WebElementFacade titleSostenibilidad;

}
