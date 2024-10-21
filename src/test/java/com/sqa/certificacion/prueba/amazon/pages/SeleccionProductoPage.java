package com.sqa.certificacion.prueba.amazon.pages;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionProductoPage {
    public static Target SELECCIONPRODUCTO = Target.the("Seleccion Producto").locatedBy("(//DIV[@data-cy='title-recipe']//A)[{0}]");

    public static Target LOGOIRHOME = Target.the("Logo Ir Home").locatedBy("a#nav-logo-sprites");
}
