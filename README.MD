📌 Projeto Spring Boot – API com PostgreSQL, Spring Security e JWT
📖 Sobre o Projeto

Este projeto foi desenvolvido com Spring Boot, utilizando Spring Data JPA para persistência de dados, PostgreSQL como banco de dados relacional, e Spring Security com JWT para autenticação e autorização de usuários.
Foram criados endpoints para Produtos e Usuários, incluindo tratamento de exceções globais e boas práticas de arquitetura.

🚀 Tecnologias Utilizadas

Java 17+

Spring Boot

Spring Data JPA

Spring Security + JWT

PostgreSQL

Maven

VSCode

📂 Estrutura do Projeto

A organização segue as boas práticas do Spring Boot:

src/main/java/com/example/Projeto_Spring_Boot
│── controller       → Controladores REST (Produto, Usuário, Mensagem)
│── exceptions       → Exceções personalizadas e globais
│── model            → Entidades JPA (Produto, Usuário)
│── repository       → Interfaces de persistência (JPARepository)
│── security         → Configurações de segurança e JWT
│── service          → Regras de negócio (ProdutoService, UsuarioService)
│── ProjetoSpringBootApplication.java → Classe principal

🛠️ Funcionalidades

✅ Cadastro e validação de Usuários

✅ Cadastro e validação de Produtos

✅ Persistência com PostgreSQL

✅ Tratamento de exceções personalizadas

✅ Exceções globais

✅ Autenticação e autorização com Spring Security e JWT

✅ Proteção de rotas com base no usuário logado

📌 Etapas de Desenvolvimento
00:09:19 – Criando o Projeto com Spring Initializr

Dependências utilizadas:

Spring Web

Spring Data JPA

PostgreSQL Driver

Spring Security

JWT (jjwt)

00:15:00 – Profiles no VSCode

Configuração de múltiplos profiles para ambientes diferentes (dev, prod).

00:22:25 – Estrutura Básica do Spring Boot

Criação de pacotes organizados por camadas (MVC + Security + Exceptions).

00:33:15 – Persistência de Dados com Spring Data JPA

Entidades Produto e Usuario

Repositórios ProdutoRepository e UsuarioRepository

00:39:00 – Configurando o PostgreSQL

Arquivo application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/meubanco
spring.datasource.username=postgres
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

00:44:00 – Criando a Primeira API de Produtos

Endpoints REST:

GET /produtos

POST /produtos

PUT /produtos/{id}

DELETE /produtos/{id}

01:06:00 – Tratamento de Exceções no Spring Boot

Criação de RecursoNaoEncontradoException

GlobalExceptionHandler para capturar e formatar os erros.

01:15:00 – Exceções Globais

Implementação de tratamento centralizado para respostas JSON padronizadas.

01:20:00 – Autenticação e Segurança com Spring Security e JWT

Implementação de JwtAuthFilter e JwtUtil

Configuração da classe SecurityConfig

01:37:00 – Autenticação de Usuários e Rotas

Criação de UsuarioDetailsService

Login com geração de token JWT

Proteção de rotas baseadas em usuário autenticado

▶️ Como Executar o Projeto
Pré-requisitos

Java 17+

PostgreSQL instalado e rodando

VSCode ou IntelliJ IDEA

Passos

Clone o repositório:

git clone https://github.com/seu-usuario/projeto-spring-boot.git
cd projeto-spring-boot


Configure o banco de dados PostgreSQL no application.properties

Rode o projeto:

./mvnw spring-boot:run


Acesse a API em:

http://localhost:8080

🔑 Autenticação

Endpoint de login: POST /auth/login

Exemplo de payload:

{
  "username": "usuario",
  "password": "senha123"
}


A resposta retorna um token JWT que deve ser usado no header:

Authorization: Bearer <token>

📌 Endpoints Principais
Produtos

GET /produtos → lista todos

POST /produtos → cria novo produto

PUT /produtos/{id} → atualiza produto

DELETE /produtos/{id} → remove produto

Usuários

POST /usuarios → cadastro de usuário

POST /auth/login → autenticação e geração de token JWT

📜 Licença

Este projeto foi desenvolvido para fins de estudo e aprendizado.