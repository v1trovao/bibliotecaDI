## Requisitos Funcionais

| id   | Requisito          |
|------|--------------------|
| RF01 | Manter livros      |
| RF02 | Manter editores    |
| RF03 | Manter autores     |
| RF04 | Efetuar empréstimo |
| RF05 | Efetuar devolução  |
| RF06 | Manter Usuários    |
| RF07 | Notificar Usuários |
| RF08 | Suspender usuários |
| RF09 | Reservar Livros    |
| RF10 | Consultar Livros   |


### Regras de Negócio
1. Para cadastrar livro é necessário ter autor e editora já cadastrados.
2. O livro pode ser cadastrado via ISBN ou importado de arquivos
3. O usuário pode fazer empréstimo de até 3 livros
4. O usuário não pode fazer empréstimo de livro indisponível
5. Manter o estado de livro disponível e indisponível
6. O usuário só pode devolver se já possui livro emprestado
7. O empréstimo deve ter duração de 7 dias, podendo ser renovado se for o caso.
8. Se o usuário atrasar 1 dia, poderá ser levada uma suspensão de novos empréstimos, de acordo com os dias de atraso.
9. O bibliotecário deve ter acesso às movimentações de cada livro e os usuários que emprestaram.
10. O sistema deve permitir consulta por nome, ISBN, autor
11. O sistema deve possuir filtros de consulta por autor, ano, assunto, gênero e disponibilidade. 

### Requisitos Não-Funcionais
1. O sistema deve importar/exportar dados de forma persistente nos formatos .TXT, .JSON ou .CSV
3. O sistema deve manter o formato das datas e horários em DD-MM-YYYY e HH:MM:SS
4. O horário do sistema deve estar no padrão de Manaus UTC-04
5. O sistema deve criptografar os dados de login e acesso do usuário com SHA256
6. O sistema deve permitir o cadastro de livros por identificadores ISBN ou DOI
7. O catálogo deve estar disponibilizado no formato grade ou lista.

