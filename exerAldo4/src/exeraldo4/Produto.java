package exeraldo4;
public class Produto {
    
    
    private int codigo;
    private String descricao;
    private float precoCusto;
    private int estoque = 0;

    @Override //Passo todas informações nesse método para chamar no main
    public String toString() {
        return "\nCódigo do produto: " + this.codigo + "\nDescrição do produto: "
                + "" + this.descricao + "\nPreço de custo: " + this.precoCusto +
                "\nEstoque: " + this.estoque;
               
    }

    
    public Produto(int codigo, String descricao, float precoCusto) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        
    }

    public Produto(int estoque) {
        this.estoque = estoque;
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    
    public void producao(int quantidadeProducao){
         this.estoque += quantidadeProducao;
    }
    
    public void saida(int quantidade){
       this.estoque = quantidade;
    }
    
    
}
