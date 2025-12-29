#  Biblioteca Java – Projeto MVC

Sistema de gerenciamento de biblioteca desenvolvido em **Java**, aplicando o padrão de arquitetura **MVC (Model-View-Controller)**.  
Permite cadastrar e listar usuários e livros através de uma **interface de console interativa**.  

---

## 🏗 Estrutura do Projeto

Biblioteca-Java-MVC/
│
├── src/
│   ├── model/
│   │   ├── User.java       # Classe que representa os usuários
│   │   └── Book.java       # Classe que representa os livros
│   │
│   ├── service/
│   │   └── Library.java    # Lógica de negócio: adicionar/listar usuários e livros
│   │
│   └── view/
│       └── Main.java       # Interface de console interativa
│
└── README.md               # Documentação do projeto


**Organização por pacotes:**  

| Pacote   | Função                                           |
|----------|-------------------------------------------------|
| model    | Armazena dados e atributos das entidades       |
| service  | Contém métodos de lógica de negócio            |
| view     | Interface com o usuário (menu interativo)      |

---

## ⚙️ Funcionalidades

- ✅ Cadastrar usuários com ID automático  
- ✅ Listar usuários cadastrados  
- ✅ Cadastrar livros (título e autor)  
- ✅ Listar livros cadastrados  
- ✅ Menu de opções interativo no console  

---

## 🛠 Tecnologias e Conceitos

- Linguagem: **Java**  
- Estruturas: `ArrayList`, `Scanner`  
- Conceitos de **POO**: classes, atributos privados, getters/setters, construtores  
- Padrão **MVC** aplicado na prática  

---

## 🚀 Como Executar

1. Clone o repositório:  
git clone https://github.com/seu-usuario/biblioteca-java-mvc.git
Abra o projeto no IntelliJ IDEA ou outro IDE Java

Compile e rode Main.java

Siga o menu de opções no console:

1 → Cadastrar usuário

2 → Listar usuários

3 → Cadastrar livro

4 → Listar livros

0 → Sair

