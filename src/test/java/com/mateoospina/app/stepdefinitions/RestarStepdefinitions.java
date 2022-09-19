package com.mateoospina.app.stepdefinitions;

import com.mateoospina.app.calculo.Resta;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RestarStepdefinitions {

    private Resta restador;
    private Integer resultado;

    @Given("quiero restar")
    public void prepararResta() {
        restador = new Resta();
    }

    @When("resto {int} mas {int}")
    public void restar(Integer int1, Integer int2) {
        resultado = restador.restar(int1, int2);
    }

    @Then("deberia ver que el resultado es {int}")
    public void verificarResultadoResta(Integer int1) {
        Assert.assertEquals(int1, resultado);
    }

}
