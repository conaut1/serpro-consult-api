package org.br.com.test.model.serpro;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsultaSerproResponse {
    @JsonProperty("cnpj")
    private String cnpj;
    @JsonProperty("razao_social")
    private String razaoSocial;
    @JsonProperty("nome_fantasia")
    private String nomeFantasia;
    @JsonProperty("situacao_cadastral")
    private String situacaoCadastral;
    @JsonProperty("data_situacao_cadastral")
    private String dataSituacaoCadastral;
    @JsonProperty("matriz_filial")
    private String matrizFilial;
    @JsonProperty("data_inicio_atividade")
    private String dataInicioAtividade;
    @JsonProperty("cnae_principal")
    private String cnaePrincipal;
    @JsonProperty("cnaes_secundarios")
    private List<String> cnaesSecundarios;
    @JsonProperty("natureza_juridica")
    private String naturezaJuridica;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String uf;
    private String municipio;
    private String email;
    private List<Telefone> telefones;
    @JsonProperty("capital_social")
    private String capitalSocial;
    @JsonProperty("porte_empresa")
    private String porteEmpresa;
    @JsonProperty("opcao_simples")
    private String opcaoSimples;
    @JsonProperty("data_opcao_simples")
    private String dataOpcaoSimples;
    @JsonProperty("opcao_mei")
    private String opcaoMei;
    @JsonProperty("data_opcao_mei")
    private String dataOpcaoMei;
    @JsonProperty("QSA")
    private List<QsaEntry> qsa;

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Telefone {
        @JsonProperty("ddd")
        private String ddd;
        @JsonProperty("numero")
        private String numero;
        @JsonProperty("is_fax")
        private boolean isFax;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class QsaEntry {
        @JsonProperty("nome_socio")
        private String nomeSocio;
        @JsonProperty("cnpj_cpf_socio")
        private String cnpjCpfSocio;
        @JsonProperty("qualificacao_socio")
        private String qualificacaoSocio;
        @JsonProperty("data_entrada_sociedade")
        private String dataEntradaSociedade;
        @JsonProperty("identificador_socio")
        private String identificadorSocio;
        @JsonProperty("faixa_etaria")
        private String faixaEtaria;
    }
}
