package org.br.com.test.model.serpro;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model de resposta simples para o endpoint GET de mensagem.
 * Segue as regras de nomenclatura e serialização JSON.
 */
public class MensagemResponse {
    @JsonProperty("mensagem")
    private final String mensagem;

    public MensagemResponse(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
