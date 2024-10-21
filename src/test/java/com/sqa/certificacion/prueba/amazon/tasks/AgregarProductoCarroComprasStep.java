package com.sqa.certificacion.prueba.amazon.tasks;

import com.sqa.certificacion.prueba.amazon.pages.HomePage;
import com.sqa.certificacion.prueba.amazon.pages.SeleccionProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProductoCarroComprasStep implements Task {

    private String numeroItems;

    public AgregarProductoCarroComprasStep(String numeroItems){
        this.numeroItems = numeroItems;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(HomePage.INPUTBUSCAR, isVisible()));
        for (int i = 1; i <= (Integer.parseInt(this.numeroItems)); i++) {
            actor.attemptsTo(Click.on(HomePage.INPUTBUSCAR));
            actor.attemptsTo(Enter.theValue("Nintendo").into(HomePage.INPUTBUSCAR));
            actor.attemptsTo(Click.on(HomePage.BUTTONBUSCAR));
            actor.attemptsTo(Click.on(SeleccionProductoPage.SELECCIONPRODUCTO.of("Numero de Producto").called(Integer.toString(i))));
            actor.attemptsTo(Click.on(SeleccionProductoPage.LOGOIRHOME));
        }
    }

    public static AgregarProductoCarroComprasStep conNumeroItems(String numeroItems){
        return Tasks.instrumented(AgregarProductoCarroComprasStep.class, numeroItems);
    }

}
