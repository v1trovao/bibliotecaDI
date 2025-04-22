package model;

public class Livro {
    private String isbn;
    private String titulo;
    private Autor autor;
    private Editora editora;

    public Livro(String titulo, Autor autor, Editora editora) {
        this.isbn = "";
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;

    }

    public Livro(String isbn, String titulo, Autor autor, Editora editora) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return titulo + ";" + autor.getNome() + ";" + editora.getNome();
    }
}
