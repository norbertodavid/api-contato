<div align="center">

# 📱 API Contato

API REST desenvolvida com **Java + Spring Boot** para gerenciamento de uma agenda de contatos.

Projeto criado para praticar o desenvolvimento de APIs REST, aplicando arquitetura em camadas, persistência de dados e boas práticas utilizando o ecossistema Spring.

![Java](https://img.shields.io/badge/Java-11-red?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.7-green?style=for-the-badge&logo=springboot)
![Maven](https://img.shields.io/badge/Maven-blue?style=for-the-badge&logo=apachemaven)
![MySQL](https://img.shields.io/badge/MySQL-blue?style=for-the-badge&logo=mysql)
![H2](https://img.shields.io/badge/H2-Database-lightgrey?style=for-the-badge)

</div>

---

# 🚀 Sobre o projeto

A API Contato é uma aplicação Back-end responsável pelo gerenciamento de uma agenda de contatos.

A aplicação disponibiliza uma API REST para cadastro, consulta, atualização e remoção de contatos, utilizando persistência em banco de dados relacional e arquitetura organizada em camadas.

---

# 🎯 Objetivos

Este projeto foi desenvolvido para praticar:

- Desenvolvimento de APIs REST
- Spring Boot
- Spring Data JPA
- Persistência com MySQL
- Banco H2
- DTO Pattern
- ModelMapper
- Profiles do Spring
- Arquitetura em camadas

---

# 🏗 Arquitetura

```
Cliente

   │

HTTP Request

   │

Controller

   │

Service

   │

Repository

   │

Banco de Dados
```

---

# 📂 Estrutura

```
src
 └── main
      ├── configs
      ├── controllers
      ├── dtos
      ├── models
      ├── repositories
      ├── services
      └── profiles
```

---

# ✨ Funcionalidades

- ✅ Cadastrar contato
- ✅ Buscar contato por ID
- ✅ Listar todos os contatos
- ✅ Atualizar contato
- ✅ Excluir contato

---

# 🛠 Tecnologias

| Tecnologia | Finalidade |
|------------|------------|
| Java 11 | Linguagem |
| Spring Boot | Framework |
| Spring Web | API REST |
| Spring Data JPA | Persistência |
| Maven | Dependências |
| MySQL | Banco principal |
| H2 Database | Ambiente de testes |
| ModelMapper | Conversão DTO |
| Bean Validation | Validação |

---

# 💡 Boas práticas utilizadas

✔ Arquitetura em camadas

✔ DTO Pattern

✔ Repository Pattern

✔ Service Layer

✔ Profiles (dev e test)

✔ Injeção de Dependência

✔ ModelMapper

✔ Organização do código

---

# 📌 Endpoints

| Método | Endpoint | Descrição |
|---------|----------|-----------|
| GET | /contatos | Lista todos os contatos |
| GET | /contatos/{id} | Busca um contato |
| POST | /contatos | Cadastra um contato |
| PUT | /contatos/{id} | Atualiza um contato |
| DELETE | /contatos/{id} | Remove um contato |

---

# 📝 Exemplo de requisição

POST

```json
{
    "nome":"Norberto David",
    "telefone":"(11)99999-9999",
    "email":"norberto@email.com"
}
```

---

# ⚙ Como executar

Clone o projeto

```bash
git clone https://github.com/SEU-USUARIO/api-contato.git
```

Entre na pasta

```bash
cd api-contato
```

Execute

```bash
./mvnw spring-boot:run
```

ou

```bash
mvn spring-boot:run
```

---

# 🗄 Banco de Dados

A aplicação suporta:

- H2 Database (desenvolvimento e testes)
- MySQL (produção)

Os perfis podem ser alterados através do arquivo:

```
application.properties
```

Perfis disponíveis:

- dev
- test

---

# 📌 Melhorias futuras

- Swagger/OpenAPI
- Spring Security
- Autenticação JWT
- Docker
- Testes unitários
- Testes de integração
- Paginação
- Busca por nome
- Validação avançada dos campos

---

# 👨‍💻 Autor

## Norberto David

🎓 Estudante de Análise e Desenvolvimento de Sistemas

💻 Desenvolvedor Back-end em formação

### Tecnologias

- Java
- Spring Boot
- SQL
- APIs REST
- Git
- GitHub

---

Se este projeto foi útil ou interessante, deixe uma estrela ⭐ no repositório.
