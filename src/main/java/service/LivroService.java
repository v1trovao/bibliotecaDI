package service;

import model.Autor;
import model.Editora;
import model.Livro;

import java.util.ArrayList;

public class LivroService {

    // Teste com array em memória
    private ArrayList<Livro> livros;

    public LivroService() {
        this.livros = new ArrayList<>();
    }

    public ArrayList<Livro> getLivros() {
        return this.livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    // Cadastrar livros com os parâmetros do construtor, ou o objeto diretamente
    public void cadastrarLivro(String titulo, String nomeAutor, String nomeEditora) {
        Autor autor = new Autor(nomeAutor);
        Editora editora = new Editora(nomeEditora);
        Livro livro = new Livro(titulo, autor, editora);

        // Ambos autor e editora possuem metodo de adicionarLivro, p manter associação com livro
        autor.adicionarLivro(livro);
        editora.adicionarLivro(livro);

        // Salva em memória
        this.livros.add(livro);
    }

    // Função que retorna uma string contendo os livros cadastrados em memória
    public String listarLivros() {
        if (!this.livros.isEmpty()) {
            StringBuilder sb = new StringBuilder("Lista de Livros \n");
            for (Livro livro : this.livros) {
                sb.append(livro.toString());
                sb.append("\n");
            }
            return sb.toString();
        } else {
            return "Sem dados...";
        }
    }

    // In progress
    public void updateLivro(){
        return;
    }

    // Função que recebe um título do livro e, se existe, remove da lista
    public String removerLivro(String titulo){
        Livro livroAtual = buscarLivroporTitulo(titulo);
        if (livroAtual != null){
            this.livros.remove(livroAtual);
            return "Livro removido com sucesso!";
        } else {
            return "Livro não encontrado";
        }
    }

    // Função que faz a busca pelo título do livro, retorna o objeto encontrado ou nulo
    // Verificar o uso de stream aqui
    public Livro buscarLivroporTitulo(String livroTitulo) {
        for (Livro livro : this.livros) {
            if (livro.getTitulo().equals(livroTitulo)) {
                return livro;
            }
        }
        return null;
    }
}
