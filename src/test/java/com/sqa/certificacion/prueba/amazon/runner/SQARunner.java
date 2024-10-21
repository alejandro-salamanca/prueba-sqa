package com.sqa.certificacion.prueba.amazon.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        snippets = CAMELCASE,
        glue = "com.sqa.certificacion.prueba.amazon.stepdefinition")
public class SQARunner {
}
