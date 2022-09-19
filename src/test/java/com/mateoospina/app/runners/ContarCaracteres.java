package com.mateoospina.app.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/contarCaracteres.feature"},
        glue = {"com.mateoospina.app.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class ContarCaracteres {
}
