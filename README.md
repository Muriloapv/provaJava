# CRUD Pessoa e Trabalho - Spring Boot + JPA + H2

Este projeto é um CRUD completo utilizando Spring Boot, JPA, banco de dados em memória H2 e DTOs. Ele possui um relacionamento **1:1 entre Pessoa e Trabalho**, com os dois CRUDs separados e rotas RESTful.

---

## 📁 Estrutura

```
com.example.pessoa_trabalho
├── controller
├── dto
│   ├── pessoa
│   └── trabalho
├── model
├── repository
├── services
└── PessoaTrabalhoApplication.java
```

---

## 🚀 Como rodar o projeto

1. Clone o projeto:
```bash
git clone https://github.com/rodrigopinesso/crud-trabalho-pessoa-java.git
cd crud-trabalho-pessoa-java
```

2. Importar na sua IDE (IntelliJ, VS Code, Eclipse)

3. Rodar a classe `PessoaTrabalhoApplication.java`

4. Acesse o H2 console (opcional):
```
http://localhost:8080/h2-console
```
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: *(em branco)*

---

## 📦 Como subir para o GitHub

Se você ainda não subiu o código para o repositório:

```bash
git init
git remote add origin https://github.com/rodrigopinesso/crud-trabalho-pessoa-java.git
git add .
git commit -m "Subindo projeto CRUD Pessoa e Trabalho com Spring Boot"
git branch -M main
git push -u origin main
```

---

## 🔧 Rotas da API

### 📌 TRABALHO

#### ▶️ Criar trabalho
`POST /trabalhos`
```json
{
  "cargo": "Desenvolvedor Java",
  "salario": 8500.00
}
```

#### 📋 Listar trabalhos
`GET /trabalhos`

#### 🔍 Buscar trabalho por ID
`GET /trabalhos/{id}`

#### ❌ Deletar trabalho
`DELETE /trabalhos/{id}`

> ⚠️ Não é possível deletar um trabalho se ele estiver vinculado a uma pessoa

---

### 👤 PESSOA

#### ▶️ Criar pessoa
`POST /pessoas`
```json
{
  "nome": "Rodrigo",
  "idade": 27,
  "trabalhoId": 1
}
```

#### 📋 Listar pessoas
`GET /pessoas`

#### 🔍 Buscar pessoa por ID
`GET /pessoas/{id}`

#### ❌ Deletar pessoa
`DELETE /pessoas/{id}`

---

## 🛠 Tecnologias utilizadas
- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database
- Maven
- DTOs (sem Lombok)
