## Integrantes do Grupo

- Felipe Capriotti – rm98460  
- Manoella Herrerias Waideman – rm98906  
- Victor Hugo Andrade – rm550996

# GS-SOA - Sistema de Cadastro de Bairros

Este projeto consiste em uma API Java desenvolvida com Spring Boot que implementa operações CRUD completas para cadastro de bairros, conforme solicitado no escopo do trabalho sobre Arquitetura Orientada a Serviço.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.2.0
- Spring Web
- Spring Data JPA
- Banco de dados em memória H2
- Maven

## Funcionalidades da API

- `GET /bairros`: Lista todos os bairros cadastrados.
- `POST /bairros`: Cria um novo bairro.
- `PUT /bairros/{id}`: Atualiza os dados de um bairro existente.
- `DELETE /bairros/{id}`: Remove um bairro pelo ID.

## Estrutura do Projeto

O projeto segue uma arquitetura orientada a serviços, com as seguintes camadas:

- `controller`: Camada de entrada com os endpoints REST.
- `service`: Lógica de negócio.
- `repository`: Interface com o banco de dados.
- `model`: Entidades JPA.
- `dto`: Objetos de transferência de dados (DTOs).

## Banco de Dados

- A API utiliza o H2, um banco em memória.
- Para acessar a interface do banco, vá para `http://localhost:8080/h2-console`.
- JDBC URL: `jdbc:h2:mem:gssoa`
- Username: `sa`
- Password: (em branco)

## Executar

```bash
./mvnw spring-boot:run
```

Se estiver no Windows e não tiver `mvnw`, utilize:

```bash
mvn spring-boot:run
```

## Entregas Atendidas

- Implementação de uma API RESTful com CRUD.
- Organização modular com camadas separadas.
- Separação clara entre controller, service e repository.
- Adoção de padrões REST e uso de JSON.
- Aplicação Java entregue conforme solicitado.

