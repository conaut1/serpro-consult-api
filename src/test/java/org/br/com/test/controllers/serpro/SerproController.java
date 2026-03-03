package org.br.com.test.controllers.serpro;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.br.com.test.model.serpro.ConsultaSerproResponse;



import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SerproController {
    private Response response;
    private static final String BASE_URL = "https://api.opencnpj.org";

    public SerproController() {
        response = null;
    }

    public void consultarSerpro() {
        String cnpj = "33.041.260/0001-64";
        this.response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(BASE_URL + "/" + cnpj);
        response.prettyPrint();
    }

    public void validarStatusCode(int expectedStatusCode) {
        assertEquals(
                expectedStatusCode,
                response.getStatusCode()
        );
    }

    public void getEmail() {
        ConsultaSerproResponse resp = this.response.as(ConsultaSerproResponse.class);
        System.out.println(resp.getEmail());
        System.out.println(resp.getTelefones().getFirst().getNumero());

    }

}
