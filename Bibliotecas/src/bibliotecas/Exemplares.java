package bibliotecas;
public class Exemplares extends Livros{
    
    private int numeroExemplar;
    private int dataAquisicao;

    public Exemplares(String titulo, int codigoIsbn, int numeroEdicao, int anoEdicao, String editora, String autores) {
        super(titulo, codigoIsbn, numeroEdicao, anoEdicao, editora, autores);
    }

    
    
    public int getNumeroExemplar() {
        return numeroExemplar;
    }

    public void setNumeroExemplar(int numeroExemplar) {
        this.numeroExemplar = numeroExemplar;
    }

    public int getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(int dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
    
    
    
}
