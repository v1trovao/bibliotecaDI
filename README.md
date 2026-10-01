## Sistema de Biblioteca

### Sobre

O sistema é um projeto em Java com foco em práticas de programação orientada a objetos e separação de responsabilidades.
Ele permite gerenciar **livros, autores e editoras** por meio de funcionalidades CRUD (criar, ler, atualizar e deletar),
além de realizar operações de empréstimo, devolução e reserva de livros.

---

### 🏗️ Estrutura de Camadas

| Camada                 | Função                                                   | Exemplos de Classes                                                             |
|------------------------| -------------------------------------------------------- | ------------------------------------------------------------------------------- |
| **View** (interface)   | Interação com o usuário (menus e fluxos)                 | `InterfaceBiblioteca`, `MenuLivros`, `MenuAutores`, `MenuEditoras`              |
| **Business (Service)** | Regras de negócio, lógica de validação                   | `CatalogoLivros`, `CatalogoAutores`, `CatalogoEditoras`                         |
| **Data**               | Acesso, armazenamento e operações diretas sobre os dados | `OperacoesLivros`, `OperacoesAutores`, `OperacoesEditoras`, `OperacoesArquivos` |
| **Model**              | Representação dos dados                                  | `Livro`, `Autor`, `Editora`                                                     |

---

### 🔄 Funcionalidades

- **Gestão do Acervo**: Os bibliotecários podem cadastrar e gerenciar dados de 
livros, autores e editoras pela plataforma, com uso do ISBN.
- **Importar/Exportar Dados**: O sistema permite carregar dados em arquivos para facilitar cadastro e transferências.
- **Consultar livros**: Acesso ao acervo e informações sobre os livros e publicações.
- **Emprestar e Devolver Livros**: Usuários podem solicitar empréstimo e devolver livros diretamente no sistema
- **Reservar Livros**: Caso o livro esteja indisponível, o usuário consegue reservar e ser notificado caso o livro já esteja disponível

### ▶️ Como Executar

1. Importe o projeto para uma IDE como Eclipse ou IntelliJ
2. Compile o projeto
3. Rode a classe `InterfaceBiblioteca.java` (ou o `main()` principal, se estiver separado)
4. Siga as instruções exibidas nas janelas

---

### 📝 Tecnologias Utilizadas

- Java 8+
- Java Swing (`JOptionPane`)
- Organização em camadas MVC

---

### 🛠️ Melhorias Futuras (sugestões)

- Separar `model` de `data` com classes POJO (`Livro`, `Autor`, `Editora`)
- Substituir `JOptionPane` por uma interface gráfica mais rica (JavaFX ou Swing avançado)
- Adicionar persistência com banco de dados (ex: SQLite, MySQL)
- Implementar tratamento de exceções personalizado
- Permitir busca e filtros no catálogo
- Criar testes unitários com JUnit

---
