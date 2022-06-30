package com.nttdata.clases;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
public class ConsultarUsuario {
    private static String CONSULT_USER = "https://www.freetogame.com/api/games?id=";

    @Step("Consultar usuario {0} en ")
    public void ConsultarUsuario(int id, String titulo){
        SerenityRest.given()
                .contentType("application/json")
                .body("{\n" +
                        "  \"id\": "+"\""+id+"\","+"\n" +
                        "  \"title\": "+"\""+titulo+"\","+"\n" +
                        "}")
                .get(CONSULT_USER+id);

    }
}
