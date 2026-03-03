# Consult API

API Spring Boot para consulta de CNPJ via SERPRO.

---

##  Pré-requisitos

- Java 21+
- Maven 3.8+

---

## iniciar a API

```bash
mvn spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

---

##  Documentação

Acesse a documentação interativa pelo navegador:

```
http://localhost:8080/docs
```

---

## Realizando uma consulta GET

### Endpoint

```
GET /consult-serpro/{cnpj}
```

### Exemplo com `curl`

```bash
curl -X GET "http://localhost:8080/consult-serpro/00000000000191"
```

### Exemplo de resposta (`200 OK`)

```json
{
  "mensagem": "..."
}
```

### Códigos de resposta

| Código | Descrição                          |
|--------|------------------------------------|
| 200    | CNPJ encontrado com sucesso        |
| 404    | CNPJ não encontrado                |
| 500    | Erro ao consultar o serviço externo |

---

## Executando os testes

```bash
mvn test
```

