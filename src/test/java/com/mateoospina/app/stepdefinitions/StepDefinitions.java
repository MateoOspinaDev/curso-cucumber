package com.mateoospina.app.stepdefinitions;

import com.mateoospina.app.palabras.ContadorCaracteres;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class StepDefinitions {

    ContadorCaracteres contador;
    int resultado;

    @Given("quiero contar caracteres")
    public void quieroContarCaracteres() {
        contador = new ContadorCaracteres();
    }

    @When("cuento los caracteres de la palabra {string}")
    public void cuentoLosCaracteresDeLaPalabra(String string) {
        resultado = contador.contar(string);
    }

    @Then("la cantidad de caracteres es {int}")
    public void laCantidadDeCaracteresEs(int int1){
        Assert.assertEquals(int1, resultado);
    }

    @When("cuento los caracteres de listado")
    public void cuentoLosCaracteresDeListado(List<String> arg1) {
        resultado = contador.contar(arg1);
    }
}
