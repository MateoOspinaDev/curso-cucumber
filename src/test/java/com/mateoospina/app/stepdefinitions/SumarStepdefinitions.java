package com.mateoospina.app.stepdefinitions;
import com.mateoospina.app.calculo.Suma;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SumarStepdefinitions {

    private Suma sumador;
    private Integer resultado;

    @Given("quiero sumar")
    public void prepararSuma() {
        sumador = new Suma();
    }
    @When("sumo {int} mas {int}")
    public void sumar(Integer int1, Integer int2) {
        resultado = sumador.sumar(int1, int2);
    }
    @Then("deberia ver el resultado es {int}")
    public void verificarResultado(Integer int1) {
        Assert.assertEquals(int1, resultado);
    }
}
