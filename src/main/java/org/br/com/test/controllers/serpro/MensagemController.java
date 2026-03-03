package org.br.com.test.controllers.serpro;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.br.com.test.model.serpro.MensagemResponse;
import org.br.com.test.service.serpro.SerproService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controller responsável pelo endpoint GET de mensagem.
 * Segue as regras de orquestração e clareza.
 */
@RestController
@Tag(name = "SERPRO", description = "Endpoints para consulta de CNPJ via SERPRO")
public class MensagemController {
    private static final Logger logger = LoggerFactory.getLogger(MensagemController.class);
    private final SerproService serproService;

    public MensagemController(SerproService serproService) {
        this.serproService = serproService;
    }

    @Operation(summary = "Consultar CNPJ", description = "Consulta os dados de um CNPJ na base do SERPRO")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "CNPJ encontrado com sucesso"),
        @ApiResponse(responseCode = "404", description = "CNPJ não encontrado"),
        @ApiResponse(responseCode = "500", description = "Erro ao consultar o serviço externo")
    })
    @GetMapping("/consult-serpro/{cnpj}")
    public MensagemResponse obterMensagem(
            @Parameter(description = "CNPJ a ser consultado", required = true, example = "00000000000191")
            @PathVariable("cnpj") String cnpj) {
        logger.info("Recebida requisicao para /consult-serpro com CNPJ: {}", cnpj);
        String respostaExterna = serproService.consultarCnpj(cnpj);
        return new MensagemResponse(respostaExterna);
    }
}
