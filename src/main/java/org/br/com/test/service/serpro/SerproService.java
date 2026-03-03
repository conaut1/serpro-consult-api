package org.br.com.test.service.serpro;

import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class SerproService {
    public String consultarCnpj(String cnpj) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.opencnpj.org/" + cnpj;
        try {
            return restTemplate.getForObject(url, String.class);
        } catch (HttpClientErrorException.NotFound e) {
            return "CNPJ não encontrado na base externa.";
        } catch (Exception e) {
            return "Erro ao consultar o serviço externo: " + e.getMessage();
        }
    }
}
