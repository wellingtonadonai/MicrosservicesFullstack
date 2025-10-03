🚀 MinhaApiSecurity










API REST desenvolvida em Java 21 com Spring Boot, focada em segurança e proteção de aplicações web.
O projeto implementa autenticação e autorização com JWT (JSON Web Token), além de um CRUD completo de usuários, garantindo acesso controlado apenas para usuários ou sistemas autorizados.

🛠️ Tecnologias utilizadas

Java 21

Spring Boot 3.5.6

Spring Security

JWT (JSON Web Token)

Spring Data JPA + Hibernate

MySQL

Maven

📌 Funcionalidades

✔️ CRUD completo de usuários (Create, Read, Update, Delete)
✔️ Autenticação via JWT (stateless)
✔️ Autorização baseada em roles e perfis de acesso
✔️ Hashing de senhas para maior segurança
✔️ Configuração de CORS para controle de acesso entre domínios
✔️ Estrutura organizada em camadas (Controller, Service, Repository, Entity)

⚙️ Como executar o projeto
Pré-requisitos

Java 21 instalado

Maven instalado

Banco de dados MySQL rodando

Passos

Clone o repositório:

git clone https://github.com/wellingtonadonai/MinhaApiSecurity.git


Acesse a pasta do projeto:

cd MinhaApiSecurity


Configure o banco de dados MySQL no arquivo application.properties (ou application.yml):

spring.datasource.url=jdbc:mysql://localhost:3306/minha_api_security
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update


Compile e rode o projeto com Maven:

mvn spring-boot:run


A API estará disponível em:

http://localhost:8080

🔑 Endpoints principais
Autenticação

POST /auth/login → Login e geração do token JWT

Usuários

POST /users → Criar usuário

GET /users → Listar usuários

GET /users/{id} → Buscar usuário por ID

PUT /users/{id} → Atualizar usuário

DELETE /users/{id} → Deletar usuário

📖 Aprendizados

Este projeto foi desenvolvido como prática para consolidar conhecimentos em:

Segurança no back-end

Implementação de JWT

Boas práticas com Spring Security

Organização de APIs REST em camadas

📌 Autor

👤 Wellington Oliveira
🔗 [LinkedIn](https://www.linkedin.com/in/wellingtonoliveira-dev/)

