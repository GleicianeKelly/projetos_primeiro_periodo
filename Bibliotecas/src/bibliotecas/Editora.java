package bibliotecas;
public class Editora extends Livros {
    
    private String nome;
    private String cidade;
    private String unidadeFederativa;
    private String email;
    private int telefones;

    public Editora(String nome, String cidade, String unidadeFederativa, String email, int telefones, String titulo, int codigoIsbn, int numeroEdicao, int anoEdicao, String editora, String autores) {
        super(titulo, codigoIsbn, numeroEdicao, anoEdicao, editora, autores);
        this.nome = nome;
        this.cidade = cidade;
        this.unidadeFederativa = unidadeFederativa;
        this.email = email;
        this.telefones = telefones;
    }

    
    
    
    
    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(String unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefones() {
        return telefones;
    }

    public void setTelefones(int telefones) {
        this.telefones = telefones;
    }
    
    
    
    
    
}
