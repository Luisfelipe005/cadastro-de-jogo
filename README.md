# Cadastro de Jogos

Projeto que desenvolvi para praticar desenvolvimento de APIs REST utilizando Java e Spring Boot.

A ideia é ter uma API para cadastrar e gerenciar jogos, armazenando informações como nome, gênero, plataforma e ano de lançamento.

## Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- H2 Database
- API REST

## Funcionalidades

A API permite:

- Cadastrar jogos;
- Listar os jogos cadastrados;
- Buscar um jogo pelo ID;
- Atualizar jogos;
- Excluir jogos;
- Realizar buscas por nome;
- Realizar buscas por gênero;
- Realizar buscas por plataforma.

## Dados do jogo

Cada jogo possui:

- ID;
- Nome;
- Gênero;
- Plataforma;
- Ano de lançamento.

## Estrutura do projeto

Organizei o projeto em camadas:

- Controller
- Service
- Repository
- Model
- Exception

Também implementei validações dos dados recebidos e tratamento de exceções para situações como a busca por um jogo que não existe.

## Objetivo do projeto

Criei esse projeto para praticar conceitos que venho estudando em Java e Spring Boot, principalmente:

- Criação de APIs REST;
- Métodos GET, POST, PUT e DELETE;
- Persistência de dados com JPA;
- Consultas ao banco de dados;
- Validação de dados;
- Tratamento de exceções;
- Organização do projeto em camadas.

## Autor

Luis Felipe Soares Santos da Conceição

GitHub: [Luisfelipe005](https://github.com/Luisfelipe005)