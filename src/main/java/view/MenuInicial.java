package view;

import javax.swing.*;

public class MenuInicial {

    MenuLivros menuLivros = new MenuLivros();

    public void executar(){
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("\t << Biblioteca >> \n " +
                    "Informe o serviço: \n" +
                    "[1] Livros \n" +
                    "[2] Autores \n" +
                    "[3] Editoras \n" +
                    "[4] Arquivos \n" +
                    "[5] Sair \n"));

            if (opcao == 1) {
                menuLivros.exibir();
            } else if (opcao == 2) {
                // menuAutores.exibir();
            } else if (opcao == 3) {
                // menuEditoras.exibir();
            } else if (opcao == 4) {
                // menuArquivos.exibir();
            } else if (opcao == 5) {
                JOptionPane.showMessageDialog(null, "Aperte botão OK pra sair.");
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }

        } while (opcao != 5);
    }
}
