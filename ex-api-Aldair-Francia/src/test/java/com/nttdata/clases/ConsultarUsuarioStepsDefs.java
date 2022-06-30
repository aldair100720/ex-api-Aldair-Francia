package com.nttdata.clases;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;
public class ConsultarUsuarioStepsDefs {

    @Steps
    ConsultarUsuario ConsultarUsuario;

    @When("valido el usuario con id {int} y titulo {string}")
    public void ConsultarUsuario(int id, String titulo){
        ConsultarUsuario.ConsultarUsuario(id, titulo);
    }

    @Then("el codigo de respuesta es {int}")
    public void elCódigoDeRespuestaEs(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

}
