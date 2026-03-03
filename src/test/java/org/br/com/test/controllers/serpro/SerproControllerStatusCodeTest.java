package org.br.com.test.controllers.serpro;

import org.junit.jupiter.api.Test;

public class SerproControllerStatusCodeTest {
    @Test
    public void deveRetornarStatusCode200AoConsultarSerpro() {
        SerproController controller = new SerproController();
        controller.consultarSerpro();
        controller.validarStatusCode(200);
        controller.getEmail();

    }
}
