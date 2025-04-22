package model;

import java.util.ArrayList;

public class Editora {

    private String nome;
    private String cnpj;
    private ArrayList<Livro> livros;

    public Editora(String nome) {
        this.nome = nome;
        this.cnpj = "";
        this.livros = new ArrayList<>();
    }

    public Editora(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }
}
