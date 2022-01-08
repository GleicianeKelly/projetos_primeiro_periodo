package bibliotecas;
public class Livros {
    
    private String titulo;
    private int codigoIsbn;
    private int numeroEdicao;
    private int anoEdicao;
    private String editora;
    private String autores;
    
    

    public Livros(String titulo, int codigoIsbn, int numeroEdicao, int anoEdicao, String editora, String autores) {
        this.titulo = titulo;
        this.codigoIsbn = codigoIsbn;
        this.numeroEdicao = numeroEdicao;
        this.anoEdicao = anoEdicao;
        this.editora = editora;
        this.autores = autores;
    }

    

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigoIsbn() {
        return codigoIsbn;
    }

    public void setCodigoIsbn(int codigoIsbn) {
        this.codigoIsbn = codigoIsbn;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public int getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(int anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }
    
    
    
    public void status(){
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Código ISBN: " + this.getCodigoIsbn());
        System.out.println("Número edição: " + this.getNumeroEdicao());
        System.out.println("Ano da edição: " + this.getAnoEdicao());
        System.out.println("Editora: " + this.getEditora());
        System.out.println("Autores: " + this.getAutores());
        
    }
    
    
    
    
    
    
    
    
}
