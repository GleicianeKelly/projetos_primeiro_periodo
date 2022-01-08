package exercicioherançaaldo;
public class NavioContainer extends Navio{
    
    
    private int quantidadeGuindastes;
    private int quantidadeCamadas;

    public NavioContainer( int id, String nome, int quantidadePoroes, float capacidadeCarga, int quantidadeGuindastes, int quantidadeCamadas) {
        super(id, nome, quantidadePoroes, capacidadeCarga);
        this.quantidadeGuindastes = quantidadeGuindastes;
        this.quantidadeCamadas = quantidadeCamadas;
    }

    public int getQuantidadeGuindastes() {
        return quantidadeGuindastes;
    }

    public void setQuantidadeGuindastes(int quantidadeGuindastes) {
        this.quantidadeGuindastes = quantidadeGuindastes;
    }

    public int getQuantidadeCamadas() {
        return quantidadeCamadas;
    }

    public void setQuantidadeCamadas(int quantidadeCamadas) {
        this.quantidadeCamadas = quantidadeCamadas;
    }

    @Override
    public String toString() {
        return "\nId: " + this.getId() + 
                "\nNome: " + this.getNome() + 
                "\nQuantidade de porões: " + this.getQuantidadePoroes() + 
                "\nCapacidade Carga: " + this.getCapacidadeCarga() + 
                "\nQuantidade de guindastes: " + this.getQuantidadeGuindastes() +
                "\nQuantidade de camadas: " + this.getQuantidadeCamadas();
       
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
}
