# 📦 Criando minha primeira API REST com Java e Spring Boot

Quero destacar que esse é um projeto **totalmente independente** da minha parte e que pretendo utilizar o **máximo de funcionalidades possíveis**.

Minha base são **vídeos do YouTube** de como arquitetar e fazer um sistema CRUD.  
Esse é um projeto **sem uso de IA**, nem para fins de escrita como este próprio README. Estou me desafiando a **aprender e desenvolver os conceitos por conta própria**.

Além disso, estou **aprendendo sobre commits** e **uso de branches** também!

---

## 🧰 GIT – Comandos para inicializar o projeto

1. Navegar até meu projeto
2. `git init` (para inicializar)
3. `git add .` (para adicionar os arquivos para a chamada a ser commitada)
4. `git status` (para ver o status dos commits)
5. `git commit -m ""` (mensagem do commit)
6. `git branch -M "main"` (mudar o nome da minha branch)
7. `git remote add origin https://github.com/davithekid/todo-list.git` (enviando para esse repositório)
8. `git push -u origin main`

> Para criar nova branch:  
`git checkout -b "nome-da-nova-branch"`

---

## 📐 Padrão de inicialização do projeto

Estou começando a criar um **padrão pessoal** de como estruturar minhas APIs.  
É bastante comum no processo de criação de uma API eu acabar ficando confuso sobre o que fazer primeiro, então aqui defino **minhas prioridades** como se fosse um manual pessoal para me sentir mais confortável.

---

## 📁 Estrutura de Pastas

- `controller/`
- `entity/`
- `repository/`
- `service/`

---

## 🔹 Primeiro passo: Controller

- Começo estruturando o controller.
- Nele eu guiarei meu projeto com os métodos do CRUD.
- Crio o primeiro **GET** para testar as funcionalidades.

---

## 🔹 Segundo passo: Entity

- A Entity representa minhas **tabelas**.
- Faço os **setters e getters**.
- No meu caso, estou usando a entidade `Todolist`.

---

## 🔹 Terceiro passo: Repository

- Crio uma interface que **conversa com minha entidade**.
- Atribuo as funcionalidades de **CRUD** usando `JpaRepository`.

---

## 🔹 Quarto passo: `TodolistResponseDTO`

- DTO = **Data Transfer Object**
- É usado para envio e retorno das minhas requisições.
- Aplico meu **construtor** que retorna os dados que quero expor na API.
- Isso finaliza meu método GET com segurança e organização.

---

## 🚧 Em construção...

O projeto está em andamento e estou aplicando **conceitos práticos de orientação a objetos**, estrutura MVC e boas práticas com Spring Boot!

