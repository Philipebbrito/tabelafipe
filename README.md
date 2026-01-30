# 🚗 Tabela FIPE — Consulta de Veículos (Spring Boot)

Aplicação desenvolvida em **Java 21 com Spring Boot**, focada no consumo da **API pública da Tabela FIPE**, permitindo a consulta de marcas, modelos e valores de veículos de forma interativa via terminal.

Este projeto foi desenvolvido com foco em **boas práticas de arquitetura**, **organização por responsabilidades** e **reutilização de código**, servindo como parte do meu **portfólio profissional** em Java.

---

## 🎯 Objetivo do Projeto

Demonstrar, na prática, conhecimentos em:

- Java moderno (Java 21)
- Spring Boot
- Consumo de APIs REST
- Desserialização de JSON
- Organização de projetos profissionais
- Programação orientada a objetos
- Boas práticas de código

---

## ⚙️ Funcionalidades

- Menu interativo via terminal
- Consulta por tipo de veículo:
    - 🚗 Carros
    - 🏍️ Motos
    - 🚛 Caminhões
- Consumo dinâmico da API da FIPE
- Conversão automática de JSON para objetos Java
- Estrutura modular e reutilizável

---

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.5.10**
- **Maven**
- **Jackson Databind**
- **API FIPE (Parallelum)**
- **IntelliJ IDEA**

---

## 🧱 Arquitetura e Organização

O projeto segue uma organização clara por responsabilidades:

src/main/java/br/com/alura/tabelafipe
│
├── principal
│ └── Principal.java # Lógica de interação com o usuário
│
├── service
│ ├── ConsumoApi.java # Cliente HTTP para consumo da API
│ ├── ConverteDados.java # Conversão de JSON para objetos
│ └── IConverteDados.java # Interface genérica de conversão
│
├── model
│ └── (Records / Modelos de domínio)
│
└── TabelaFipeApplication.java # Classe principal (CommandLineRunner)


Essa separação facilita:
- Manutenção
- Testes
- Evolução do projeto
- Reaproveitamento de código

---
🌐 API Utilizada

Tabela FIPE — API Pública

Base URL:

https://parallelum.com.br/fipe/api/v1/

📚 Conceitos Aplicados

Consumo de API REST com HttpClient

Desserialização de JSON com Jackson

Uso de CommandLineRunner

Interfaces e generics em Java

Organização por pacotes

Clean Code e boas práticas

Java moderno (records, var, etc.)

🚀 Próximos Passos (Evolução)

Listagem de modelos por marca

Consulta de anos do veículo

Exibição do valor FIPE

Validação de entradas do usuário

Refatoração com Streams e Lambdas

Tratamento avançado de erros

Possível versão com API REST (Web)

👨‍💻 Autor

Philipe Borges
Desenvolvedor Java | Spring Boot
Projeto desenvolvido como parte do meu portfólio profissional.

📌 Aberto a feedbacks e melhorias.