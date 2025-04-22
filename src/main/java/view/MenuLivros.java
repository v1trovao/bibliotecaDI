package view;

import service.LivroService;

import javax.swing.*;

public class MenuLivros {

    LivroService service = new LivroService();

    public void exibir() {
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("\t << Livros >> \n " +
                    "Escolha a operação: \n" +
                    "[1] Cadastrar Livro \n" +
                    "[2] Atualizar Livro \n" +
                    "[3] Remover Livro \n" +
                    "[4] Listar Livros \n" +
                    "[5] Emprestar Livro \n" +
                    "[6] Devolver Livro \n" +
                    "[7] Reservar Livro \n" +
                    "[8] Cancelar Reserva \n" +
                    "[9] Voltar \n"));

            switch (opcao) {
                case 1:
                    String titulo = JOptionPane.showInputDialog("Digite o título do livro:");
                    String nomeAutor = JOptionPane.showInputDialog("Digite o nome do autor:");
                    String nomeEditora = JOptionPane.showInputDialog("Digite o nome da editora:");
                    service.cadastrarLivro(titulo, nomeAutor, nomeEditora);
                    JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
                    // OperacoesLivros.cadastrarLivro(catalogoLivros, catalogoAutores, catalogoEditoras);
                    break;
                case 2:
                    // OperacoesLivros.atualizarLivro(catalogoLivros, catalogoAutores, catalogoEditoras);
                    break;
                case 3:
                    // OperacoesLivros.removerLivro(catalogoLivros);
                    break;
                case 4:
                    // OperacoesLivros.listarLivros(catalogoLivros);
                    break;
                case 5:
                    // OperacoesLivros.emprestarLivro(catalogoLivros);
                    break;
                case 6:
                    // OperacoesLivros.devolverLivro(catalogoLivros);
                    break;
                case 7:
                    // OperacoesLivros.reservarLivro(catalogoLivros);
                    break;
                case 8:
                    // OperacoesLivros.cancelarReserva(catalogoLivros);
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        } while (opcao != 9);
    }
}
