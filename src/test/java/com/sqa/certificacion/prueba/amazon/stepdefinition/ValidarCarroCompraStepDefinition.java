package com.sqa.certificacion.prueba.amazon.stepdefinition;

import com.sqa.certificacion.prueba.amazon.drivers.ChromeDriver;
import com.sqa.certificacion.prueba.amazon.tasks.AgregarProductoCarroComprasStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ValidarCarroCompraStepDefinition {

    public String url = "https://www.amazon.com/";

    @Before
    public void setUserName(){
        setTheStage(new Cast());
        theActorCalled("User");
    }

    @Given("Usuario ingresa a Pagina de Amazon")
    public void usuarioIngresaAPaginaDeAmazon() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(ChromeDriver.chrome().conURL(url)));
    }

    @When("Usuario agrega {} productos al carro de compras")
    public void usuarioAgregaProductosAlCarroDeCompras(String numeroItems) {
        theActorInTheSpotlight().attemptsTo(AgregarProductoCarroComprasStep.conNumeroItems(numeroItems));
    }

    @Then("Usuario ve correctamente {} productos en el carro compras")
    public void usuarioVeCorrectamenteDosProductosEnElCarroCompras(String numeroItems) {
    }
}
