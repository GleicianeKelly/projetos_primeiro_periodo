package exercicioaldo;
public class FullContainer extends Navio{

    
    
    
    private int quantidadeEscotilhas;

    @Override
    public void status() {
        super.status(); 
        System.out.println("Quantidade de escotilhas: " + this.getQuantidadeEscotilhas());
    }

    public int getQuantidadeEscotilhas() {
        return quantidadeEscotilhas;
    }

    public void setQuantidadeEscotilhas(int quantidadeEscotilhas) {
        this.quantidadeEscotilhas = quantidadeEscotilhas;
    }

    
    
    
    
    
    public FullContainer(int id, String nome, int quantidadePoroes, 
            float capacidadeCarga, int quantidadeEscotilhas) {
        super(id, nome, quantidadePoroes, capacidadeCarga);
        this.quantidadeEscotilhas = quantidadeEscotilhas;
    }

   
    
    @Override
    public void iniciaCarregamento() {
         super.iniciaCarregamento();
    }

    @Override
    public void bloqueiaCarregamento() {
        super.bloqueiaCarregamento();
    }

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
