package com.sqa.certificacion.prueba.amazon.pages;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static Target INPUTBUSCAR = Target.the("Input Buscar").locatedBy("input#twotabsearchtextbox");

    public static Target BUTTONBUSCAR = Target.the("Button Bucar").locatedBy("input#nav-search-submit-button");



}
