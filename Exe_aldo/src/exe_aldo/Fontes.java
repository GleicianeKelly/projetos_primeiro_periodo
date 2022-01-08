package exe_aldo;
public class Fontes {
    
    private String cadastro;
    private float precoCusto;
    private int codigoProduto;
    private int quantProducao;
    private int quantVendas;

    public Fontes(String cadastro, float precoCusto, int codigoProduto, int quantProducao, int quantVendas) {
        this.cadastro = cadastro;
        this.precoCusto = precoCusto;
        this.codigoProduto = codigoProduto;
        this.quantProducao = quantProducao;
        this.quantVendas = quantVendas;
    }

   
    
    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getQuantProducao() {
        return quantProducao;
    }

    public void setQuantProducao(int quantProducao) {
        this.quantProducao = quantProducao;
    }

    public int getQuantVendas() {
        return quantVendas;
    }

    public void setQuantVendas(int quantVendas) {
        this.quantVendas = quantVendas;
    }
    
    

   
    public void estoque(){
        if(this.getQuantProducao() > 0){
            System.out.println("A quantidade de produção é de: " + 
                    this.getQuantProducao());
            System.out.println("A quantidade de vendas foi de: " + 
                    this.getQuantVendas());
            System.out.println("O estoque está com " + 
                    (this.getQuantProducao() - this.getQuantVendas()));
        }
        else{
            System.out.println("A quantidade de produção e de estoque é de: " + 
                    this.getQuantProducao());
            
        }
    }
    
    public void status(){
        System.out.println("Nome do cadastro: " + this.getCadastro());
        System.out.println("Preço de custo: " + this.getPrecoCusto());
        System.out.println("Código do produto: " + this.getCodigoProduto());
        estoque();
}
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
