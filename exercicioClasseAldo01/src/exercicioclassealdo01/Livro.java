package exercicioclassealdo01;

import java.util.List;

public class Livro {
    
    
    private int codigo;
    private String titulo;
    private String ISBN;
    private Editora editora;
    private List<Autor>autores;

    public Livro(int codigo, String titulo, String ISBN, Editora editora, List<Autor> autores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.editora = editora;
        this.autores = new ArrayList<Autor>();
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public List<Autor> getAutor() {
        return autor;
    }

    public void setAutor(List<Autor> autor) {
        this.autores = autor;
    }
    
    
    public void incluiAutor(Autor autor){
        this.autores.add(autor);
    }
    
    public void removeAutor(Autor autor){
        this.autores.remove(autor);
    }
    
    
    
    
    
    
}
