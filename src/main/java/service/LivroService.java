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

}
