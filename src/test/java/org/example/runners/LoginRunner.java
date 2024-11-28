package org.example.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class) //con lo que junit crea las pruebas
//@RunWith(SerenityRunner.class) //solo cuando se trabaja con serenity
@CucumberOptions(
        features = "src/test/resources/features/validacion_sostenibilidad.feature",
        glue = "org.example.definitions", //definiciones, en que paquete POM
    //    glue = "org.example.stepdefinitions", // screenplay
        snippets = CucumberOptions.SnippetType.CAMELCASE, //la escritura de los metodos, navegarPaginaWeb camelcase
        plugin = "pretty"
)
public class LoginRunner {
}
